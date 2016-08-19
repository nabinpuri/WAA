package app06b.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import app06b.domain.Employee;

@org.springframework.stereotype.Controller

public class EmployeeController {
	
	private static final Log logger = LogFactory.getLog(EmployeeController.class);
		
	@RequestMapping(value={"/","employee_input"})
	public String inputEmployee(@ModelAttribute("employee") Employee employee) {
		return "EmployeeForm";
	}

	@RequestMapping(value="/employee_save")
	public String saveEmployee(@Valid @ModelAttribute("employee")  Employee employee, BindingResult bindingResult, HttpServletRequest request
			,Model model) {
 		
		if (bindingResult.hasErrors()) {
			return "EmployeeForm";
		}
		
		 String[] suppressedFields = bindingResult.getSuppressedFields();
		 if (suppressedFields.length > 0) {
		 throw new RuntimeException("Attempt to bind fields that haven't been allowed in initBinder(): "
		 + StringUtils.addStringToArray(suppressedFields, ", "));
		 }
		 
		 MultipartFile Image = employee.getEmployeeImage();
			String rootDirectory = request.getSession().getServletContext().getRealPath("/");
				
			//isEmpty means file exists BUT NO Content
				if (Image!=null && !Image.isEmpty()) {
			       try {
			    	   Image.transferTo(new File(rootDirectory+"\\resources\\images\\"+employee.getId()+ ".jpg"));
			    	   System.out.println(rootDirectory+"\\resources\\images\\"+employee.getId()+ ".jpg");
			       } catch (Exception e) {
					throw new RuntimeException("image cannot be saved", e);
			   }
			   }
		
		
		// save product here
		
	    model.addAttribute("employee", employee);
	    
	   
		return "EmployeeDetails";
	}
	
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
 //       binder.setDisallowedFields(new String[]{"firstName"});
      }
}
