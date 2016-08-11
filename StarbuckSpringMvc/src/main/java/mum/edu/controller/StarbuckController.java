package mum.edu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mum.edu.data.DataFacade;

@Controller
public class StarbuckController {
	@Autowired
	DataFacade data;
	
	@RequestMapping(value={"/","/starbuck"})
 	public String logininput(HttpServletRequest request, 
			HttpServletResponse response) {
		System.out.println("inside input");
			return "login";	
		
	}
	@RequestMapping(value={"/","/login"})
 	public String login(HttpServletRequest request, 
			HttpServletResponse response) {
		System.out.println("inside input");
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		String expectedPassword = data.findPassword(name );
		
		if(expectedPassword == null || !expectedPassword.equals(password)) {
			return "login";
		} 
		else {
			return "back";
		}
	//	
		
	}
	
	@RequestMapping(value={"/display"})
 	public String display(HttpServletRequest request, 
			HttpServletResponse response) {
		System.out.println("display");
		return "display";
	}
	@RequestMapping(value={"/advice"})
 	public String advice(HttpServletRequest request, 
			HttpServletResponse response) {
		System.out.println("display");
		String roast = request.getParameter("roast");	
		List<String> advice = data.getAdvice(roast);
		//String adviceOutput = prepareAdviceOutput(roast, advice);
		request.setAttribute("list", advice);
		return "advice";
	}
}
