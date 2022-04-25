package com.mid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class mainController {
	
	@ResponseBody
	public String getMain() {
		return "main";
	}
	
	@ResponseBody
	@GetMapping("/mm")
	public String getTest() {
		return "test";
	}
	
}
