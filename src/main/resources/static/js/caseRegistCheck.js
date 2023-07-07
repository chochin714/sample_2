window.onload = function(){
	let d1 = document.getElementById("dev_lang1");
	let d2 = document.getElementById("dev_lang2");
	let d3 = document.getElementById("dev_lang3");
	let d4 = document.getElementById("dev_lang4");
	let d5 = document.getElementById("dev_lang5");
	let d1lv = document.getElementById("dev_lang1_lv");
	let d2lv = document.getElementById("dev_lang2_lv");
	let d3lv = document.getElementById("dev_lang3_lv");
	let d4lv = document.getElementById("dev_lang4_lv");
	let d5lv = document.getElementById("dev_lang5_lv");
	let dev2 = document.getElementById("dev2");
	let dev3 = document.getElementById("dev3");
	let dev4 = document.getElementById("dev4");
	let dev5 = document.getElementById("dev5");
	
	let s1 = document.getElementById("skill1");
	let s2 = document.getElementById("skill2");
	let s3 = document.getElementById("skill3");
	let s4 = document.getElementById("skill4");
	let s5 = document.getElementById("skill5");
	let s1lv = document.getElementById("skill1_lv");
	let s2lv = document.getElementById("skill2_lv");
	let s3lv = document.getElementById("skill3_lv");
	let s4lv = document.getElementById("skill4_lv");
	let s5lv = document.getElementById("skill5_lv");
	let ski2 = document.getElementById("ski2");
	let ski3 = document.getElementById("ski3");
	let ski4 = document.getElementById("ski4");
	let ski5 = document.getElementById("ski5");
	
	if(d1.value=="" || d1lv.value=="0") {
		dev2.style.display="none";
	}
	if(d2.value=="" || d2lv.value=="0") {
		dev3.style.display="none";
	}
	if(d3.value=="" || d3lv.value=="0") {
		dev4.style.display="none";
	}
	if(d4.value=="" || d4lv.value=="0") {
		dev5.style.display="none";
	}
	
	if(s1.value=="" || s1lv.value=="0") {
		ski2.style.display="none";
	}
	if(s2.value=="" || s2lv.value=="0") {
		ski3.style.display="none";
	}
	if(s3.value=="" || s3lv.value=="0") {
		ski4.style.display="none";
	}
	if(s4.value=="" || s4lv.value=="0") {
		ski5.style.display="none";
	}	
}


function check(){
	let count = 0;
	if(registForm.caseName.value == "")	{count = 1;}
	if(registForm.caseDetail.value == "")	{count = 1;}
	if(registForm.place.value == "")	{count = 1;}
	if(registForm.startDate.value == "")	{count = 1;}
	if(registForm.endDate.value == "")	{count = 1;}
	if(registForm.resp_process.value == "")	{count = 1;}
	if(registForm.dev_lang1.value == "")	{count = 1;}
	if(registForm.dev_lang1_lv.value == "")	{count = 1;}
	if(registForm.env.value == "")	{count = 1;}
	if(registForm.nationality.value == "")	{count = 1;}
	
	if(registForm.age.value.match(/[^0-9]+/))	{count = 1;}
	if(registForm.age.value < 18 || 100 < registForm.age.value)	{count = 1;}
	
	if(registForm.char_like.value == "")	{count = 1;}
	
	if(registForm.number_of_people.value.match(/[^0-9]+/))	{count = 1;}
	if(registForm.number_of_people.value < 1 || 65535 < registForm.number_of_people.value)	{count = 1;}
	
	if(registForm.number_of_interview.value.match(/[^0-9]+/))	{count = 1;}
	if(registForm.number_of_interview.value < 1 || 255 < registForm.number_of_interview.value)	{count = 1;}
	
	if(registForm.dev_lang2.value != ""){
		if(registForm.dev_lang2_lv.value == ""){
			count = 1;
		}
	}
	if(registForm.dev_lang3.value != ""){
		if(registForm.dev_lang3_lv.value == ""){
			count = 1;
		}
	}
	if(registForm.dev_lang4.value != ""){
		if(registForm.dev_lang4_lv.value == ""){
			count = 1;
		}
	}
	if(registForm.dev_lang5.value != ""){
		if(registForm.dev_lang5_lv.value == ""){
			count = 1;
		}
	}
	
	if(registForm.skill1.value != ""){
		if(registForm.skill1_lv.value == ""){
			count = 1;
		}
	}
	if(registForm.skill2.value != ""){
		if(registForm.skill2_lv.value == ""){
			count = 1;
		}
	}
	if(registForm.skill3.value != ""){
		if(registForm.skill3_lv.value == ""){
			count = 1;
		}
	}
	if(registForm.skill4.value != ""){
		if(registForm.skill4_lv.value == ""){
			count = 1;
		}
	}
	if(registForm.skill5.value != ""){
		if(registForm.skill5_lv.value == ""){
			count = 1;
		}
	}
	
	if(count==1){
		alert("未入力の項目があります");
		return false;
	}
	else{
		return true;
	}
}
function pop(){
	let d1 = document.getElementById("dev_lang1");
	let d2 = document.getElementById("dev_lang2");
	let d3 = document.getElementById("dev_lang3");
	let d4 = document.getElementById("dev_lang4");
	let d5 = document.getElementById("dev_lang5");
	let d1lv = document.getElementById("dev_lang1_lv");
	let d2lv = document.getElementById("dev_lang2_lv");
	let d3lv = document.getElementById("dev_lang3_lv");
	let d4lv = document.getElementById("dev_lang4_lv");
	let d5lv = document.getElementById("dev_lang5_lv");
	let dev2 = document.getElementById("dev2");
	let dev3 = document.getElementById("dev3");
	let dev4 = document.getElementById("dev4");
	let dev5 = document.getElementById("dev5");
	
	if(d1.value=="" || d1lv.value=="0") {
		dev2.style.display="none";
	}
	else {
		dev2.style.display="block";
	}
	
	if(d2.value=="" || d2lv.value=="0") {
		dev3.style.display="none";
	}
	else {
		dev3.style.display="block";
	}
	
	if(d3.value=="" || d3lv.value=="0") {
		dev4.style.display="none";
	}
	else {
		dev4.style.display="block";
	}
	
	if(d4.value=="" || d4lv.value=="0") {
		dev5.style.display="none";
	}
	else {
		dev5.style.display="block";
	}
	
	let s1 = document.getElementById("skill1");
	let s2 = document.getElementById("skill2");
	let s3 = document.getElementById("skill3");
	let s4 = document.getElementById("skill4");
	let s5 = document.getElementById("skill5");
	let s1lv = document.getElementById("skill1_lv");
	let s2lv = document.getElementById("skill2_lv");
	let s3lv = document.getElementById("skill3_lv");
	let s4lv = document.getElementById("skill4_lv");
	let s5lv = document.getElementById("skill5_lv");
	let ski2 = document.getElementById("ski2");
	let ski3 = document.getElementById("ski3");
	let ski4 = document.getElementById("ski4");
	let ski5 = document.getElementById("ski5");
	
	if(s1.value=="" || s1lv.value=="0") {
		ski2.style.display="none";
	}
	else {
		ski2.style.display="block";
	}
	if(s2.value=="" || s2lv.value=="0") {
		ski3.style.display="none";
	}
	else {
		ski3.style.display="block";
	}
	if(s3.value=="" || s3lv.value=="0") {
		ski4.style.display="none";
	}
	else {
		ski4.style.display="block";
	}
	if(s4.value=="" || s4lv.value=="0") {
		ski5.style.display="none";
	}
	else {
		ski5.style.display="block";
	}
}