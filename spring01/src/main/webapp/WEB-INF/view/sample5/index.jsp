<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	루트 페이지	<br>
	<c:if test="${username==null }">
		<a href="/sample5/login">로그인하세요</a>
	</c:if>
	<c:if test="${username!=null }">
		${username }님 환영합니다<br>
		<form action="/sample5/logout" method="post">
			<button>로그아웃</button>
		</form>
	</c:if>
</body>
</html>