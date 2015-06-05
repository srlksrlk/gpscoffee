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
	<link href="stylecss/StoreList.css" rel="stylesheet">
	<link href="stylecss/animate.css" rel="stylesheet">
	<link href="stylecss/bootstrap-select.min.css" rel="stylesheet" />
	<link href="stylecss/bootstrap-select.css" rel="stylesheet" >
	<link href="http://cdn.jsdelivr.net/animatecss/3.1.0/animate.css" rel="stylesheet" />
	<link href="img/fab.ico" rel="shortcut icon" />
	<link href="stylecss/slideshow.css" rel="stylesheet">
	<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script type="text/javascript" src="https://maps.google.com/maps/api/js?sensor=false"></script>
	<script type="text/javascript" src="js/utils.js"></script>
	<script type="text/javascript" src="js/gps.js"></script>
	<script type="text/javascript" src="js/wow.min.js"></script>
	<script type="text/javascript" src="js/mail.js"></script>
	<script type="text/javascript" src="js/css_browser_selector.js"></script>
	<script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?key=AIzaSyCGSVyE5hNDfUULO4E9Qwhbzy_DMw4987c&sensor=true"></script>
	<!-- スクロールのscriptここから -->
	<!-- スクロールの記述 -->
	<script type="text/javascript">
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
	</script>
	<!-- scriptここまで -->
	<title>Stardusts Stores</title>
