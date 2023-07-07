package com.starsoft1.bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.starsoft1.bms.dao.CasesDao;
import com.starsoft1.bms.entity.Cases;
import com.starsoft1.bms.model.CasesModel;

@Controller
public class CaseDetailController {
	@Autowired
	CasesDao casesDao;
	
	@GetMapping("/caseDetail")
	public String toDetail(@ModelAttribute CasesModel casesModel, Model model, int id) {
		Cases cases = casesDao.getAnCases(id);
		model.addAttribute("casesModel", cases);
		return "caseDetail";
	}
}
