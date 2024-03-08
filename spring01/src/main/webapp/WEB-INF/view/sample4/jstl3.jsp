<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<title>forEach 반복문</title>
</head>
<body>
	<div id="app">
		<!-- table의 semantic tag가 뭐지? -->
		<table class="table table-hover">
			<thead>
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
		<div style="display:flex; justify-content: center;">
			<ul class="pagination">
				<c:if test="${pagination.prev>0}">
					<li class="page-item">
						<a class="page-link" href="#">이전으로</a>
					</li>
				</c:if>
				<c:forEach begin="${pagination.start}" end="${pagination.end }" 
					var="i">
					<c:if test="${i==pagination.pageno }">
						<li class="page-item active">
							<a class="page-link" href="/sample4/jstl4?pageno=${i}">${i}</a>
						</li>
					</c:if>
					<c:if	test="${i!=pagination.pageno }">
						<!-- 
							controller는 작업을 통제
						-->
						<li class="page-item">
							<a class="page-link" href="/sample4/jstl4?pageno=${i}">${i}</a>
						</li>
					</c:if>				
				</c:forEach>
				<c:if test="${pagination.next>0}">
					<li class="page-item">
						<a class="page-link" href="#">다음으로</a>
					</li>
				</c:if>
			</ul>
		</div>
	</div>
</body>
</html>








