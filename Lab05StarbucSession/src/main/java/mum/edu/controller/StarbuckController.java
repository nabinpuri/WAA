package mum.edu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import mum.edu.data.DataFacade;

@Controller
@SessionAttributes({"user"}) 
public class StarbuckController {
	@Autowired
	DataFacade data;
	
	@RequestMapping(value={"/","/starbuck"})
 	public String start(HttpServletRequest request, 
			HttpServletResponse response,Model model) {
		System.out.println("inside stat");
		String user=(String) model.asMap().get("user");
		if(user!=null){
			return "redirect:/display";
		}
		else{
			return "redirect:/logininput";
		}
			
		
	}
	
	@RequestMapping(value={"/logininput"})
 	public String logininput(HttpServletRequest request, 
			HttpServletResponse response) {
		System.out.println("inside input");
			return "login";	
		
	}
	@RequestMapping(value={"/login"})
 	public String login(HttpServletRequest request, 
			HttpServletResponse response,Model model) {
		System.out.println("inside input");
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		String expectedPassword = data.findPassword(name );
		
		if(expectedPassword == null || !expectedPassword.equals(password)) {
			
			return "login";
		} 
		else {
			model.addAttribute( "user",name); 
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
	
	@RequestMapping(value={"/logout"})
 	public String logout(HttpServletRequest request, 
			HttpServletResponse response,SessionStatus status) {
		
		status.setComplete();
		return "login";
	}
}
