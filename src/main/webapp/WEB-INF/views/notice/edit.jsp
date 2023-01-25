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
		<hr />
		<div class="container">
			<form action="/notice/view" method="post">
				<%-- <input type="hidden" name="index" value="${param.index}"> --%>
				<table class="table align-middle">
					<thead>
						<tr>
							<th colspan="2">게시글 수정</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>작성자</td>
							<td>
								<input class="form-control" type="text" name="userName" id="userName" value="${boardBean.userName}" />
							</td>
						</tr>
						<tr>
							<td>날짜</td>
							<td>
								<input class="form-control" type="text" name="date" id="date" value="${boardBean.date}" />
							</td>
						</tr>
						<tr>
							<td>제목</td>
							<td>
								<input class="form-control" type="text" name="title" id="title" value="${boardBean.title}" />
							</td>
						</tr>
						<tr>
							<td>내용</td>
							<td>
								<textarea rows="10" class="form-control" name="content" id="content">${boardBean.content}</textarea>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<button class="btn btn-primary">Save</button>
							</td>
						</tr>
					</tbody>
				</table>
			</form>
		</div>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
			crossorigin="anonymous"></script>
	</body>
</html>
