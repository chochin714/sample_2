package com.starsoft1.bms.entity;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Cases implements Serializable{
	private int caseId;
	private int userId;
	private String caseName;
	private String caseDetail;
	private String place;
	private String startDate;
	private String endDate;
	private String resp_process;
	private String dev_lang1;
	private int dev_lang1_lv;
	private String dev_lang2;
	private int dev_lang2_lv;
	private String dev_lang3;
	private int dev_lang3_lv;
	private String dev_lang4;
	private int dev_lang4_lv;
	private String dev_lang5;
	private int dev_lang5_lv;
	private String skill1;
	private int skill1_lv;
	private String skill2;
	private int skill2_lv;
	private String skill3;
	private int skill3_lv;
	private String skill4;
	private int skill4_lv;
	private String skill5;
	private int skill5_lv;
	private String skill_other;
	private String DB;
	private String env;
	private String nationality;
	private int age;
	private String char_like;
	private int number_of_people;
	private int number_of_interview;
	private boolean approval;
	
	public int getCaseId() {
		return caseId;
	}

	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCaseName() {
		return caseName;
	}
	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}
	public String getCaseDetail() {
		return caseDetail;
	}
	public void setCaseDetail(String caseDetail) {
		this.caseDetail = caseDetail;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate){
		this.startDate = startDate;
	}
	public void setStartDate(Date startDate) {
		String strStartDate = new SimpleDateFormat("yyyy-MM-dd").format(startDate);
		this.startDate = strStartDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate){
		this.endDate = endDate;
	}
	public void setEndDate(Date endDate) {
		String strEndDate = new SimpleDateFormat("yyyy-MM-dd").format(endDate);
		this.endDate = strEndDate;
	}
	public String getResp_process() {
		return resp_process;
	}
	public void setResp_process(String resp_process) {
		this.resp_process = resp_process;
	}
	public String getDev_lang1() {
		return dev_lang1;
	}
	public void setDev_lang1(String dev_lang1) {
		this.dev_lang1 = dev_lang1;
	}
	public int getDev_lang1_lv() {
		return dev_lang1_lv;
	}
	public void setDev_lang1_lv(int dev_lang1_lv) {
		this.dev_lang1_lv = dev_lang1_lv;
	}
	public String getDev_lang2() {
		return dev_lang2;
	}
	public void setDev_lang2(String dev_lang2) {
		this.dev_lang2 = dev_lang2;
	}
	public int getDev_lang2_lv() {
		return dev_lang2_lv;
	}
	public void setDev_lang2_lv(int dev_lang2_lv) {
		this.dev_lang2_lv = dev_lang2_lv;
	}
	public String getDev_lang3() {
		return dev_lang3;
	}
	public void setDev_lang3(String dev_lang3) {
		this.dev_lang3 = dev_lang3;
	}
	public int getDev_lang3_lv() {
		return dev_lang3_lv;
	}
	public void setDev_lang3_lv(int dev_lang3_lv) {
		this.dev_lang3_lv = dev_lang3_lv;
	}
	public String getDev_lang4() {
		return dev_lang4;
	}
	public void setDev_lang4(String dev_lang4) {
		this.dev_lang4 = dev_lang4;
	}
	public int getDev_lang4_lv() {
		return dev_lang4_lv;
	}
	public void setDev_lang4_lv(int dev_lang4_lv) {
		this.dev_lang4_lv = dev_lang4_lv;
	}
	public String getDev_lang5() {
		return dev_lang5;
	}
	public void setDev_lang5(String dev_lang5) {
		this.dev_lang5 = dev_lang5;
	}
	public int getDev_lang5_lv() {
		return dev_lang5_lv;
	}
	public void setDev_lang5_lv(int dev_lang5_lv) {
		this.dev_lang5_lv = dev_lang5_lv;
	}
	public String getSkill1() {
		return skill1;
	}
	public void setSkill1(String skill1) {
		this.skill1 = skill1;
	}
	public int getSkill1_lv() {
		return skill1_lv;
	}
	public void setSkill1_lv(int skill1_lv) {
		this.skill1_lv = skill1_lv;
	}
	public String getSkill2() {
		return skill2;
	}
	public void setSkill2(String skill2) {
		this.skill2 = skill2;
	}
	public int getSkill2_lv() {
		return skill2_lv;
	}
	public void setSkill2_lv(int skill2_lv) {
		this.skill2_lv = skill2_lv;
	}
	public String getSkill3() {
		return skill3;
	}
	public void setSkill3(String skill3) {
		this.skill3 = skill3;
	}
	public int getSkill3_lv() {
		return skill3_lv;
	}
	public void setSkill3_lv(int skill3_lv) {
		this.skill3_lv = skill3_lv;
	}
	public String getSkill4() {
		return skill4;
	}
	public void setSkill4(String skill4) {
		this.skill4 = skill4;
	}
	public int getSkill4_lv() {
		return skill4_lv;
	}
	public void setSkill4_lv(int skill4_lv) {
		this.skill4_lv = skill4_lv;
	}
	public String getSkill5() {
		return skill5;
	}
	public void setSkill5(String skill5) {
		this.skill5 = skill5;
	}
	public int getSkill5_lv() {
		return skill5_lv;
	}
	public void setSkill5_lv(int skill5_lv) {
		this.skill5_lv = skill5_lv;
	}
	public String getSkill_other() {
		return skill_other;
	}
	public void setSkill_other(String skill_other) {
		this.skill_other = skill_other;
	}
	public String getDB() {
		return DB;
	}
	public void setDB(String dB) {
		DB = dB;
	}
	public String getEnv() {
		return env;
	}
	public void setEnv(String env) {
		this.env = env;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getChar_like() {
		return char_like;
	}
	public void setChar_like(String char_like) {
		this.char_like = char_like;
	}
	public int getNumber_of_people() {
		return number_of_people;
	}
	public void setNumber_of_people(int number_of_people) {
		this.number_of_people = number_of_people;
	}
	public int getNumber_of_interview() {
		return number_of_interview;
	}
	public void setNumber_of_interview(int number_of_interview) {
		this.number_of_interview = number_of_interview;
	}
	public boolean isApproval() {
		return approval;
	}
	public void setApproval(boolean approval) {
		this.approval = approval;
	}
}
