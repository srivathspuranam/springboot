package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartM {
	@GetMapping
	public String Model() {
		return "Model.jsp";
	}
}
