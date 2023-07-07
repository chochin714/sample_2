package com.starsoft1.bms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.starsoft1.bms.dao.CasesDao;
import com.starsoft1.bms.entity.Cases;
import com.starsoft1.bms.model.CasesModel;

@Controller
public class CaseUnapprovedController {
	@Autowired
	private CasesDao casesDao;
	
	@GetMapping("/caseUnapproved")
	public String caseSearch(@ModelAttribute CasesModel casesModel, Model model) {
		List<Cases> casesList = casesDao.getUnapproved();
		model.addAttribute("casesList", casesList);
		
		return "caseUnapproved";
	}
}
