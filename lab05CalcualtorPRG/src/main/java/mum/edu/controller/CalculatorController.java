package mum.edu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mum.edu.domain.Calculator;
import mum.edu.validator.CalculatorValidator;

@Controller
public class CalculatorController{
	@Autowired	
	 CalculatorValidator calcValidator;
		
	@RequestMapping(value={"/","/calc_input"})
	 	public String inputProduct(HttpServletRequest request, 
				HttpServletResponse response) {
		System.out.println("inside input");
			return "calculatorinput";
		}

	@RequestMapping(value="/calculate")
		public String Calculate(Calculator calc, HttpServletRequest request, 
				HttpServletResponse response,RedirectAttributes redirectAttributes) {
		System.out.println("inside calc");
	         List<String> errors = calcValidator.validate(calc);
	        if (errors.isEmpty()) {
	        	System.out.println("inside calculating");
	             int addresult=calc.getInputadd1()+calc.getInputadd2();
	             int mulresult=calc.getMul1()*calc.getMul2();
	             calc.setResultadd(addresult);
	             calc.setResultMul(mulresult);
	             System.out.println(calc.getInputadd1());
	             redirectAttributes.addFlashAttribute("form",calc);
	       	  // Returned as a parameter on GET URL
	       	  //redirectAttributes.addAttribute("name", newProduct.getName());
	       	  
	        	  return "redirect:result";

	           // request.setAttribute("form", calc);
	           // return "calculatorResult";
	        } else {
	        	System.out.println("inside error");
	            // store errors and product in a scope variable for the view
	        	redirectAttributes.addFlashAttribute("form",calc);
	        	redirectAttributes.addFlashAttribute("errors",errors);
		       	  // Returned as a parameter on GET URL
		       	  //redirectAttributes.addAttribute("name", newProduct.getName());
		       	  
		        	  return "redirect:result";
	            //request.setAttribute("errors", errors);
	           // request.setAttribute("form", calc);
	            //return "calculatorResult";
	        }
	 	}
	
	@RequestMapping(value="/result", method = RequestMethod.GET)
    public String results( Model model) {
 
        System.out.println("PRODUCT POST-REDIRECT");
        
         // PRG flash Attribute "product" is in the Model and
	    // is displayed on  ProductDetailspage
        return "calculatorResult";
    }
	
}
