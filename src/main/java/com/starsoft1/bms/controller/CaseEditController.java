package com.starsoft1.bms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.starsoft1.bms.dao.CasesDao;
import com.starsoft1.bms.entity.Cases;
import com.starsoft1.bms.model.CasesModel;
import com.starsoft1.bms.model.ListDataModel;

@Controller
public class CaseEditController {
	@Autowired
	private CasesDao casesDao;
	
	private List<ListDataModel> getLevelList(int start, int end){
		List<ListDataModel> numberList = new ArrayList<ListDataModel>();
		String[] levelName = {"レベル1","レベル2","レベル3","レベル4","レベル5"};
		for(int i=start; i<=end;i++) {
				numberList.add(new ListDataModel(levelName[i-1],Integer.toString(i)));
		}
		return numberList;
	}
	@GetMapping("/caseEdit")
	public String toEdit(Model model) {
		model.addAttribute("dev_lang_lv", getLevelList(1,5));
		Cases cases = casesDao.getAnCases(1);
		model.addAttribute("casesModel", cases);
		return "caseEdit";
	}
	
	@PostMapping("/caseEdit")
	public String update(@ModelAttribute CasesModel casesModel, Model model) {
		Cases cases = new Cases();
		cases.setCaseId(casesModel.getCaseId());
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
		int numberOfRow = casesDao.update(cases);
		if(numberOfRow==0) {
			return "redirect:/caseEdit";
		}
		return "redirect:/complete";
	}
}
