<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>案件登録確認画面</h2>
	<form:form action="caseConfirm" method="POST" modelAttribute="casesModel">
		案件名<br>${casesModel.caseName }<br>
		案件内容<br>${casesModel.caseDetail }<br>
		場所<br>${casesModel.place }<br>
		開始日<br>${casesModel.startDate}<br>
		終了日<br>${casesModel.endDate}<br>
		担当工程<br>${casesModel.resp_process }<br>
		開発言語1<br>${casesModel.dev_lang1}<br>
		開発言語1のレベル<br>${casesModel.dev_lang1_lv}<br>
		開発言語2<br>${casesModel.dev_lang2}<br>
		開発言語2のレベル<br>${casesModel.dev_lang2_lv}<br>
		開発言語3<br>${casesModel.dev_lang3}<br>
		開発言語3のレベル<br>${casesModel.dev_lang3_lv}<br>
		開発言語4<br>${casesModel.dev_lang4}<br>
		開発言語4のレベル<br>${casesModel.dev_lang4_lv}<br>
		開発言語5<br>${casesModel.dev_lang5}<br>
		開発言語5のレベル<br>${casesModel.dev_lang5_lv}<br>
		必要スキル1<br>${casesModel.skill1}<br>
		必要スキル1のレベル<br>${casesModel.skill1_lv}<br>
		必要スキル2<br>${casesModel.skill2}<br>
		必要スキル2のレベル<br>${casesModel.skill2_lv}<br>
		必要スキル3<br>${casesModel.skill3}<br>
		必要スキル3のレベル<br>${casesModel.skill3_lv}<br>
		必要スキル4<br>${casesModel.skill4}<br>
		必要スキル4のレベル<br>${casesModel.skill4_lv}<br>
		必要スキル5<br>${casesModel.skill5}<br>
		必要スキル5のレベル<br>${casesModel.skill5_lv}<br>
		その他スキル<br>${casesModel.skill_other}<br>
		DB<br>${casesModel.DB}<br>
		環境<br>${casesModel.env}<br>
		外国籍<br>${casesModel.nationality}<br>
		年齢<br>${casesModel.age}<br>
		人物像<br>${casesModel.char_like}<br>
		人数<br>${casesModel.number_of_people}<br>
		面談回数<br>${casesModel.number_of_interview}<br>
		<br>
		
		<input type="submit" name="back" value="戻る">
		<input type="submit" name="forward" value="登録する">
	</form:form>
</body>
</html>