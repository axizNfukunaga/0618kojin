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
<title>いいねポイントランキング</title>
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
	<p>いいねポイントランキングを表示</p>
	<div class="container" id="center">
		<div class="table-responsive">
			<table class="table table-striped table-bordered">
				<thead>
					<tr>
						<th>ランキング</th>
						<th>投稿者</th>
						<th>ひとこと</th>
						<th>いいね数</th>
						<th>日付</th>
						<th>いいね</th>
					</tr>
				</thead>
				<tr>
					<th>1</th>
					<th scope="row">サメ</th>
					<td>サメさんだぞ～</td>
					<td>200</td>
					<td>2018/6/13</td>
					<td><form:form action="like" modelAttribute="command">
							<div>
								<form:button class="btn btn-info btn-sm btn-block">いいね</form:button>
							</div>
						</form:form></td>
				</tr>
			</table>
		</div>
	</div>
	<br>
	<form>
		<button type="button" class="btn btn-default btn-block"
			onclick="location.href='menu'; return false;" formmethod="get">メニューに戻る</button>
	</form>

</body>
</html>