</head>
<!-- bodyここから -->
<body onload="initialize()" onunload="GUnload()">
	<a id="top"></a>
	<!-- fixed navigation ここから-->
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Stardusts</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="#about" id=top>About</a></li>
					<li><a href="#twitter" id=top>Twitter＆Facebook</a></li>
					<li><a href="#map" id=top>MAP＆Shops</a></li>
					<li><a href="#staff" id=top>Staff</a></li>
					<li><a href="#contact" id=top>Contact</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#top"><span
							class="glyphicon glyphicon-hand-up" aria-hidden="true"></span></a></li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- fixed navigation ここまで-->
	<a href="#top" id="top"></a><br><!-- "Stardusts"と"↑"のでここまでスクロールする -->
	<!-- TOPカルーセルここから -->
  <div id="pcontainer">
      <div id="photo1" class="frame"></div>
      <div id="photo2" class="frame"></div>
      <div id="photo3" class="frame"></div>
      <div id="photo4" class="frame"></div>
      <div id="photo5" class="frame"></div> 
  </div>
   <img src="img/popslide/Top1.jpg" id="toumei" > <!-- 透明の画像 -->	
   <div class="row"><div class="col-xs-12 col-sm-12 col-md-12"></div></div>
	<!-- TOPカルーセルここまで -->
	<a href="#about" id="about"></a><!-- Aboutでここまでスクロールする -->
	<div class="container" align="center">
		<div class="wow animated fadeInLeft"><img id="emb" src="img/Emb1.png"/></div>
		<div class="col-xs-12 col-sm-12 col-md-12">
			<div class="wow animated zoomIn"><h2><br><br><br>美味しいコーヒーを探す旅へようこそ！</h2></div>
			<div class="about"><img id="about" src="img/About1.png"></div>
			<p>
				人それぞれに好きな食べ物があるように<br>人それぞれに好きなコーヒーの味があります。<br>
				私達は自家焙煎の研究を十数年に渡り研究、解析。<br>
				あなたにとって最も美味しいコーヒーを仕上げられるよう技術力を高めました。<br><br>
				コーヒーの美味しさは豆だけではなく、焙煎時間、粗さ、丁寧なハンドピックなど<br>
				様々な要因が重なり合って生み出されています。<br> <br> 
				その究極美、そして到着と同時に飲める心地よさを当店でご堪能くださいませ。<br>
				あの味、奥深さ、落ち着き、その魅力。<br>
				"好みのコーヒー探し"という旅に行きませんか？<br> <br> <br> <br>
			</p>
		</div>
		<div class="row">
			<div class="col-xs-12 col-md-4" align="center">
				<div class="wow animated fadeInDownBig">
					<h4>世界初GPS機能搭載<br>コーヒーショップ</h4>
				</div>
				<div class="about"><img id="about" src="img/About2.png"></div><br>
				<p align="left"><br>
					私達はより新鮮で挽きたてのコーヒー豆を
					お客様の来店と同時に提供することができます。
					それは、お客様がこのGPScoffeeを活用することによって
					こちらが指定した来店時間ぴったりに
					焙煎とグラインドを済ませておくことが出来るからです。<br><br>
				</p>
			</div>
	
			<div class="col-xs-12 col-md-4" align="center">
				<div class="wow animated fadeInDownBig">
					<h4>23区の店舗を用意</h4></div>
				<div class="about"><img id="about" src="img/About3.png"></div><br>
				<p align="left"><br>
					お客様が23区のどこにいても、当ページを使って最短で行ける店舗お探し下さい。
					また、どこの店舗でも最短ルートをお出し出来ます。
					また、店舗によって変わる商品もありますので、ご注意下さい。
					もし、全てのコーヒーを飲み比べたい場合は、西新宿１丁目本店へお越しください。
					最も多くのコーヒー、焙煎度合い、挽き方をお好きにお選びいただけます。<br><br>
				</p>
			</div>
			<div class="col-xs-12 col-md-4" align="center">
				<div class="wow animated fadeInDownBig">
					<h4>プレミア会員へのグレードアップで<br>プロの味をあなたに</h4></div>
				<div class="about"><img id="about" src="img/About4.png"></div>
				<br>
				<p align="left">
					もしあなたが当店のプレミア会員に興味があれば
					一度来店してみることをおすすめします。
					当店の豆を購入していただくことで 専用の会員カードを発行いただけます。
					そのカードはあなたに新しいコーヒーの旅を手助ける
					頼もしい友人となることでしょう。
				</p>
			</div>
		</div>
	</div>
	<a href="#twitter" id=twitter></a><!-- Twitter＆Facebookのスクロールで飛んでくる -->
	<br><br><br>
	<!-- ソーシャルプラグインここから -->
	<div class="container">
		<div class="row">
			<div class="col-xs-3 col-sm-3 col-md-3 col-xs-offset-9 col-sm-offset-9 col-md-offset-9">
			<!-- Twitter -->
			<a href="https://twitter.com/Stardustscafe" class="twitter-follow-button" 
				data-show-count="false" data-lang="ja">@Stardustscafeさんをフォロー</a>
			<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);}}(document, 'script', 'twitter-wjs');</script>
			<!-- Facebook -->
			<div id="fb-root"></div>
			<script>(function(d, s, id) {
			  var js, fjs = d.getElementsByTagName(s)[0];
			  if (d.getElementById(id)) return;
			  js = d.createElement(s); js.id = id;
			  js.src = "//connect.facebook.net/ja_JP/sdk.js#xfbml=1&version=v2.3";
			  fjs.parentNode.insertBefore(js, fjs);
			}(document, 'script', 'facebook-jssdk'));
			</script>
			<div class="fb-like" data-href="https://www.facebook.com/Stardusts.cafe" data-width="400" data-layout="button_count" data-action="like" data-show-faces="true" data-share="false"></div>
			</div>
		</div>
	</div>
	<!-- ソーシャルプラグインここまで --><br>
	
	<!-- Twitter & Facebook Plugin ここから　-->
	<div class="container">
		<div class="well">
			<!-- Twitter Plugin -->
			<div class="row">
				<div class="col-md-6 col-xs-12" align="center">
					<br> <a class="twitter-timeline"
						href="https://twitter.com/Stardustscafe"
						data-widget-id="597957291174862848">@Stardustscafeさんのツイート</a>
					<script>
						!function(d, s, id) {
							var js, fjs = d.getElementsByTagName(s)[0], p = /^http:/
									.test(d.location) ? 'http' : 'https';
							if (!d.getElementById(id)) {
								js = d.createElement(s);
								js.id = id;
								js.src = p
										+ "://platform.twitter.com/widgets.js";
								fjs.parentNode.insertBefore(js, fjs);
							}
						}(document, "script", "twitter-wjs");
					</script>
				</div><br>
				<!-- FacebookPage Plugin -->
			<div align="center" class="col-md-6 col-xs-12">
				<div class="fb-page" data-href="https://www.facebook.com/Stardusts.cafe"
					data-width="625" data-height="600" data-hide-cover="false"
					data-show-facepile="true" data-show-posts="true">
					<div class="fb-xfbml-parse-ignore">
						<blockquote cite="https://www.facebook.com/Stardusts.cafe">
							<a href="https://www.facebook.com/Stardusts.cafe">Stardusts</a>
						</blockquote>
					</div>
				</div>
				<div id="fb-root"></div>
				<script>
					(function(d, s, id) {
						var js, fjs = d.getElementsByTagName(s)[0];
						if (d.getElementById(id))
							return;
						js = d.createElement(s);
						js.id = id;
						js.src = "//connect.facebook.net/ja_JP/sdk.js#xfbml=1&version=v2.3";
						fjs.parentNode.insertBefore(js, fjs);
					}(document, 'script', 'facebook-jssdk'));
				</script>
			</div>
		</div>
	</div>
