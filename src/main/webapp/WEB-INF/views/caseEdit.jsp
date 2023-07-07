<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
<script src="js/caseRegistCheck.js" charset="UTF-8"></script>
</head>
<body>
	<h2>案件登録画面</h2>
	<form:form class="caseEdit" name="caseEdit" action="caseEdit" method="POST" onSubmit="return check()" modelAttribute="casesModel">
		<form:hidden path="caseId" value="${casesModel.caseId }"/>
		<p>
		案件名<span class="require">(必須)</span><br>
		<form:input class="txt" path="caseName" value="${casesModel.caseName }" />
		<span class="alertArea"></span>
		</p>
		<p>
		案件内容<span class="require">(必須)</span><br>
		<form:textarea class="txt" path="caseDetail" value="${casesModel.caseDetail }" />
		<span class="alertArea"></span>
		</p>
		<p>
		場所<span class="require">(必須)</span><br>
		<form:input class="txt" path="place" value="${casesModel.place }"/>
		<span class="alertArea"></span>
		</p>
		<p>
		開始日<span class="require">(必須)</span><br>
		<form:input class="date" type="date" path="startDate" value="${casesModel.startDate }" />
		<span class="alertArea"></span>
		</p>
		<p>
		終了日<span class="require">(必須)</span><br>
		<form:input class="date" type="date" path="endDate" value="${casesModel.endDate }" />
		<span class="alertArea"></span>
		</p>
		<p>
		担当工程<span class="require">(必須)</span><br>
		<form:input class="txt" path="resp_process" value="${casesModel.resp_process }" />
		<span class="alertArea"></span>
		</p>
		<p>
		開発言語1<span class="require">(必須)</span><br>
		<form:input class="txt" path="dev_lang1" value="${casesModel.dev_lang1 }" />
		<span class="alertArea"></span>
		</p>
		<p>
		開発言語1のレベル<span class="require">(必須)</span><br>
		<form:select class="num" path="dev_lang1_lv" items="${dev_lang_lv }" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</p>
		<p>
		開発言語2<br>
		<form:input class="txt" path="dev_lang2" value="${casesModel.dev_lang2 }" />
		<span class="alertArea"></span>
		</p>
		<p>
		開発言語2のレベル<br>
		<form:select class="num" path="dev_lang2_lv" items="${dev_lang_lv }" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</p>
		<p>
		開発言語3<br>
		<form:input class="txt" path="dev_lang3" value="${casesModel.dev_lang3 }" />
		<span class="alertArea"></span>
		</p>
		<p>
		開発言語3のレベル<br>
		<form:select class="num" path="dev_lang3_lv" items="${dev_lang_lv }" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</p>
		<p>
		開発言語4<br>
		<form:input class="txt" path="dev_lang4" value="${casesModel.dev_lang4 }" />
		<span class="alertArea"></span>
		</p>
		<p>
		開発言語4のレベル<br>
		<form:select class="num" path="dev_lang4_lv" items="${dev_lang_lv }" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</p>
		<p>
		開発言語5<br>
		<form:input class="txt" path="dev_lang5" value="${casesModel.dev_lang5 }" />
		<span class="alertArea"></span>
		</p>
		<p>
		開発言語5のレベル<br>
		<form:select class="num" path="dev_lang5_lv" items="${dev_lang_lv }" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</p>
		<p>
		必要スキル1<br>
		<form:input class="txt" path="skill1" value="${casesModel.skill1 }" />
		<span class="alertArea"></span>
		</p>
		<p>
		必要スキル1のレベル<br>
		<form:select class="num" path="skill1_lv" items="${dev_lang_lv }" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</p>
		<p>
		必要スキル2<br>
		<form:input class="txt" path="skill2" value="${casesModel.skill2 }" />
		<span class="alertArea"></span>
		</p>
		<p>
		必要スキル2のレベル<br>
		<form:select class="num" path="skill2_lv" items="${dev_lang_lv }" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</p>
		<p>
		必要スキル3<br>
		<form:input class="txt" path="skill3" value="${casesModel.skill3 }" />
		<span class="alertArea"></span>
		</p>
		<p>
		必要スキル3のレベル<br>
		<form:select class="num" path="skill3_lv" items="${dev_lang_lv }" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</p>
		<p>
		必要スキル4<br>
		<form:input class="txt" path="skill4" value="${casesModel.skill4 }" />
		<span class="alertArea"></span>
		</p>
		<p>
		必要スキル4のレベル<br>
		<form:select class="num" path="skill4_lv" items="${dev_lang_lv }" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</p>
		<p>
		必要スキル5<br>
		<form:input class="txt" path="skill5" value="${casesModel.skill5 }" />
		<span class="alertArea"></span>
		</p>
		<p>
		必要スキル5のレベル<br>
		<form:select class="num" path="skill5_lv" items="${dev_lang_lv }" itemLabel="label" itemValue="data" />
		<span class="alertArea"></span>
		</p>
		<p>
		その他スキル<br>
		<form:input class="txt" path="skill_other" value="${casesModel.skill_other }" />
		<span class="alertArea"></span>
		</p>
		<p>
		DB<br>
		<form:input class="txt" path="DB" value="${casesModel.DB }" />
		<span class="alertArea"></span>
		</p>
		<p>
		環境<span class="require">(必須)</span><br>
		<form:input class="txt" path="env" value="${casesModel.env }" />
		<span class="alertArea"></span>
		</p>
		<p>
		外国籍<span class="require">(必須)</span><br>
		<form:input class="txt" path="nationality" value="${casesModel.nationality }" />
		<span class="alertArea"></span>
		</p>
		<p>
		年齢<span class="require">(必須)</span><br>
		<form:input class="num" path="age" value="${casesModel.age }" />
		<span class="alertArea"></span>
		</p>
		<p>
		人物像<span class="require">(必須)</span><br>
		<form:input class="txt" path="char_like" value="${casesModel.char_like }" />
		<span class="alertArea"></span>
		</p>
		<p>
		人数<span class="require">(必須)</span><br>
		<form:input class="num" path="number_of_people" value="${casesModel.number_of_people }" />
		<span class="alertArea"></span>
		</p>
		<p>
		面談回数<span class="require">(必須)</span><br>
		<form:input class="num" path="number_of_interview" value="${casesModel.number_of_interview }" />
		<span class="alertArea"></span>
		</p>
		<br>
		<input type="submit" value="確認画面へ">
	</form:form>
</body>
</html>