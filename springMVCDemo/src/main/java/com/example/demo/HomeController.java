package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
		User user = new User(101,"sohail","guntur");
		model.addAttribute("userDetails",user);
		return "home";
	}
	
	@RequestMapping("/login")
	public String loginMapper() {
		return "login";
	}
}
