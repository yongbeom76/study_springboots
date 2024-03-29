<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous" />

<div class="container">
<%-- Form List --%>
<div class="row">
	<form action="/commonCodeOur/form" method="get">
		<button class="btn btn-info">Form</button>
	</form>
	<form action="/commonCodeOur/formMulti" method="get">
		<button class="btn btn-info">FormMulti</button>
	</form>
</div>
<%-- Pagination --%>
<nav aria-label="Page navigation example">
	<c:set var="_pagination" value="${resultMap.paginations}"/>
	<span>총 갯수: ${_pagination.totalCount}</span>
	<div>pageScale: ${_pagination.pageScale}</div>
	<div>blockScale: ${_pagination.blockScale}</div>
	<div>currentPage: ${_pagination.currentPage}</div>
	<div>previousPage: ${_pagination.previousPage}</div>
	<div>nextPage: ${_pagination.nextPage}</div>
	<div>totalPage: ${_pagination.totalPage}</div>
	<div>currentBlock: ${_pagination.currentBlock}</div>
	<div>totalBlock: ${_pagination.totalBlock}</div>
	<div>pageBegin: ${_pagination.pageBegin}</div>
	<div>pageEnd: ${_pagination.pageEnd}</div>
	<div>blockStart: ${_pagination.blockStart}</div>
	<div>blockEnd: ${_pagination.blockEnd}</div>
	<div>totalCount: ${_pagination.totalCount}</div>
  <ul class="pagination">
    <li class="page-item">
      <a class="page-link" href="/commonCodeOur/listPagination/${_pagination.previousPage}" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
        <span class="sr-only">Previous</span>
      </a>
    </li>
	<%-- for(int i=0;i < 9; i++) {} --%>
	<c:forEach var="i" begin="${_pagination.blockStart}" end="${_pagination.blockEnd}">
		<li class="page-item"><a class="page-link" href="/commonCodeOur/listPagination/${i}">${i}</a></li>
	</c:forEach>
    <li class="page-item">
      <a class="page-link" href="/commonCodeOur/listPagination/${_pagination.nextPage}" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
        <span class="sr-only">Next</span>
      </a>
    </li>
  </ul>
</nav>


<form action="/commonCodeOur/deleteMulti" id="deleteMulti" method="post">
	<button class="btn btn-info">deleteMulti</button>
</form>
	<table class="table table-striped table-hover table-bordered">
		<thead>
			<tr class="text-center">
				<th><input type="checkbox" id="selectall" /></th>
				<th>코드 ID</th>
				<th>코드 ID with Files</th>
				<th>코드명</th>
				<th>부모 코드 ID</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach items="${resultMap.resultList}" var="resultData" varStatus="loop">
				<tr>
					<td class="text-center">
						<input type="checkbox" form="deleteMulti" class="checkbox"
						name="COMMON_CODE_ID" value="${resultData.COMMON_CODE_ID}" />
					</td>
					<td>
						<form action="/commonCodeOur/edit/${resultData.COMMON_CODE_ID}" method="get">
							<button class="btn btn-link viewPopup"
							>${resultData.COMMON_CODE_ID}</button>
						</form>
					</td>
					<td>
						<form action="/commonCodeOur/editMulti/${resultData.COMMON_CODE_ID}" method="get">
							<button class="btn btn-link viewPopup"
							>${resultData.COMMON_CODE_ID} Multi</button>
						</form>
					</td>
					<td>${resultData.NAME}</td>
					<td class="text-center">
						<div class="btn-group">
							<button class="btn btn-outline-info"
								name="PARENT_COMMONCODE_ID" >
								${resultData.PARENT_COMMON_CODE_ID}
							</button>
						</div>
					</td>
					<td>
						<form action="/commonCodeOur/delete/${resultData.COMMON_CODE_ID}" method="post">
							<button class="btn btn-outline-info"
							>Delete</button>
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

<!-- /.table-responsive -->
</div>