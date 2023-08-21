package com.createiq.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.entity.UserBean;
import com.createiq.service.UserService;

@RestController
public class HomeController {
	
	@Autowired
	private UserService  userService;
	  
	@GetMapping("/hello")
	public String hello() {
		return "hello this is HELLO Page";
		
	}
	// Accessed by all with out login
		@GetMapping("/public")
		public String all() {
			return "public";
		}

		// Accessed by logged in user who has ROLE USER
		@GetMapping("/user")
		public String user() {
			return "User";
		}

		// Accessed by logged in user who has ROLE ADMIN
		@GetMapping("/admin")
		public String admin() {
			return "admin";
		}
		
		@PostMapping("/signup")
		public UserBean signUp(@RequestBody UserBean userBean) {
			
			UserBean ub=userService.save(userBean);
			ub.setPassword("**************");
			
			return ub;
		}
 
}
 