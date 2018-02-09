<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>게시판</title>
	<link rel="stylesheet" href="resources/css/bootstrap.css" />
	<link rel="stylesheet" href="resources/css/board.css" />
</head>

<body>
	<div class="container">
		<div class="row">   
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>글번호</th>
							<th>글제목</th>
							<th>작성자</th>
							<th>조회수</th>
							<th>날짜</th>           
						</tr>
					</thead>
					<tbody>
					<c:forEach var="vo" items="${list}" varStatus="i">
						<c:if test="${i.index%2 == 1}">
							<tr>
						</c:if>	
						<c:if test="${i.index%2 == 1}">
							<tr class="active">
						</c:if>	
								<td>${vo.no}</td>
								<td>${vo.title}</td>
								<td>${vo.writer}</td>
								<td>${vo.hit}</td>
								<td>${vo.date1}</td>
							</tr>		
					</c:forEach>
					</tbody>
				</table>
				
				<a href="boardwrite.do" class="btn btn-success">글쓰기</a>
				<ul id="pagination-demo" class="pagination-sm"></ul>
			</div>
		</div>
	</div>
		
      


	<script type="text/javascript" src="resources/js/jquery-1.11.1.js"></script>
	<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="resources/js/jquery.twbsPagination.min.js"></script>
	<script>
		$(function() {
			  $('#pagination-demo').twbsPagination({
			        totalPages: 35,
			        visiblePages: 7,
			        initiateStartPageClick: false,
			        onPageClick: function (event, page) {
			            $('#page-content').text('Page ' + page);
			        }
			    });
		});
	</script>	
</body>
</html>
