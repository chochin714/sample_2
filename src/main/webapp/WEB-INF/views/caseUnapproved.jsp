<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>未承認一覧</h2>
		<c:if test="${!empty casesList }">
			<table>
				<tr>
					<th>案件名</th>
					<th>場所</th>
					<th>開始日</th>
					<th>終了日</th>
					<th>担当工程</th>
					<th>メイン開発言語</th>
					<th>データベース</th>
				</tr>
				<c:forEach var="cases" items="${casesList }">
				<form:form action="caseApproval" method="GET" modelAttribute="casesModel">
					<tr>
						<td><c:out value="${cases.caseName }"/></td>
						<td><c:out value="${cases.place }"/></td>
						<td><c:out value="${cases.startDate }"/></td>
						<td><c:out value="${cases.endDate }"/></td>
						<td><c:out value="${cases.resp_process }"/></td>
						<td><c:out value="${cases.dev_lang1 }"/></td>
						<td><c:out value="${cases.DB }"/></td>
						<td><input type="submit" value="詳細"></td>
						<form:hidden path="caseId" value="${cases.caseId }" />
					</tr>
				</form:form>
				</c:forEach>
			</table>
		</c:if>
</body>
</html>