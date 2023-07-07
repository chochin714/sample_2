package com.starsoft1.bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.starsoft1.bms.dao.CasesDao;
import com.starsoft1.bms.entity.Cases;
import com.starsoft1.bms.model.CasesModel;

@Controller
public class CaseApprovalController {
	@Autowired
	CasesDao casesDao;
	@GetMapping("/caseApproval")
	public String toApproval(Model model, int caseId) {
		Cases cases = casesDao.getAnCases(caseId);
		model.addAttribute("casesModel", cases);
		return "caseApproval";
	}
	
	@PostMapping(value="/caseApproval", params="dismiss")
	public String dismiss(@ModelAttribute CasesModel casesModel, Model model,int caseId) {
		int numberOfRow = casesDao.dismiss(caseId);
		if(numberOfRow==0) {
			return "redirect:/caseApproval";
		}
		return "redirect:/complete";
	}
	@PostMapping(value="/caseApproval", params="approval")
	public String approval(@ModelAttribute CasesModel casesModel, Model model, int caseId) {
		int numberOfRow = casesDao.approval(caseId);
		if(numberOfRow==0) {
			return "redirect:/caseApproval";
		}
		return "redirect:/complete";
	}
}
