<!--
-@author T.Senna 5/21
-@author K.Mizuno 5/21
-@author T.Okamoto 5/21
-@version 1.0
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="ja">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link href="bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="stylecss/bootstrap-select.min.css" rel="stylesheet" />
	<link href="stylecss/Goods.css" rel="stylesheet">
	<link href="img/fab.ico" rel="shortcut icon" /> <!-- favicon -->
	<link href="stylecss/animate.css" rel="stylesheet"><!-- animation -->
	<link href="http://cdn.jsdelivr.net/animatecss/3.1.0/animate.css" rel="stylesheet" /><!-- animation -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script><!-- jQiery -->
	<script type="text/javascript" src="js/wow.min.js"></script><!-- スクロールした時にアニメーションが発動するjs -->
	<script type="text/javascript"><!-- スクロールの記述 -->
		$(function() {
			$('a[href^=#]').click(function() {
				var speed = 1000;
				var href = $(this).attr("href");
				var target = $(href == "#" || href == "" ? 'html' : href);
				var position = target.offset().top;
				$("html, body").animate({
					scrollTop : position
				}, speed, "swing");
				return false;
			});
		});
		function Gocart() {
			if (document.forms.gocart.go.value == 1) {
				var element = document.getElementById("cart");
				var x = element.offsetLeft;
				var y = element.offsetTop;
				window.scrollTo(0, y);
			}
		}
	</script>
	<title>Stardusts Coffee</title>
