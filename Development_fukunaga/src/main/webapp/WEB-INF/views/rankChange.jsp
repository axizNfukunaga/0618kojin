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
	<p id="center">
		ランクを変更します<br> 変更したいランクを選択してください
	</p>
	<c:if test="${not empty msg}">
		<div class="message" id="center">
			<p class="required">${msg}</p>
		</div>
	</c:if>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-sm-offset-2">
				<hr class="divider-d">
				<form:form action="rankChangeConfirm" modelAttribute="command"
					method="GET" class="form">
					<div class="form-group">
					<form:select path="rank_id" class="form-control">

						<label class="control-label col-sm-1">会員ランク</label>
						<div class="col-sm-2">
							<form:option value="3" label="有料"></form:option>
							<form:option value="1" label="無料"></form:option>
						</div>

					</form:select>
					</div>
					<div>
						<form:button class="btn btn-d btn-circle btn-lg btn-block">確認</form:button>
					</div>
				</form:form>
				<br>
				<form>
					<button type="button" class="btn btn-border-d btn-circle btn-lg btn-block"
						onclick="location.href='menu'; return false;" formmethod="get">メニューに戻る</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>