</div>
<!-- Twitter & Facebook Plugin ここまで　-->

	<br><br><br><br>
	<a href="map" id="map"></a><!-- Map＆shopでここまで飛ぶ。 -->

	<!-- MAPここから -->
	<div align="center">
		<div class="wow animated zoomInDown">
			<h2>現在地から店舗をご選択ください。</h2></div>
		</div><br>
	<div id="map_canvas" style="width: 100%; height: 300px"></div><br>
	<!-- MAP -->
	<div class="container">
		<s:form action="EnterStoreAction" method="post" name="GPS" id="gpsFrom">
			<s:hidden name="lat" />
			<s:hidden name="lon" />
			<s:hidden name="address" />
			<!-- ここから -->
			<s:hidden name="lat2" />
			<s:hidden name="lon2" />
			<s:hidden name="duration" />
			<s:hidden name="distance" />
			<!-- ここまでこのまま！ -->
			<div align="center">
				<input class="btn btn-default" type="button" onclick="dia()" value="現在位置取得">
				<span class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true"></span>
				<s:select name="shopAddress" id="address" onchange="search2()"
					headerKey="" headerValue="店舗を選択" list="#session.storeList"
					listValue="%{shopName}" listKey="%{shopAddress}"
					cssClass="selectpicker" /><br><br> 
				移動時間：<font color="#ff0000"><em id="duration"> </em></font><br><br>
				<input class="btn btn-primary btn-lg" type="submit" name="GoGoodsJsp"
					value="選択した店舗のページへ">
			</div>
		</s:form>
	</div>
	<!-- MAPここまで -->
	<br><br><br><br><br>
	<!-- STAFFメニュー -->
	<hr>
	<a href="#staff" id="staff"></a>
	<div class="container well">
		<div class="wow animated zoomInRight">
			<h3 align="left">素敵なスタッフを紹介します</h3>
		</div><br><br>
		
		<!-- 左２人ここから -->
		<div class="row">
			<div class="col-xs-12 col-md-6">
				<div class="media">
					<a class="pull-left"><img id="stafflist"
						class="media-object" src="img/Matsukawa.jpg" /></a>
				<div class="media-body">
						<h4 class="media-heading">店長：まっちゃん<br><br></h4>
						<p>好きな動物：ネコ<br> 趣味：ネコ、猫、cats、もしくはイヌと並ぶ代表的なペットねこ</p>
					</div>
				</div>
			</div>
			<div class="col-xs-12 col-md-6">
				<div class="media">
					<a class="pull-left"><img id="stafflist"
						class="media-object" src="img/Okamoto.jpg" /></a>
					<div class="media-body">
						<h4 class="media-heading">店員：岡本隊長<br><br></h4>
						<p>好きな動物：シロクマ<br> 趣味：お絵かき</p>
					</div>
				</div>
			</div>
		</div>
		<!-- 左２人ここまだ -->
		<!-- 右２人ここから -->
		<div class="row">
			<div class="col-xs-12 col-md-6">
				<div class="media">
					<a class="pull-right"><img id="stafflist"
						class="media-object" src="img/Takahashi.jpg" /></a>
					<!--  画像の差し込み left rightを設定 -->
					<div class="media-body">
						<!-- 以下文章 -->
						<h4 class="media-heading">店員：ゆずっち<br><br></h4>
						<p>好きな動物：プレーリードッグ<br> 趣味：ゲーム、アニメ、ミュージック</p>
					</div>
				</div>
			</div>
			<div class="col-xs-12 col-md-6">
				<div class="media">
					<a class="pull-right"><img id="stafflist"
						class="media-object" src="img/Iwase.jpg" /></a>
					<div class="media-body">
						<h4 class="media-heading">店員：いわせくん<br><br></h4>
						<p>好きな動物：シャチ<br>趣味：野球観戦、野球をすること</p>
					</div>
				</div>
			</div>
		</div>
		<!-- 右２人ここから -->
	</div><!-- //container well// -->

	<a href="#contact" id=contact></a><!-- Contactでここまで飛ぶ -->
	
	<!-- お問い合わせフォームここから -->
	<!-- フォームの中身の入力制限ここから-->
	<script>
	function check(){
		var flag = 0;
		// 設定開始（必須にする項目を設定してください）
		if(document.mail.Name.value == ""){ // 名前入力欄の入力チェック
			flag = 1;
		}
		else if(document.mail.mailNo.value == ""){ // メールアドレスの入力チェック
			flag = 1;
		}
		else if(document.mail.inquiry.value == ""){ // 問い合わせ内容の入力チェック
			flag = 1;
		}

		if(flag){
			window.alert('必須項目に未入力があります'); // 入力漏れがあれば警告ダイアログを表示
			return false; // 送信を中止
		}
		else{
			return true; // 送信を実行
		}
	}
  	</script>
 	<!-- フォームの中身の入力制限ここまで-->
 	<!-- メールアドレスの正規表現ここから -->
 	
 	<script type="text/javascript">
    function chkRegEmail(str){
    	/* @が含まれていて、最後が .(ドット)でないなら正しいとする */
        var Seiki=/[!#-9A-~]+@+[a-z0-9]+.+[^.]$/i;
        if(str!=""){
            if(str.match(Seiki)){
                return true;
            }else{
                alert("メールアドレスの形式が不正です");
                document.mail.mailNo.value = "";
                return false;
            }
        }else{
           //何も入力されていない時はutils.jsの方に権利を委託する
            return false;
        }
    }
</script>
<!-- メールアドレスの正規表現ここまで -->

	<div class="container">
		<div class="row">
			<div class="col-md-8 col-xs-12">
				<div class="wow animated zoomInRight"><h2>お問い合わせはこちらから</h2></div>
				<form class="form-horizontal" name="mail">	
					<span class=" glyphicon glyphicon-user"> 名前（10文字以内） ※必須</span>
					<div class="form-group">
						<input type="text" name="Name" maxlength="10" class="form-control" placeholder="Name" required/>
					</div>
					<span class="glyphicon glyphicon-envelope"> メールアドレス（50文字以内） ※必須(お間違えのないようご注意ください。)</span>
					<div class="form-group">
						<input type="email" name="mailNo" maxlength="50" class="form-control" placeholder="example@gmail.com" required/>
					</div>	
					<span class=" glyphicon glyphicon glyphicon-pencil"> お問い合わせ内容（200文字以内）
						※必須</span>
					<div class="form-group">
						<textarea name="inquiry" maxlength="200" class="form-control" rows="10" required></textarea>
					</div>	
					<div class="form-group">
					<input type="button" class="btn btn-primary" value="送信" 
						onClick="chkRegEmail(this.form.mailNo.value); sendMail()" />
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- お問い合わせフォームここまで -->
	<!-- scriptここから -->
	<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script><!-- Bootstrap -->
	<script src="js/bootstrap-select.min.js"></script><!-- Bootstrapと相性の良いセレクトタグ作成用js -->
	<!--スクロール用 -->
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
	<!-- 文字のアニメーションをモバイルでオフにする -->
	<script>
    new WOW({mobile: false}).init();
  	</script>
  	
	<!-- scriptここまで -->
</body>
</html>