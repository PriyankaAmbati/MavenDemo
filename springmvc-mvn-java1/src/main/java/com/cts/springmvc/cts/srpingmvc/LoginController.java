package com.cts.springmvc.cts.srpingmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	
	@RequestMapping(value="/signin",method=RequestMethod.GET)
	public String doLogin(ModelMap map) {
		map.put("test","this is response from LoginController");
		return "login";
}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String doRegister(User user,ModelMap map) {
		map.put("mobile",user.getMobile());
		map.put("mail",user.getMail());
		return "login";
		
		
	
	}	

}
