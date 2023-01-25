<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>Document</title>
		<link
			href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
			rel="stylesheet"
			integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
			crossorigin="anonymous" />
	</head>
	<body>
		<div><a href="/notice/">게시판 홈</a></div>
		<div class="container">
			<table class="table">
				<thead class="bg-info">
					<tr>
						<th>작성자: ${params.userName}</th>
						<th>날짜: ${params.date}</th>
						<th>제목: ${params.title}</th>
					</tr>
				</thead>
				<tbody class="">
					<tr>
						<td colspan="3">
							<div>
								${params.content}
							</div>
						</td>
					</tr>
				</tbody>
			</table>
			<div class="container">
				<form class="" action="/notice/">
				<button class="btn btn-primary">목록</button>
				</form>
				<a href="/notice/edit/${params.title}" class="btn btn-primary">수정</a>
					<%-- <input type="hidden" name="title" value="${params.title}"> --%>
					<%-- <input type="hidden" name="index" value="${param.index}"> --%>
			</div>
		</div>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
			crossorigin="anonymous"></script>
	</body>
</html>

