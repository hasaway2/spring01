<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form action="/sample3/login" method="post">
	  <div class="mb-3 mt-3">
	    <label for="val1" class="form-label">아이디:</label>
	    <input type="text" class="form-control" id="username" placeholder="아이디..." name="username">
	  </div>
	  <div class="mb-3 mt-3">
	    <label for="val2" class="form-label">비밀번호:</label>
	    <input type="password" class="form-control" id="password" placeholder="비밀번호..." name="password">
	  </div>
	  <button class="btn btn-primary">로그인</button>
	</form>
</body>
</html>