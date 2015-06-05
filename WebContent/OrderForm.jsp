<!--
-@author T.Senna 5/21
-@version 1.0
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="Thu, 01 Dec 1994 16:00:00 GMT">
<link href="bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="stylecss/OrderForm.css" rel="stylesheet">
<link href="img/fab.ico" rel="shortcut icon" />
<script src="js/cart.js"></script>
<title>Stardusts</title>
</head>

<body>
	<div align="center">
		<h2>購入確認画面</h2>
	</div>
	<br>
	<div class="container" align="right">
	<s:form action="BackGoodsAction">
		<s:token />
		<input type="submit" class="btn btn-default" value="商品一覧へ戻る" />
	</s:form>
	</div>
	<br>
	<s:set var="normalFlg" value="-1" />
	<s:set var="premiumFlg" value="-1" />
	<s:iterator value="#session.cartList">
		<s:if test="%{drink == 0}">
			<s:set var="normalFlg" value="1" />
		</s:if>
		<s:else>
			<s:set var="premiumFlg" value="1" />
		</s:else>
	</s:iterator>

	<div class="container">
		<s:if
			test="%{#session.cartList == null || #session.cartList.isEmpty()}">
			<FONT size="5"> <span><strong>予約がありません</strong></span>
			</FONT>
		</s:if>
		<s:elseif test="%{#normalFlg == 1}">
			<!-- イテレーターで商品表示テーブル -->
			<table class="table">
				<caption>コーヒー豆</caption>
				<tbody>
					<tr>
						<th width="20%">コーヒー豆の種類</th>
						<th width="20%">煎り方</th>
						<th width="20%">挽き方</th>
						<th width="15%">分量</th>
						<th width="15%">小計</th>
						<th width="10%"></th>

					</tr>
					<s:iterator value="#session.cartList">
						<s:if test="%{drink == 0}">
							<tr>
								<td><s:property value="beanName" /></td>
								<td><s:property value="RoastName" /></td>
								<td><s:property value="GrindName" /></td>
								<td><s:property value="gram" />g</td>
								<td><s:property value="totalAmount" />円</td>
								<!--選択削除用チェックボックス  -->
								<td>
								<s:form action="SelectDeleteCartAction">
								<input type="hidden" name="ids" value="<s:property value="selectId"/>" >
								<input type="submit" class="btn btn-default" value="削除">
								</s:form>

								</td>
							</tr>
						</s:if>

					</s:iterator>
				</tbody>
			</table>
		</s:elseif>
		<br>
		<s:if test="#session.premiumId != null && #premiumFlg==1">
			<table class="table">
				<caption>ドリンク</caption>
				<tbody>
					<tr>
						<th width="20%">コーヒー豆の種類</th>
						<th width="20%">煎り方</th>
						<th width="20%">挽き方</th>
						<th width="15%">人数</th>
						<th width="15%">小計</th>
						<th width="10%"></th>
					</tr>
					<s:iterator value="#session.cartList">
						<s:if test="%{drink != 0}">
							<tr>
								<td><s:property value="beanName" /></td>
								<td><s:property value="RoastName" /></td>
								<td><s:property value="GrindName" /></td>
								<td><s:property value="drink" />杯</td>
								<td><s:property value="totalAmount" />円</td>
								<!--選択削除用チェックボックス  -->
								<td>
								<s:form action="SelectDeleteCartAction">
								<input type="hidden" name="ids" value="<s:property value="selectId"/>" >
								<input type="submit" class="btn btn-default" value="削除">
								</s:form>
								</td>
							</tr>
						</s:if>
					</s:iterator>
					<!-- ここまで繰り返す -->
				</tbody>
			</table>
		</s:if>
		<br>
		<div align="right">
			合計金額
			<s:property value="#session.cartAmount" />
			円
		</div>
		<br>
		<div align="right">
			受け取りまでの最短時間
			<s:property value="#session.deliveryTime" />
			分
		</div>
		<br>
	</div>

		<div align="center">
		<s:form action="EditCompleteAction">
			<s:token />
			<input type="submit" class="btn btn-default btn-lg" value="購入確定" />
		</s:form>
		<br>
		<s:form action="DeleteCartAction">
			<input type="submit" class="btn btn-default" value="カートを空にする" />
		</s:form>
		</div>
</body>
</html>