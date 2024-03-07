<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	div {
		border: 1px solid red;
	}
</style>
<title>Insert title here</title>
</head>
<body>
<div>
	<c:if test="${username==null}">
		로그인하세요
	</c:if> 
	<c:if test="${username!=null}">
		${username }님 환영합니다
	</c:if>
</div>
<div>
	<c:choose>
		<c:when test="${username==null}">
			로그인하세요
		</c:when>
		<c:otherwise>
			${username }님 환영합니다
		</c:otherwise>
	</c:choose>
</div>
</body>
</html>