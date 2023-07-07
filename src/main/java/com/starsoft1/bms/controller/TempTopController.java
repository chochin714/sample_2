package com.starsoft1.bms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempTopController {
	@GetMapping("tempTop")
	public String tempTop(Model model) {
		return "tempTop";
	}
}
