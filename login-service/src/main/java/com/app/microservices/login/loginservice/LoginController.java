package com.app.microservices.login.loginservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	
	@Autowired
	private Environment environment; 
	
	@GetMapping("/login/{username}/{password}")
	public LoginData getLoginData(@PathVariable String username, @PathVariable String password){
		
		LoginData loginData = new LoginData(10L,username,password);
		loginData.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return loginData;
		
	}

}
