<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
	<head>
		<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
		<script type="text/javascript">
			google.charts.load("current", { packages: ["corechart"] });
			google.charts.setOnLoadCallback(drawChart);

			let dataArray = ${dataArray}; //데이터 넘겨받기
			function drawChart() {
				
				// var data = google.visualization.arrayToDataTable([
				// 	["Age", "Weight"],
				// 	[8, 12],
				// 	[4, 5.5],
				// 	[11, 14],
				// 	[4, 5],
				// 	[3, 3.5],
				// 	[6.5, 7],  
				// ]);

				var data = new google.visualization.arrayToDataTable(dataArray);
				let target_element = document.getElementById("chart_div");
				let height = target_element.parentElement.clientHeight;

				var options = {
					title: "Age vs. Weight comparison",
					height: height,
					hAxis: { title: "Age", minValue: 0, maxValue: 15 },
					vAxis: { title: "Weight", minValue: 0, maxValue: 15 },
					legend: "none", // 범례
				};

				var chart = new google.visualization.ScatterChart(document.getElementById("chart_div"));

				chart.draw(data, options);
			}
			window.addEventListener("resize",drawChart,false);
		</script>
		<link
			href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
			rel="stylesheet"
			integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
			crossorigin="anonymous" />
		<style>
			* {
				border: 0.1rem solid gray;
			}
			.vh-50 {
				height: 50vh;
			}
		</style>
	</head>
	<body>
		<div class="container">
			<div class="row vh-50">
				<div class="col-5" id="chart_div"></div>
				<div class="col-7">Aside left</div>
			</div>
		</div>
		<div id="chart_div" style="width: 500px; height: 300px"></div>

		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
			crossorigin="anonymous"></script>
	</body>
</html>
