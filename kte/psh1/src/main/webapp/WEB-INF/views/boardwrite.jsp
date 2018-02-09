<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>게시판 글쓰기</title>
	<link rel="stylesheet" href="resources/css/bootstrap.css" />
</head>

<body>
	<div class="container">
		<form:form action="boardwrite.do" modelAttribute="bvo" method="post" enctype="multipart/form-data">
			<form:input type="text" path="no" readonly="true" /><br />
			<form:input type="text" path="title" placeholder="제목" autofoucs="autofocus" /><br />
			<form:textarea rows="6" path="content" placeholder="내용"></form:textarea><br />
			<form:input type="text" path="writer" readonly="true" /><br />
			
			<input type ="file" name ="file_0" />
			<input type ="file" name ="file_1" />
			<input type ="file" name ="file_2" />
			
			<input type="submit" value="글쓰기" />
		</form:form>
	</div>

	<script type="text/javascript" src="resources/js/jquery-1.11.1.js"></script>
	<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
	<script>
		$(function() {
			
		});
	</script>	
</body>
</html>
