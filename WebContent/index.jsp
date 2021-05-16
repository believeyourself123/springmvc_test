<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="firstController">请求第一个controller</a><br/>
	<a href="test/aa">请求第二个controller</a><br/>
	<a href="test/bb">第三个Spring MVC程序</a>
	<form action="test/update">
		<input type="text" name="name"/>
		<input type="submit" value="提交"/>
	</form>
	<hr/>
	<form action="test/default" method="post">
		<input type="text" name="u_id"/>
		<input type="submit" value="提交"/>
	</form>
	
</body>
</html>