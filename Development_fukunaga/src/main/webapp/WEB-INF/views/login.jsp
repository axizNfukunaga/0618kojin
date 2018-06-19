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

<title>ログイン画面</title>
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
	<c:if test="${not empty msg}">
		<div class="message" id="center">
			<p class="required">${msg}</p>
		</div>
	</c:if>
	<form:form action="login" modelAttribute="command"
		class="form-horizontal">
		<div id="center">
			<div class="form-group">
				<label class="col-sm-2 control-label">ユーザID</label>
				<div class="col-sm-3">
					<form:input path="id" class="form-control" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">パスワード</label>
				<div class="col-sm-3">
					<form:password path="pass" class="form-control" />
				</div>
			</div>
			<p>
				<form:button class="btn btn-primary btn-sm btn-block">確認</form:button>
				<button type="button" class="btn btn-default btn-sm btn-block"
					onclick="location.href='regist'; return false;" formmethod="get">登録する</button>
			</p>
		</div>
	</form:form>
</body>
</html>