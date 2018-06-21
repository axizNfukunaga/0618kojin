<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>検索結果画面</title>
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
	<p id="center">
		検索結果を表示します<br>
	</p>
	<div class="container" id="center">
		<div class="table-responsive">
			<table class="table table-striped table-bordered">
				<thead>
					<tr>
						<th>ジャンル</th>
						<th>投稿者</th>
						<th>ひとこと</th>
						<th>閲覧ポイント</th>
						<th>日付</th>
						<th>いいね</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="list" items="${list}">
						<tr>
							<td>${list.genre}</td>
							<td>${list.user_nic}</td>
							<td>${list.contents}</td>
							<td>${list.browsing_point}</td>
							<td><fmt:formatDate value="${list.date}"
									pattern="yyyy/MM/dd" /></td>
							<td><form:form action="like" modelAttribute="command">
									<div>
										<form:hidden path="rank_id" value="${list.rank_id}"></form:hidden>
										<form:hidden path="post_id" value="${list.post_id}"></form:hidden>
										<form:button class="btn btn-info btn-sm btn-block">いいね</form:button>
									</div>
								</form:form></td>

						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<br>
	<form>
		<div>
			<button type="button" class="btn btn-primary btn-block"
				onclick="location.href='select'; return false;" formmethod="get">検索する</button>
			<button type="button" class="btn btn-default btn-block"
				onclick="location.href='menu'; return false;" formmethod="get">メニューに戻る</button>
		</div>
	</form>
</body>
</html>