<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		${username }님 환영합니다<br>
		<form action="/sample3/logout" method="post">
			<button>로그아웃</button>
		</form>
</body>
</html>