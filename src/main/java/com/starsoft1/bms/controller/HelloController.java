package com.starsoft1.bms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.starsoft1.bms.model.CasesModel;

@Controller
public class HelloController {
	@GetMapping("/hello")
	public String hello(Model model, 
			@RequestParam(value="message",required=false, defaultValue="World")String message) {
		model.addAttribute("message", "Hello" + message);
		model.addAttribute("casesModel", new CasesModel());
		return "index";
	}
}
