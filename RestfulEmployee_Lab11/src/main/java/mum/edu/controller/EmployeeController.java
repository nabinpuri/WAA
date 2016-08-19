package mum.edu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import mum.edu.domain.Employee;
 
@Controller
public class EmployeeController {
	
	 @RequestMapping(value = {"/","/addEmployee",}, method = RequestMethod.GET)
	    public String addNewEmployee(Model model) {
	        return "employee";
	    }
	 // @Valid - but NO BindResult! an exception will be thrown...
    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public @ResponseBody Employee saveEmployee( @Valid  @RequestBody Employee employee) {
         return employee;
    }

 
	
	
}
