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
<title>メニュー画面</title>
<link href="css/common.css" rel="stylesheet">
<!-- BootstrapのCSS読み込み -->
<link href="css/bootstrap.min.css" rel="stylesheet">
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
	<p id="center">ようこそ${fn:escapeXml(loginUser.user_nic)}さん</p>
	<p id="center">あなたは${fn:escapeXml(loginUser.rank)}会員です</p>

	<form class="form">
		<div>
			<button type="button" class="btn btn-d btn-circle btn-lg btn-block"
				onclick="location.href='select'; return false;" formmethod="get">検索</button>
		</div>
		<div>
			<button type="button" class="btn btn-border-d btn-circle btn-lg btn-block"
				onclick="location.href='post'; return false;" formmethod="get">投稿</button>
		</div>
		<div>
			<button type="button" class="btn btn-d btn-circle btn-lg btn-block"
				onclick="location.href='rankChange'; return false;" formmethod="get">ランク変更</button>
		</div>
		<div>
			<button type="button" class="btn btn-border-d btn-circle btn-lg btn-block"
				onclick="location.href='ranking'; return false;" formmethod="get">閲覧ポイントランキング</button>
		</div>
		<br>
		<div>
			<button type="button" class="btn btn-d btn-circle btn-lg btn-block"
				onclick="location.href='logout'; return false;" formmethod="get">ログアウト</button>
		</div>
		<br>
		<div>
			<button type="button" class="btn btn-danger btn-circle btn-lg btn-block"
				onclick="location.href='unsub'; return false;" formmethod="get">退会</button>
		</div>
	</form>
</body>
</html>