</head>
<body onload="Gocart()">
	<s:form name="gocart">
		<s:hidden name="go" value="%{go}" />
	</s:form>

	<!-- fixed navigationここから -->
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">

				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Stardusts </a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="#about">About</a></li>
					<li><a href="#coffee">Coffee</a></li>
					<li><a href="#premium">Only Premium</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li></li>
					<li><a href="#top"> <span
							class="glyphicon glyphicon-hand-up" aria-hidden="true"></span></a></li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- fixed navigationここまで -->

	<a href="#top" id="top"></a><!-- スクロールでここまで飛ぶ --><br>

	<!-- トップ画面 -->
	<div>
		<img class="topimg" src="img/GoodsTop2.jpg" alt="トップ画面" /><!-- 下地 -->
		<div class="animated fadeIn" data-wow-delay="0s">
			<img class="topimg" src="img/Title.png" alt="ロゴ" style="position: absolute"><!-- 重ねるロゴ -->
		</div>
	</div>

	<a href="#top" id="bottom"></a><!-- トップへスクロールする場所 -->
	<!-- ボタンここから -->
	<s:if test="%{#session.userName==null}">
		<div class="Premium-button">
			<s:form action="GoLoginAction">
				<button type="submit" class="ghost-button action">Premium Login</button>
			</s:form>
		</div>
		<div class="Twitter-button">
			<s:form action="GoTwitterAction">
				<button type="submit" class="ghost-button action">Twitter OAuth</button>
			</s:form>
		</div>
	</s:if>
	<!-- ボタンここまで -->

	<!-- h1 -->
	<h1 align="center">
		<s:if test="%{#session.userName == null}">
			<a href="#bottom"></a>
		</s:if>
		<s:else>
			<s:property value="#session.userName" />様<br><br>
		</s:else>
		<s:property value="#session.shopName" />
		へようこそ！
	</h1><br>
	<!-- h1ここまで -->

	<!-- 商品ドキュメント -->
	<div class="container">
		<div class="row">
			<div class="col-xs-7 col-sm-7 col-md-7">
				<a href="#top" id="about"></a><br> <br> <br>
				<div align="center">
					<div class="wow animated fadeInDownBig" data-wow-offset="1">
						<h3>８段階の焙煎<br></h3>
					</div>
				</div><br>
				<font size="3" color="#424242">
					コーヒーのロースト(焙煎度)は、8段階に分けられ、味や香りの特徴は以下の通り。
					しかし、ライトやシナモンはやや酸味が強く出てしまうため、日本ではほぼ飲まれません。
					日本で一般的に飲まれているのは下記のうちミディアム・ローストからイタリアンローストまでの6種類となっています。
					是非お好みのローストをお探し、ご注文下さい。<br><br><br>
				</font>
			</div>
			<div class="col-xs-5 col-sm-5 col-md-5">
			<br><br><br><br>
				<div class="frame">
					<div align="center">
						<img class="imgsizing" src="img/Roasting.jpg">
					</div>
				</div>
			</div>
		</div> <!-- //row// -->

		<!-- table1ここから -->
		<div align="center">
			<table class="table table-bordered">
				<tr class="active">
					<th class="col-xs-3 col-sm-3 col-md-3">焙煎度
					<th class="col-xs-6 col-sm-6 col-md-6">特徴
				<tr class="active">
					<td>ライト・ロースト<br>焙煎12分・L値：30.2
					<td>ほとんどコクが無く、コーヒーと言えないほど薄い
				<tr class="active">
					<td>シナモン・ロースト<br>焙煎13分・L値：27.3
					<td>さっぱりしているが、酸味が強くコーヒーとしてはやや物足りない。
				<tr class="active">
					<td>ミディアム・ロースト<br>焙煎15分・L値：24.2
					<td>アメリカンローストとも呼ばれる。酸味が強く、苦味が少ない。豆を選びます。
				<tr class="active">
					<td>ハイ・ロースト<br>焙煎17分・L値：21.5
					<td>コーヒーとして飲まれる最もポピュラーなもの。酸味、苦味のバランスがよい
				<tr class="active">
					<td>シティ・ロースト<br>焙煎18分・L値：18.5
					<td>コーヒーの味が最も豊かに出るタイプ。
				<tr class="active">
					<td>フルシティ・ロースト<br>焙煎19分・L値：16.8
					<td>酸味が少なく、やや苦味が強く出る。エスプレッソにも使えるうまみが出てくる。
				<tr class="active">
					<td>フレンチ・ロースト<br>焙煎20分・L値：15.5
					<td>エスプレッソやアイスコーヒーに最適。苦味が豊富に出てくる。
				<tr class="active">
					<td>イタリアン・ロースト<br>焙煎22分・L値：14.2
					<td>カプチーノ、エスプレッソに最適。酸味はまったく無く、苦味とうまみが強く出る。そのため、ミルクなどで甘さを加えて飲むのに適している。

			</table>
			<!-- table1ここまで -->
		</div><!-- //container// -->
	</div>

	<div class="container">
		<div class="row">
			<div class="col-xs-6 col-sm-6 col-md-6">
				<!-- ここに画像を差し込む -->
				<br>
				<br>
				<div class="frame">
					<img class="imgsizing" src="img/Grind.jpg">
				</div>
			</div>
			<div class="col-xs-6 col-sm-6 col-md-6">
				<div align="center" class="wow animated fadeInDownBig"
					data-wow-offset="1">
					<h3>
						５つの挽き具合<br>
					</h3>
				</div>
			</div>
			<font size="3" color="#424242">
				挽き具合がコーヒーに与える影響は苦味と酸味のバランスだと言えます。 細かく挽くことによって苦味はより一層増し、
				荒く挽くことによって酸味が出やすくなっています。 また細かさ、粒度によって、抽出時間、抽出危惧が変わってくるため
				ご家庭で挽かれる場合は適した危惧や粒度を知っておく必要があります。
				それでは、以下からそれぞれ豆の挽き方による特徴と、適した抽出方法について見て行きましょう。 もちろん、ご注文は豆のままでもOKです。<br>
			<br>
			<br>
			</font>
		</div>

		<div align="center">
			<table class="table table-bordered">
				<tr class="active">
					<th class="col-xs-4 col-sm-4 col-md-4">焙煎度
					<th class="col-xs-6 col-sm-6 col-md-6">特徴
				<tr class="active">
					<td>極細挽き<br>エスプレッソ、イブリック
					<td>粒度は市販に白砂糖ほどです。この粒度で挽くためには、専用のミルが必要になります。粒度を高めると苦味が非常に強くなるため、エスプレッソコーヒーを入れる際に適しています。

				<tr class="active">
					<td>細挽き<br>ウォータードリップ、ドリップ・メリタ
					<td>粒度は粉の状態で市販されているコーヒーより、少々細かい程度となります。水出しのウィータードリップコーヒーやドリップ士気で苦味とコクを強調したい時にはこの粒度に設定します。

				<tr class="active">
					<td>中細挽き<br>ドリップ式・メリタ＆カリタ
					<td>粒度は市販のグラニュー糖ほどになります。市販の粉コーヒーに最も近く、一般的な粒度といえるでしょう。この粒度を基準とすることで、それぞれのコーヒーの粒度の違いがはっきりとしてわかります。

				<tr class="active">
					<td>中挽き<br>ドリップ・カリタ式、サイフォン式、ストレーナー式
					<td>粒度はグラニュー糖とザラメの間くらいです。熱湯の中に浸されるサイフォン式、ストレーナー式に適しています。
				<tr class="active">
					<td>粗挽き<br>コーヒーメーカー、パーコーレーター
					<td>粒度は市販のザラメほどとなり、苦味が少なく酸味の強まる弾き方となります。直接湯え煮だすコーヒーメーカーに非常に適していると言えます。

			</table>
		</div>
	</div>

	<!-- ドキュメントここまで！ -->

	<a href="#top" id="coffee"></a>
	<br>
	<br>
	<br>
	<h2 align="center">
		<s:property value="#session.shopName" />
		商品一覧
	</h2>
	<br>
	<br>

	<!-- 商品画像が左に来るversion -->
	<s:iterator value="#session.goodsInfoList" status="stat">
		 <s:if test="#stat.odd">
			<s:form action="PurchaseSelectAction">
				<s:token />
				<div class="container">
					<div class="row">
						<div class="wow animated fadeInLeft">
							<div class="col-xs-5 col-sm-5 col-md-5" align="center">
								<br>
								<img class="media-object sizing"
									src="img/<s:property value="imageUrl"/>">
							</div>
							<div class="col-xs-7 col-sm-7 col-md-7" align="left">
								<h4 class="media-heading">
									<s:property value="beanName" />
								</h4>
								産地：
								<s:property value="directFrom" />
								<br> 100グラム単価：
								<s:property value="price" />円
								<br>
								<s:property value="description" />
								<br>
								<!-- 棒グラフ -->
								苦さ
								<s:property value="bitterness" />
								<div class="progress">
									<div class="progress-bar progress-bar-success"
										role="progressbar"
										aria-valuenow="<s:property value="bitterness"/>"
										aria-valuemin="0" aria-valuemax="100"
										style="width: <s:property value="bitterness"/>%"></div>
								</div>
								酸味
								<s:property value="sourness" />
								<div class="progress">
									<div class="progress-bar progress-bar-warning"
										role="progressbar"
										aria-valuenow="<s:property value="sourness"/>"
										aria-valuemin="0" aria-valuemax="100"
										style="width: <s:property value="sourness"/>%"></div>
								</div>
								コク
								<s:property value="depth" />
								<div class="progress">
									<div class="progress-bar progress-bar-info" role="progressbar"
										aria-valuenow="<s:property value="depth"/>" aria-valuemin="0"
										aria-valuemax="100"
										style="width: <s:property value="depth"/>%"></div>
								</div>
								<!-- 棒グラフここまで　以下Gridを切ってテーブルを表示 -->
							</div>
						</div>
					</div>
					<table class="table table-bordered table-hover">
						<tr>
							<th class="col-xs-4 col-sm-4 col-md-4">商品名
							<th class="col-xs-3 col-sm-3 col-md-3">煎り方
							<th class="col-xs-2 col-sm-2 col-md-2">挽き方
							<th class="col-xs-1 col-sm-1 col-md-1">分量
							<th class="col-xs-1 col-sm-1 col-md-1">￥/100g
							<th class="col-xs-1 col-sm-1 col-md-1">購入
						<tr>
							<td><s:property value="beanName" />
							<td><div class="dropdown">
									<select name="beanRoast" class="selectpicker"
										onchange="if(beanRoast.value == 0||beanGrind.value == 0||gram.value == 0){submit.disabled = true;}else{submit.disabled = false;}">
										<option value="0">―</option>
										<option value="1">ライト・ロースト</option>
										<option value="2">シナモン・ロースト</option>
										<option value="3">ミディアム・ロースト</option>
										<option value="4">ハイ・ロースト</option>
										<option value="5">シティ・ロースト</option>
										<option value="6">フルシティ・ロースト</option>
										<option value="7">フレンチ・ロースト</option>
										<option value="8">イタリアン・ロースト</option>
									</select> <input type="hidden" name="dropdown-value" value="">
								</div>
							<td><div class="dropdown">
									<select name="beanGrind" class="selectpicker"
										onchange="if(beanRoast.value == 0 ||beanGrind.value == 0||gram.value == 0){submit.disabled = true;}else{submit.disabled = false;}">
										<option value="0">―</option>
										<option value="1">極細挽き</option>
										<option value="2">細挽き</option>
										<option value="3">中細挽き</option>
										<option value="4">中挽き</option>
										<option value="5">粗挽き</option>
									</select> <input type="hidden" name="dropdown-value" value="">
								</div>
							<td><div class="dropdown">
									<select name="gram" class="selectpicker"
										onchange="if(beanRoast.value == 0 ||beanGrind.value == 0||gram.value == 0){submit.disabled = true;}else{submit.disabled = false;}">
										<option value="0">―</option>
										<option value="100">100g</option>
										<option value="200">200g</option>
										<option value="300">300g</option>
										<option value="400">400g</option>
										<option value="500">500g</option>
									</select>
									<s:hidden name="goodsId" value="%{goodsId}" />
									<s:hidden name="beanName" value="%{beanName}" />
									<s:hidden name="price" value="%{price}" />
									<input type="hidden" name="dropdown-value" value="">
								</div>
							<td><s:property value="%{price}" />円
							<td><button class="btn btn-info" type="submit" name="submit"
									disabled>Buy</button>
						<tr>
					</table>
				</div>
			</s:form>
			<br>
			<br>
			<br>
		</s:if>

		<!-- 右に画像が来るversion -->
			 <s:elseif test="#stat.even">
			<s:form action="PurchaseSelectAction">
				<s:token />
				<div class="container">
					<div class="row">
						<div class="wow animated fadeInLeft">
							<div class="col-xs-7 col-sm-7 col-md-7" align="left">
								<h4 class="media-heading">
									<s:property value="beanName" />
								</h4>
								産地：
								<s:property value="directFrom" />
								<br> 100グラム単価：
								<s:property value="price" />円
								<br>
								<s:property value="description" />
								<br> 苦さ
								<s:property value="bitterness" />
								<div class="progress">
									<div class="progress-bar progress-bar-success"
										role="progressbar"
										aria-valuenow="<s:property value="bitterness"/>"
										aria-valuemin="0" aria-valuemax="100"
										style="width: <s:property value="bitterness"/>%"></div>
								</div>
								酸味
								<s:property value="sourness" />
								<div class="progress">
									<div class="progress-bar progress-bar-warning"
										role="progressbar"
										aria-valuenow="<s:property value="sourness"/>"
										aria-valuemin="0" aria-valuemax="100"
										style="width: <s:property value="sourness"/>%"></div>
								</div>
								コク
								<s:property value="depth" />
								<div class="progress">
									<div class="progress-bar progress-bar-info" role="progressbar"
										aria-valuenow="<s:property value="depth"/>" aria-valuemin="0"
										aria-valuemax="100"
										style="width: <s:property value="depth"/>%"></div>
								</div>
							</div>
							<div class="col-xs-5 col-sm-5 col-md-5" align="center">
								<br>
								<img class="media-object sizing"
									src="img/<s:property value="imageUrl"/>">
							</div>
						</div>
					</div>
					<!-- テーブルここから -->
					<table class="table table-bordered table-hover">
						<tr>
							<th class="col-xs-4 col-sm-4 col-md-4">商品名
							<th class="col-xs-3 col-sm-3 col-md-3">煎り方
							<th class="col-xs-2 col-sm-2 col-md-2">挽き方
							<th class="col-xs-1 col-sm-1 col-md-1">分量
							<th class="col-xs-1 col-sm-1 col-md-1">￥/100g
							<th class="col-xs-1 col-sm-1 col-md-1">購入
						<tr>
							<td><s:property value="beanName" />
							<td><div class="dropdown">
									<select name="beanRoast" class="selectpicker"
										onchange="if(beanRoast.value == 0||beanGrind.value == 0||gram.value == 0){submit.disabled = true;}else{submit.disabled = false;}">
										<option value="0">―</option>
										<option value="1">ライト・ロースト</option>
										<option value="2">シナモン・ロースト</option>
										<option value="3">ミディアム・ロースト</option>
										<option value="4">ハイ・ロースト</option>
										<option value="5">シティ・ロースト</option>
										<option value="6">フルシティ・ロースト</option>
										<option value="7">フレンチ・ロースト</option>
										<option value="8">イタリアン・ロースト</option>
									</select> <input type="hidden" name="dropdown-value" value="">
								</div>
							<td><div class="dropdown">
									<select name="beanGrind" class="selectpicker"
										onchange="if(beanRoast.value == 0 ||beanGrind.value == 0||gram.value == 0){submit.disabled = true;}else{submit.disabled = false;}">
										<option value="0">―</option>
										<option value="1">極細挽き</option>
										<option value="2">細挽き</option>
										<option value="3">中細挽き</option>
										<option value="4">中挽き</option>
										<option value="5">粗挽き</option>
									</select> <input type="hidden" name="dropdown-value" value="">
								</div>
							<td><div class="dropdown">
									<select name="gram" class="selectpicker"
										onchange="if(beanRoast.value == 0 ||beanGrind.value == 0||gram.value == 0){submit.disabled = true;}else{submit.disabled = false;}">
										<option value="0">―</option>
										<option value="100">100g</option>
										<option value="200">200g</option>
										<option value="300">300g</option>
										<option value="400">400g</option>
										<option value="500">500g</option>
									</select>
									<s:hidden name="goodsId" value="%{goodsId}" />
									<s:hidden name="beanName" value="%{beanName}" />
									<s:hidden name="price" value="%{price}" />
									<input type="hidden" name="dropdown-value" value="">
								</div>
							<td><s:property value="%{price}" />円
							<td><button class="btn btn-info" type="submit" name="submit"
									disabled>Buy</button>
						<tr>
					</table>


				</div>
			</s:form>
		</s:elseif>
		<br>
		<br>
		<br>

	</s:iterator>

	<br>
	<br>
	<div class="container">

	</div>

	<!-- 以下、プレミア会員のみが見れる隠しページここから -->
	<s:if test="%{#session.premiumId != null || #session.userName != null}">
	<div class="container">
	<hr style="border-color: #adff2f">
		<div align="center">
			<h2>Premium Course</h2>
			<a href="#premiumgazou" id="premium"></a>
			<p>
				プレミア会員様特別メニュー(^^)v☆<br> 以下の商品をご到着時間に合わせてお作りいたします。<br>
				１人でもプレミア会員様がいましたら、お連れ様の分もお作りいただけます。<br> お好みの焙煎度、挽き方でお待ちしております♪
			</p>
		</div>
	</div>
		<br>
		<br>
		<br>


		<!-- 参考資料　http://lopan.jp/css-animation/ -->
		<div class="container">
			<div class="row">
				<s:iterator value="#session.goodsInfoList">
					<div class="col-xs-3 col-sm-3 col-md-3">
						<a>
							<figure>
								<img id="hovering"
									src="img/<s:property value="premiumImageUrl"/>" width="220"
									height="220">
								<figcaption>
									<br>
									<br>
									<br>
									<br>
									<br>
									<br>
									<h5 class="white" align="center">
										<s:property value="beanName" />
									</h5>
								</figcaption>
							</figure>
						</a>
					</div>
				</s:iterator>
			</div>
			<br>
		</div>
		<br>
		<!-- テーブルここから -->
		<div class="container">
			<table class="table table-bordered table-hover">
				<tr>
					<th class="col-xs-4 col-sm-4 col-md-4">商品名
					<th class="col-xs-3 col-sm-3 col-md-3">煎り方
					<th class="col-xs-2 col-sm-2 col-md-2">挽き方
					<th class="col-xs-1 col-sm-1 col-md-1">人数
					<th class="col-xs-1 col-sm-1 col-md-1">¥/1杯
					<th class="col-xs-1 col-sm-1 col-md-1">購入
				<a id="premiumgazou"></a><!-- スクロールでここまで飛ぶ -->

					<s:iterator value="#session.goodsInfoList">
							<tr>
								<td><s:property value="beanName" /> <s:form
											action="PurchaseSelectAction">
											<s:token />
											<td><div class="dropdown">
													<select name="beanRoast" class="selectpicker"
														onchange="if(beanRoast.value == 0||beanGrind.value == 0||drink.value == 0){submit.disabled = true;}else{submit.disabled = false;}">
														<option value="0">―</option>
														<option value="1">ライト・ロースト</option>
														<option value="2">シナモン・ロースト</option>
														<option value="3">ミディアム・ロースト</option>
														<option value="4">ハイ・ロースト</option>
														<option value="5">シティ・ロースト</option>
														<option value="6">フルシティ・ロースト</option>
														<option value="7">フレンチ・ロースト</option>
														<option value="8">イタリアン・ロースト</option>
													</select> <input type="hidden" name="dropdown-value" value="">
												</div>
											<td><div class="dropdown">
													<select name="beanGrind" class="selectpicker"
														onchange="if(beanRoast.value == 0 ||beanGrind.value == 0||drink.value == 0){submit.disabled = true;}else{submit.disabled = false;}">
														<option value="0">―</option>
														<option value="1">極細挽き</option>
														<option value="2">細挽き</option>
														<option value="3">中細挽き</option>
														<option value="4">中挽き</option>
														<option value="5">粗挽き</option>
													</select> <input type="hidden" name="dropdown-value" value="">
												</div>
											<td><div class="dropdown">
													<select name="drink" class="selectpicker"
														onchange="if(beanRoast.value == 0 ||beanGrind.value == 0||drink.value == 0){submit.disabled = true;}else{submit.disabled = false;}">
														<option value="0">―</option>
														<option value="1">1名</option>
														<option value="2">2名</option>
														<option value="3">3名</option>
														<option value="4">4名</option>
														<option value="5">5名</option>
													</select>
													<s:hidden name="goodsId" value="%{goodsId}" />
													<s:hidden name="beanName" value="%{beanName}" />
													<s:hidden name="price" value="%{price*2}" />
													<input type="hidden" name="dropdown-value" value="">
												</div>
											<td><s:property value="%{price*2}" />円
											<td><button class="btn btn-info" type="submit"
													name="submit" disabled>Buy</button>
										</s:form>
						</s:iterator>
			</table>
		</div>
		<!-- テーブルここまで -->
	</s:if>
	<br>

	<!-- 以下、プレミア会員のみが見れる隠しページここまで -->


		<div class="container" align="center">
		<br>
		<div class="container">
			<hr style="border-color: #adff2f">
		</div>
		<br>
		<h3 align="center">商品カート</h3>
		<!-- テーブルここから -->

		<div id="cart" class="container">
			<table class="table table-bordered table-hover">
				<s:set name="firstFlg1" value="0" />
				<s:iterator value="#session.cartList" status="stat1">
					<s:if test="%{drink == 0}">
						<s:if test="%{#firstFlg1 == 0}">
							<center>コーヒー豆</center>
							<tr>
								<th width="25%">商品名
								<th width="20%">煎り方
								<th width="20%">挽き方
								<th width="10%">分量
								<th width="10%">￥/100g
								<th width="15%">豆ごとの小計 <s:set name="firstFlg1" value="1" />
						</s:if>
						<tr>
							<td><s:property value="beanName" /></td>
							<td><s:property value="roastName" /></td>
							<td><s:property value="grindName" /></td>
							<td><s:property value="gram" />g</td>
							<td><s:property value="price" />円</td>
							<td><s:property value="totalAmount" />円</td>
						</tr>
					</s:if>
				</s:iterator>
			</table>
			<br>
			<table class="table table-bordered table-hover">

				<s:set name="firstFlg2" value="0" />
				<s:iterator value="#session.cartList" status="stat2">
					<s:if test="%{drink > 0}">
						<s:if test="%{#firstFlg2 == 0}">
							<center>ドリンク</center>
							<tr>
								<th width="25%">商品名
								<th width="20%">煎り方
								<th width="20%">挽き方
								<th width="10%">人数
								<th width="10%">￥/1杯
								<th width="15%">豆ごとの小計 <s:set name="firstFlg2" value="1" />
						</s:if>
						<tr>
							<td><s:property value="beanName" /></td>
							<td><s:property value="roastName" /></td>
							<td><s:property value="grindName" /></td>
							<td><s:property value="drink" />名</td>
							<td><s:property value="price" />円</td>
							<td><s:property value="totalAmount" />円</td>

						</tr>
					</s:if>
				</s:iterator>
			</table>
		</div>
		<s:form action="PushCartAction">
			<s:token />
			<input type="submit" class="btn btn-info btn-lg" value="購入予約" />
		</s:form>
	</div>
	<div class="row">
		<div
			class="col-xs-3 col-sm-3 col-md-3 col-xs-offset-9 col-sm-offset-9 col-md-offset-9"
			align="center">
			<s:form action="BackStoreListAction" onSubmit="return check()">
				<input type="submit" class="btn btn-info btn-lg" value="店舗選択画面へ戻る">
			</s:form>
		</div>
	</div>

	<footer>
		<div align="center">Copyright Stardusts All rights reserved.</div>
		<br>
	</footer>

	<!-- scriptここから -->
	<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
	<script src="js/bootstrap-select.min.js"></script>
	<script>
		$(function() {
			$(".dropdown-menu li a")
					.click(
							function() {
								$(this)
										.parents('.dropdown')
										.find('.dropdown-toggle')
										.html(
												$(this).text()
														+ ' <span class="caret"></span>');
								$(this).parents('.dropdown').find(
										'input[name="dropdown-value"]').val(
										$(this).attr("data-value"));
							});
		});
	</script>
	<!-- セレクトタグ用 -->

	<script type="text/javascript">
	    $('.selectpicker').selectpicker({
			style : 'btn-default',
			size : 8
		});
	</script>


	<script type="text/javascript">
        $(window).on('load', function () {
            $('.selectpicker').selectpicker({
                'selectedText': 'cat'
            });
        });

	</script>
	<script type="text/javascript">
		function check() {
			if (window.confirm('店舗一覧画面に戻ってよろしいですか？\n（カート情報とログイン情報は破棄されます）')) {
				return true;
			} else {
				return false;
			}
		}
	</script>
	<!-- scriptここまで -->
	<!-- 文字のアニメーションをモバイルでオフにする -->
	<script>
    new WOW({mobile: false}).init();
  	</script>
	<!-- scriptここまで -->
</body>
</html>
