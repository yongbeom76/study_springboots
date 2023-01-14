<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
      crossorigin="anonymous"
    />
  </head>
  <body>
    <div>board/list</div>
    <div>
    <%
      String firstWithRequest = (String) request.getAttribute("firstString");
    %>
      <div>With Request.getAttribute : <%=firstWithRequest%></div>
    </div>
    <div>
      <div>With Get Value on Spring : ${firstString}, ${boardList}</div>
    </div>
    <div>
      <div>With Get Value on JSTL : <c:out value="${firstString}" /></div>
    </div>

    <div>jstl if</div>
    <c:if test="${firstString eq 'firstValue'}">
      <h3>Matching : String eq 'firstValue'</h3>
    </c:if>
    <c:set var="firstString" value="good"/>
    <c:if test="${firstString ne 'firstValue'}">
      <h3>Not Matching : String eq 'good'</h3>
    </c:if>
    <c:set var="num_first" value="5" />
    <c:if test="${num_first gt 5}">
      <h4>greater than 5</h4>
    </c:if>
    <div>jstl switch</div>
    <c:choose>
      <c:when test="${num_first eq 3}">
        num_first eq 3이다
      </c:when>
      <c:when test="${num_first eq 5}">
        num_first eq 5이다
      </c:when>
      <c:otherwise >
        num_first는 5보다 크다
      </c:otherwise>
    </c:choose>
    <div>jstl for</div>
    <%-- for(int i=0;i<boardList.size();i++){ --%>
    <%-- BoardBean value = boardList.get(i) --%>
    <%-- } --%>
    <%-- <c:forEach begin="0" end="1" items="${boardList}" var="value">
    </c:forEach> --%>
    <%-- for(BoardBean board:boardList){ --%>
    <%-- } --%>
    <c:forEach var="board" items="${boardList}"  varStatus="status">
      <div>${board.title},${board.userName} : ${status.count}, ${status.index}, ${status.first}, ${status.last}</div>
    </c:forEach>

    <div class="container"> 
      <table class="table">
        <thead>
            <tr>
                <th scope=>#</th>
                <th scope= class="col-9">Title</th>
                <th scope=>user name</th>
                <th scope=>date</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <th scope=>1</th>
                <td><a href="/board_our/view?uid=Hello">Hello</a></td>
                <td>Mark</td>
                <td>22.11.11</td>
            </tr>
            <tr>
                <th scope=>1</th>
                <td><a href="/board_our/view?uid=Otto">Otto</a></td>
                <td>Mark</td>
                <td>22.11.11</td>
            </tr>
            <tr>
                <th scope=>1</th>
                <td><a href="/board_our/view?uid=Jasco">Jasco</a></td>
                <td>Mark</td>
                <td>22.11.11</td>
            </tr>
        </tbody>
    </table>

<div><form action="/board_our/form"><button>form</button></form><div>
</div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>