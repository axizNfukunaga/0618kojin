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
<title>ランク変更ページ</title>
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
		ランクを変更します<br> 変更したいランクを選択してください
	</p>

	<form:form action="rankChangeConfirm" modelAttribute="command"
		method="GET">
		<div>
			<form:button path="rank" value="有料" class="btn btn-primary btn-block">有料</form:button>
		</div>
		<div>
			<form:button path="rank" value="無料" class="btn btn-default btn-block">無料</form:button>
		</div>
	</form:form>
<br>
	<form>
		<button type="button" class="btn btn-default btn-block"
			onclick="location.href='menu'; return false;" formmethod="get">メニューに戻る</button>
	</form>
</body>
</html>