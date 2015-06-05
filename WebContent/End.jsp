<!--
-@author T.Senna 5/21
-@version 1.0
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="stylecss/End.css" rel="stylesheet">
<link href="bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="shortcut icon" href="img/fab.ico" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?key=AIzaSyCGSVyE5hNDfUULO4E9Qwhbzy_DMw4987c&sensor=true"></script>
<script type="text/javascript" src="js/gps.js"></script>
<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
<title>Thanks！</title>
</head>
<body onload="initialize2()">
	<div class="title container">
		<h2>Thanks a Lot!</h2>
		<br>
		ご注文ありがとうございます(^^)v<br>
		会員カード、またはこちらのレシート画面を店舗にてお見せ下さい♪<br>
		出来たてをご用意してお待ちしております。<br><br>
		<br><br><br><br>
		<table class="table table-bordered">
		<tr>
		<th class="col-xs-4 col-sm-4 col-md-4">ご注文
		<th class="col-xs-6 col-sm-6 col-md-6">詳細

		<tr>
			<td>ご受注番号</td>
			<td><s:property value="orderCode"/></td>

		<s:set name="firstFlg1" value="0"/>
		<s:iterator value="#session.cartList" status="stat1">
			<s:if test="%{drink > 0}">
				<s:if test="%{#firstFlg1 == 0}">
					<tr><td>ドリンク<s:set name="firstFlg1" value="1"/><td>
				</s:if>
				<s:else>
					<br>
				</s:else>
				<s:property value="%{beanName}" />(<s:property value="GrindName" />:<s:property value="RoastName" />:<s:property value="%{drink}" />杯)
			</s:if>
		</s:iterator>
		<tr>

		<s:set name="firstFlg2" value="0"/>
		<s:iterator value="#session.cartList" status="stat2">
			<s:if test="%{drink == 0}">
				<s:if test="%{#firstFlg2 == 0}">
					<tr><td>豆の種類<s:set name="firstFlg2" value="1"/><td>
				</s:if>
				<s:else>
					<br>
				</s:else>
				<s:property value="%{beanName}" />(<s:property value="GrindName" />:<s:property value="RoastName" />:<s:property value="gram" />g)
			</s:if>
		</s:iterator>
		<tr>
			<td>最短ご案内時間
			<td><font color="#ff0000"><s:property value="#session.deliveryTime"/>分</font>
		<tr>
			<td>小計
			<td><s:property value="#session.cartAmount" />円


		</table>
		★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★<br>
		店舗情報　<s:property value="shopName"/><br>
		郵便番号　〒<s:property value="zipcode"/><br>
		住所　　　<s:property value="shopAddress"/><br>
		電話番号  <s:property value="shopNumber"/><br>
		最短提供可能時間 <font color="#ff0000"><em id="duration"> </em><br></font><br><br>

		<s:form method="post" name="GPS" id="gpsFrom">
			<div align="center">
			<input type="button" onclick="dia2()" class="btn btn-default btn-lg" value="現在位置を送信してルート検索"></div><br>
			<s:hidden name="lat" />
			<s:hidden name="lon" />
			<s:hidden name="address" />
			<s:hidden name="shopAddress" id="address" value="%{shopAddress}"/>
			<s:hidden name="lat2" />
			<s:hidden name="lon2" />
			<s:hidden name="duration" />
			<s:hidden name="distance" />
		</s:form>
		店舗MAP<br>
		<div id="map_canvas" style="width: 100%; height: 300px"></div>

		<br><br><br><br>
		<div align="center">
			<s:form action="BackStoreListAction">
			<input type="submit" class="btn btn-default btn-lg" value="店舗一覧に戻る" />
			</s:form>
		</div>
		</div><br><br>

</body>
</html>
