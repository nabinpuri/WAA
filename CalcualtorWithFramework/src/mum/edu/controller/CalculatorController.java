package mum.edu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.edu.domain.Calculator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.validator.CalculatorValidator;

@Controller
public class CalculatorController implements mum.edu.framework.controller.Controller {
	@AutoWired	
	 CalculatorValidator calcValidator;
		
	@RequestMapping(value={"/","/calc_input"})
	 	public String inputProduct(HttpServletRequest request, 
				HttpServletResponse response) {
		System.out.println("inside input");
			return "/WEB-INF/jsp/calculatorinput.jsp";
		}

	@RequestMapping(value="/calculate")
		public String Calculate(Calculator calc, HttpServletRequest request, 
				HttpServletResponse response) {
		System.out.println("inside calc");
	         List<String> errors = calcValidator.validate(calc);
	        if (errors.isEmpty()) {
	        	System.out.println("inside calculating");
	             int addresult=calc.getInputadd1()+calc.getInputadd2();
	             int mulresult=calc.getMul1()*calc.getMul2();
	             calc.setResultadd(addresult);
	             calc.setResultMul(mulresult);
	             System.out.println(calc.getInputadd1());
	            request.setAttribute("form", calc);
	            return "/WEB-INF/jsp/calculatorResult.jsp";
	        } else {
	        	System.out.println("inside error");
	            // store errors and product in a scope variable for the view
	            request.setAttribute("errors", errors);
	            request.setAttribute("form", calc);
	            return "/WEB-INF/jsp/calculatorResult.jsp";
	        }
	 	}
	
}
