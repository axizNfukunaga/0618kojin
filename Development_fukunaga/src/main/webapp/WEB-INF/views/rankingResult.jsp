<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:if test="${empty loginUser}">
	<c:redirect url="login" />
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>いいねポイントランキング</title>
<link href="css/common.css" rel="stylesheet">
<!-- BootstrapのCSS読み込み -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Template specific stylesheets-->
<link
	href="https://fonts.googleapis.com/css?family=Roboto+Condensed:400,700"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Volkhov:400i"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800"
	rel="stylesheet">
<link href="lib/animate.css/animate.css" rel="stylesheet">
<link href="lib/components-font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<link href="lib/et-line-font/et-line-font.css" rel="stylesheet">
<link href="lib/flexslider/flexslider.css" rel="stylesheet">
<link href="lib/owl.carousel/dist/assets/owl.carousel.min.css"
	rel="stylesheet">
<link href="lib/owl.carousel/dist/assets/owl.theme.default.min.css"
	rel="stylesheet">
<link href="lib/magnific-popup/dist/magnific-popup.css" rel="stylesheet">
<link href="lib/simple-text-rotator/simpletextrotator.css"
	rel="stylesheet">
<!-- Main stylesheet and color file-->
<link href="css/style.css" rel="stylesheet">
<link id="color-scheme" href="css/colors/default.css" rel="stylesheet">
<!-- jQuery読み込み -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- BootstrapのJS読み込み -->
<script src="js/bootstrap.min.js"></script>
</head>
<body data-spy="scroll" data-target=".onpage-navigation"
	data-offset="60">
	<h1>
		<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
			<div class="container">
				<a class="navbar-brand">Malicious Blog</a>
			</div>
		</nav>
	</h1>
	<p id="center">閲覧ポイントランキング</p>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-sm-offset-2">
				<hr class="divider-d">

				<form:form action="ranking" modelAttribute="command" method="GET"
					class="form">
					<div class="form-group">
						<label class="control-label col-sm-1">ジャンル</label>
						<div class="col-sm-2">
							<form:select path="genre_id" class="form-control">
								<form:option value="0" label="すべてのジャンル"></form:option>
								<form:option value="1" label="ビジネス"></form:option>
								<form:option value="2" label="趣味"></form:option>
								<form:option value="3" label="芸能"></form:option>
							</form:select>
						</div>
					</div>
					<div class="form-group">
						<form:button class="btn btn-d btn-circle btn-lg btn-block">ジャンル変更</form:button>
					</div>
				</form:form>
				<c:if test="${loginUser.rank_id == 3}">
					<form>
						<div>
							<button type="button"
								class="btn btn-danger btn-circle btn-lg btn-block"
								onclick="location.href='dateRank'; return false;"
								formmethod="post">有料会員限定！本日のランキング！</button>
						</div>
					</form>
				</c:if>
				<div class="container" id="center">
					<div class="table-responsive">
						<table class="table table-striped table-bordered">
							<thead>
								<tr>
									<th>順位</th>
									<th>投稿者</th>
									<th>ひとこと</th>
									<th>閲覧ポイント</th>
									<th>日付</th>
									<th>いいね</th>
								</tr>
							</thead>
							<tbody>
								<%
									int rank = 0;
								%>
								<c:forEach var="list" items="${list}">
									<tr>
										<%
											rank++;
										%>
										<td>
											<%
												out.println(rank);
											%>位
										</td>
										<td>${list.user_nic}</td>
										<td>${list.contents}</td>
										<td>${list.browsing_point}</td>
										<td><fmt:formatDate value="${list.date}"
												pattern="yyyy/MM/dd" /></td>
										<td><form:form action="like" modelAttribute="command">
												<div>
													<form:hidden path="rank_id" value="${list.rank_id}"></form:hidden>
													<form:hidden path="post_id" value="${list.post_id}"></form:hidden>
													<form:button
														class="btn btn-border-d btn-circle btn-lg btn-block">いいね</form:button>
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
					<button type="button"
						class="btn btn-border-d btn-circle btn-lg btn-block"
						onclick="location.href='menu'; return false;" formmethod="get">メニューに戻る</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>