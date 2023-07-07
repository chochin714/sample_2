package com.starsoft1.bms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.starsoft1.bms.model.CasesModel;
import com.starsoft1.bms.model.ListDataModel;

@Controller
@SessionAttributes("casesModel")
public class CaseController {
	@ModelAttribute("casesModel")
	public CasesModel setupCasesModel() {
		return new CasesModel();
	}
	
	private List<ListDataModel> getLevelList(int start, int end){
		List<ListDataModel> numberList = new ArrayList<ListDataModel>();
		numberList.add(new ListDataModel(null,"0"));
		String[] levelName = {"レベル1(1年未満)","レベル2(1～2年)","レベル3(2～4年)","レベル4","レベル5(10年以上)"};
		for(int i=start; i<=end;i++) {
				numberList.add(new ListDataModel(levelName[i-1],Integer.toString(i)));
		}
		return numberList;
	}
	
	@GetMapping("/caseRegistration")
	public String caseRegist(Model model) {
		model.addAttribute("dev_lang_lv", getLevelList(1,5));
		return "caseRegistration";
	}
	
	@PostMapping("/caseRegistration")
	public String caseRegister(@ModelAttribute CasesModel casesModel, Model model) {
		return "caseConfirm";
	}
	
	@GetMapping("/complete")
	public String toComplete(Model model, SessionStatus status) {
		status.setComplete();
		
		return "caseComplete";
	}
}
