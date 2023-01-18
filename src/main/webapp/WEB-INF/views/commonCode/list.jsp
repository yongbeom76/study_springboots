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
			<table class="table table-striped">
				<thead class="bg-info">
					<tr>
						<th>#</th>
						<th>COMMON_CODE_ID</th>
						<th>NAME</th>
						<th>ORDER_NUMBER</th>
					</tr>
				</thead>
				<tbody class="">
					<c:forEach var="result" items="${resultMap}" varStatus="status">
					<tr>
						<th>${status.count}</th>
						<td>${result.COMMON_CODE_ID}</td>
						<td>${result.NAME}</td>
						<td>${result.ORDER_NUMBER}</td>
					</tr>
					</c:forEach>
					
      				<%-- <div>${board.title},${board.userName} : ${status.count}, ${status.index}, ${status.first}, ${status.last}</div> --%>
    				
				</tbody>
			</table>
			<div>
				<a href="/board/form"><button class="btn btn-primary">Update</button></a>
			</div>
		</div>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
			crossorigin="anonymous"></script>
	</body>
</html>
