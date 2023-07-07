<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>案件登録画面</title>
<link rel="stylesheet" href="css/style.css">
<script src="js/caseRegistCheck.js" charset="UTF-8"></script>
</head>
<body>
	<h1>案件登録画面</h1>
	
	<form:form class="registForm" name="registForm" action="caseConfirm" method="GET" onSubmit="return check()" modelAttribute="casesModel">
		<div class="wrapper">
		<label class="box" for="caseName">
		<div class="item">案件名</div><span class="require">(必須)</span>
		<form:input class="txt" path="caseName" value="${casesModel.caseName }" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="caseDetail">
		<div class="item">案件内容</div><span class="require">(必須)</span>
		<form:textarea class="txt" path="caseDetail" value="${casesModel.caseDetail }" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="place">
		<div class="item">場所</div><span class="require">(必須)</span>
		<form:input class="txt" path="place" value="${casesModel.place }"/>
		<span class="alertArea"></span>
		</label>
		<label class="box" for="startDate">
		<div class="item">開始日</div><span class="require">(必須)</span>
		<form:input class="date" type="date" path="startDate" value="${casesModel.startDate }" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="endDate">
		<div class="item">終了日</div><span class="require">(必須)</span>
		<form:input class="date" type="date" path="endDate" value="${casesModel.endDate }" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="resp_process">
		<div class="item">担当工程</div><span class="require">(必須)</span>
		<form:input class="txt" path="resp_process" value="${casesModel.resp_process }" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="dev_lang1">
		<div class="item">開発言語1</div><span class="require">(必須)</span>
		<form:input class="txt" path="dev_lang1" value="${casesModel.dev_lang1 }" onkeyup="pop()"/>
		<span class="alertArea"></span>
		</label>
		<label class="box" for="dev_lang1_lv">
		<div class="item">開発言語1のレベル</div><span class="require">(必須)</span>
		<form:select class="num" path="dev_lang1_lv" items="${dev_lang_lv }" onChange="pop()" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="dev_lang2"><div id="dev2">
		<div class="item">開発言語2</div>
		<form:input class="txt" path="dev_lang2" value="${casesModel.dev_lang2 }" onkeyup="pop()" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="dev_lang2_lv">
		<div class="item">開発言語2のレベル</div>
		<form:select class="num" path="dev_lang2_lv" items="${dev_lang_lv }" onChange="pop()" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</div></label>
		<label class="box" for="dev_lang3"><div id="dev3">
		<div class="item">開発言語3</div>
		<form:input class="txt" path="dev_lang3" value="${casesModel.dev_lang3 }" onkeyup="pop()" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="dev_lang3_lv">
		<div class="item">開発言語3のレベル</div>
		<form:select class="num" path="dev_lang3_lv" items="${dev_lang_lv }" onChange="pop()" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</div></label>
		<label class="box" for="dev_lang4"><div id="dev4">
		<div class="item">開発言語4</div>
		<form:input class="txt" path="dev_lang4" value="${casesModel.dev_lang4 }" onkeyup="pop()" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="dev_lang4_lv">
		<div class="item">開発言語4のレベル</div>
		<form:select class="num" path="dev_lang4_lv" items="${dev_lang_lv }" onChange="pop()" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</div></label>
		<label class="box" for="dev_lang5"><div id="dev5">
		<div class="item">開発言語5</div>
		<form:input class="txt" path="dev_lang5" value="${casesModel.dev_lang5 }" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="dev_lang5_lv">
		<div class="item">開発言語5のレベル</div>
		<form:select class="num" path="dev_lang5_lv" items="${dev_lang_lv }" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</div></label>
		<label class="box" for="skill1">
		<div class="item">必要スキル1</div>
		<form:input class="txt" path="skill1" value="${casesModel.skill1 }" onkeyup="pop()" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="skill1_lv">
		<div class="item">必要スキル1のレベル</div>
		<form:select class="num" path="skill1_lv" items="${dev_lang_lv }" onChange="pop()" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="skill2"><div id="ski2">
		<div class="item">必要スキル2</div>
		<form:input class="txt" path="skill2" value="${casesModel.skill2 }" onkeyup="pop()" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="skill2_lv">
		<div class="item">必要スキル2のレベル</div>
		<form:select class="num" path="skill2_lv" items="${dev_lang_lv }" onChange="pop()" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</div></label>
		<label class="box" for="skill3"><div id="ski3">
		<div class="item">必要スキル3</div>
		<form:input class="txt" path="skill3" value="${casesModel.skill3 }" onkeyup="pop()" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="skill3_lv">
		<div class="item">必要スキル3のレベル</div>
		<form:select class="num" path="skill3_lv" items="${dev_lang_lv }" onChange="pop()" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</div></label>
		<label class="box" for="skill4"><div id="ski4">
		<div class="item">必要スキル4</div>
		<form:input class="txt" path="skill4" value="${casesModel.skill4 }" onkeyup="pop()" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="skill4_lv">
		<div class="item">必要スキル4のレベル</div>
		<form:select class="num" path="skill4_lv" items="${dev_lang_lv }" onChange="pop()" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</div></label>
		<label class="box" for="skill5"><div id="ski5">
		<div class="item">必要スキル5</div>
		<form:input class="txt" path="skill5" value="${casesModel.skill5 }" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="skill5_lv">
		<div class="item">必要スキル5のレベル</div>
		<form:select class="num" path="skill5_lv" items="${dev_lang_lv }" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</div></label>
		<label class="box" for="skill_other">
		<div class="item">その他スキル</div>
		<form:input class="txt" path="skill_other" value="${casesModel.skill_other }" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="DB">
		<div class="item">DB</div>
		<form:input class="txt" path="DB" value="${casesModel.DB }" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="env">
		<div class="item">環境</div><span class="require">(必須)</span>
		<form:input class="txt" path="env" value="${casesModel.env }" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="nationality">
		<div class="item">外国籍</div><span class="require">(必須)</span>
		<form:input class="txt" path="nationality" value="${casesModel.nationality }" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="age">
		<div class="item">年齢</div><span class="require">(必須)</span>
		<form:input class="num" path="age" value="${casesModel.age }" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="char_like">
		<div class="item">人物像</div><span class="require">(必須)</span>
		<form:input class="txt" path="char_like" value="${casesModel.char_like }" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="number_of_people">
		<div class="item">人数</div><span class="require">(必須)</span>
		<form:input class="num" path="number_of_people" value="${casesModel.number_of_people }" />
		<span class="alertArea"></span>
		</label>
		<label class="box" for="number_of_interview">
		<div class="item">面談回数</div><span class="require">(必須)</span>
		<form:input class="num" path="number_of_interview" value="${casesModel.number_of_interview }" />
		<span class="alertArea"></span>
		</label>
		</div>
		<input type="submit" value="確認画面へ">
	</form:form>

</body>
</html>