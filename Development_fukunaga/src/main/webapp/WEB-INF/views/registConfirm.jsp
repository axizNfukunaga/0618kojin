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
<title>登録確認画面</title>
<link href="css/common.css" rel="stylesheet">
<!-- BootstrapのCSS読み込み -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery読み込み -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- BootstrapのJS読み込み -->
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<h1><span>Malicious Blog</span></h1>
	<p id="center">これでよろしいですか</p>
	<c:if test="${not empty msg}">
		<div class="message">
			<p class="required">${msg}</p>
		</div>
	</c:if>
		<form:form action="regist" modelAttribute="command"
		class="form-horizontal">
		<div>
			<div class="form-group">
				<label class="col-sm-2 control-label">ユーザID</label>
				<div class="col-sm-3">
					<form:input path="id" class="form-control" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">ニックネーム</label>
				<div class="col-sm-3">
					<form:input path="nic" class="form-control" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">パスワード(再入力)</label>
				<div class="col-sm-3">
					<form:password path="rePass" class="form-control" />
				</div>
			</div>
			<p>
				<form:button class="btn btn-primary btn-sm btn-block">確認</form:button>
				 <button type="button" class="btn btn-default btn-sm btn-block" onclick="location.href='login'; return false;" formmethod="get">ログイン画面に戻る</button>
			</p>
		</div>
	</form:form>
</body>
</html>