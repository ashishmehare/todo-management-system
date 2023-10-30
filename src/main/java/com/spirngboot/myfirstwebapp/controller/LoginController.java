package com.spirngboot.myfirstwebapp.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class LoginController {
	
	
	//private Logger logger=LoggerFactory.getLogger(LoginController.class);
	
	//requestparam=>passed the request from browser
	//Model- print in jsp that we write in controller

	@Autowired
	private AuthenticationService authenticationService;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String gotwelcomePage(ModelMap model) {
		model.put("name", getLoggedinUsername());
		return "welcome";
	}
	
	private String getLoggedinUsername() {
		Authentication authentication = 
				SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	
	

}
	
