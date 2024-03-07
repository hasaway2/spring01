<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<h1>게시판</h1>
	<table class="table table-hover">
		<thead >
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>읽기</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list}" var="board">
			<tr>
				<td>${board.bno }</td>
				<td>${board.title }</td>
				<td>${board.writer }</td>
				<td>${board.writeday }</td>
				<td>${board.readcnt }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>