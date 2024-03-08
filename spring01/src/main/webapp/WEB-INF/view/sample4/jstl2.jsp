<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<title>forEach 반복문</title>
</head>
<body>
	<!-- 
		forEach를 사용하는 방법 1
		for(int i=1; i<=5; i++) 
	-->
	<c:forEach begin="1" end="5" var="i">
		${i}
	</c:forEach>
	<!--
		ArrayList에서 객체를 하나씩 꺼내면서 
	-->
	<table>
		<thead>
			<tr>
			<th>번호</th><th>제목</th><th>작성자</th><th>작성일</th><th>읽기</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list}" var="board">
			<tr>
				<td><button class="bno">${board.bno}</button></td>
				<td>${board.title }</td>
				<td>${board.writer }</td>
				<td>${board.writeday }</td>
				<td>${board.readcnt }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<script>
		$(document).ready(function() {
			$('.bno').on("click", function() {
				alert($(this).text());
			})
		})
	</script>
</body>
</html>








