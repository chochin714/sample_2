package com.starsoft1.bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.starsoft1.bms.dao.CasesDao;
import com.starsoft1.bms.entity.Cases;
import com.starsoft1.bms.model.CasesModel;

@Controller
@SessionAttributes("casesModel")
public class CaseConfirmController {
	@Autowired
	private CasesDao casesDao;
	
	@GetMapping("/caseConfirm")
	public String toConfirm(@ModelAttribute CasesModel casesModel, Model model) {
		return "caseConfirm";
	}
	
	@PostMapping(value="/caseConfirm", params="back")
	public String back(@ModelAttribute CasesModel casesModel, Model model) {
			return "redirect:/caseRegistration";
	}
	@PostMapping(value="/caseConfirm", params="forward")
	public String toComplete(@ModelAttribute CasesModel casesModel, Model model){
		Cases cases = new Cases();
		cases.setCaseName(casesModel.getCaseName());
		cases.setCaseDetail(casesModel.getCaseDetail());
		cases.setPlace(casesModel.getPlace());
		cases.setStartDate(casesModel.getStartDate());
		cases.setEndDate(casesModel.getEndDate());
		cases.setResp_process(casesModel.getResp_process());
		cases.setDev_lang1(casesModel.getDev_lang1());
		cases.setDev_lang1_lv(casesModel.getDev_lang1_lv());
		cases.setDev_lang2(casesModel.getDev_lang2());
		cases.setDev_lang2_lv(casesModel.getDev_lang2_lv());
		cases.setDev_lang3(casesModel.getDev_lang3());
		cases.setDev_lang3_lv(casesModel.getDev_lang3_lv());
		cases.setDev_lang4(casesModel.getDev_lang4());
		cases.setDev_lang4_lv(casesModel.getDev_lang4_lv());
		cases.setDev_lang5(casesModel.getDev_lang5());
		cases.setDev_lang5_lv(casesModel.getDev_lang5_lv());
		cases.setSkill1(casesModel.getSkill1());
		cases.setSkill1_lv(casesModel.getSkill1_lv());
		cases.setSkill2(casesModel.getSkill2());
		cases.setSkill2_lv(casesModel.getSkill2_lv());
		cases.setSkill3(casesModel.getSkill3());
		cases.setSkill3_lv(casesModel.getSkill3_lv());
		cases.setSkill4(casesModel.getSkill4());
		cases.setSkill4_lv(casesModel.getSkill4_lv());
		cases.setSkill5(casesModel.getSkill5());
		cases.setSkill5_lv(casesModel.getSkill5_lv());
		cases.setSkill_other(casesModel.getSkill_other());
		cases.setDB(casesModel.getDB());
		cases.setEnv(casesModel.getEnv());
		cases.setNationality(casesModel.getNationality());
		cases.setAge(casesModel.getAge());
		cases.setChar_like(casesModel.getChar_like());
		cases.setNumber_of_people(casesModel.getNumber_of_people());
		cases.setNumber_of_interview(casesModel.getNumber_of_interview());
		int numberOfRow = casesDao.caseInsert(cases);
		if(numberOfRow==0) {
			return "redirect:/caseRegistration";
		}
		return "redirect:/complete";
	}
}
