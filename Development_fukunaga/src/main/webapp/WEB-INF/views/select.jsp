<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>検索画面</title>
<link href="css/common.css" rel="stylesheet">
<!-- BootstrapのCSS読み込み -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery読み込み -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- BootstrapのJS読み込み -->
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<h1><span>Malicious Blog</span></h1>
	<p id="center">
		検索を行います<br> 空欄で全件表示
	</p>
	<c:if test="${not empty msg}">
		<div class="message">
			<p class="required">${msg}</p>
		</div>
	</c:if>
	<form:form action="selectResult" modelAttribute="command" method="GET">
		<div class="form-group">
			<label class="col-sm-2 control-label">検索したい言葉を入力</label>
			<form:input path="content" class="form-control" />
			<form:button class="btn btn-primary btn-block">検索</form:button>
		</div>

	</form:form>
	<br>
	<form>
		<button type="button" class="btn btn-default btn-block"
			onclick="location.href='menu'; return false;" formmethod="get">メニューに戻る</button>
	</form>
</body>
</html>