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
<title>投稿確認画面</title>
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
	<h1>
		<span>Malicious Blog</span>
	</h1>
	<p id="center">ジャンルを選択してください</p>
	<form:form action="post" modelAttribute="command">
		<div class="form-group">
			<label class="control-label col-sm-1">ジャンル</label>
			<div class="col-sm-2">
					<form:select path="genre_id" class="form-control">
						<form:option value="1" label="ビジネス"></form:option>
						<form:option value="2" label="趣味"></form:option>
						<form:option value="3" label="芸能"></form:option>
					</form:select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-1 control-label">ひとこと</label>
			<form:input path="content" readonly="true" class="form-control" />
		</div>
		<div>
			<form:button class="btn btn-primary btn-block">投稿</form:button>
		</div>
	</form:form>
	<br>
	<form>
		<button type="button" class="btn btn-default btn-block"
			onclick="location.href='menu'; return false;" formmethod="get">メニューに戻る</button>
	</form>

</body>
</html>