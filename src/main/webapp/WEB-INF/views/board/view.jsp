<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
		<div>View</div>
		<div class="container">
			<table class="table">
				<thead class="bg-info">
					<tr>
						<th>작성자: 김용범</th>
						<th>날짜: 2022/01/05</th>
						<th>제목: Spring의 기초</th>
					</tr>
				</thead>
				<tbody class="">
					<tr>
						<td colspan="3">
							<div>
								이번 포스팅에서는 인턴을 하게 된 회사에서 진행해준 신입사원 교육 중, Spring의 기초에 대해 정리해보려
								합니다. Spring Boot로 프로젝트를 진행했던 경험이 있어서 Spring의 특징에 대해 어느 정도 알고 있다고
								생각하고 있었는데, 이 교육을 듣고 Spring에 대해 한층 더 자세히 알게 되었습니다.......
							</div>
						</td>
					</tr>
				</tbody>
			</table>
			<div class="container">
				<form class="" action="/board/list">
					<button class="btn btn-primary">목록</button>
				</form>
				<form action="/board/edit">
					<button class="btn btn-primary">수정</button>
				</form>
			</div>
		</div>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
			crossorigin="anonymous"></script>
	</body>
</html>

