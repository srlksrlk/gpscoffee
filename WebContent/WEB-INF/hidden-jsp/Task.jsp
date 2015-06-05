<!--
-@author T.Senna 5/21
-@version 1.0
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="stylecss/Master.css" rel="stylesheet">
<link rel="shortcut icon" href="img/fab.ico" />
<title>注文情報画面</title>
<script type="text/javascript">
   function MoveCheck(){
      var res = confirm("選択した注文情報に間違いはありませんか？");
      if( res == true ) {
    	  return true;
      }else{
    	  return false;
      }
   }
</script>
</head>
<body>
<div class="container">
	<h1>予約情報</h1>
	<div align="right">
	<s:form action = "GoUserInfoAction">
	<input type="submit" class="btn btn-default" value="会員情報登録" />
	</s:form><br><br>
	<s:form action = "GoStatistics">
    <input type="hidden" name=shopId value="<s:property value="#session.shopId"/>"/>
	<input type="submit" class="btn btn-default" value="統計画面" />
	</s:form>
	</div>
		<s:property value="#session.shop_name" />
		<br> 管理者
		<s:property value="#session.administrator_name" />
		さん

	<table class="table">
		<tr>
			<th>受注番号</th>
			<th>プレミアム会員ID</th>
			<th>コーヒー豆の種類</th>
			<th>注文数</th>
			<th>小計</th>
			<th>注文受注時刻</th>
			<th>受け渡し予定時刻</th>
			<th>識別用コード</th>
			<th></th>
		</tr>
		<s:iterator value="#session.reservation">
			<tr>
				<s:form action="DeliveryAcceptAction" onsubmit="return MoveCheck();">
				<s:token />
					<td><s:property value="%{inquiry}"/></td>
					<td>
					<s:if test="%{premiumId != null}">
					<s:property value="%{premiumId}"/>
					<s:hidden name="premiumId" value="%{premiumId}"/>
					</s:if>
					<s:else>
					ゲスト
					</s:else>
					</td>
					<td><s:property value="%{beanName}"/>
					</td>
					<td>
					<s:if test="%{drink != 0}">
					<s:property value="%{drink}"/>杯
					</s:if>
					<s:else>
					<s:property value="%{gram}"/>g
					</s:else>
					</td>
					<td><s:property value="%{totalAmount}" /></td>
					<td><s:property value="%{reservationTime}"/></td>
					<td><s:property value="%{deliveryTime}" /></td>
					<td><s:property value="%{orderCode}" /></td>
					<s:hidden name="shopId" value="%{shopId}"/>
					<s:hidden name="inquiry" value="%{inquiry}"/>
					<s:hidden name="beanName" value="%{beanName}"/>
					<s:hidden name="beanRoast" value="%{beanRoast}"/>
					<s:hidden name="beanGrind" value="%{beanGrind}"/>
					<s:hidden name="drink" value="%{drink}"/>
					<s:hidden name="gram" value="%{gram}"/>
					<s:hidden name="totalAmount" value="%{totalAmount}"/>
					<s:hidden name="orderCode" value="%{orderCode}"/>
					<td><input type="submit" value="提供完了" /></td>
				</s:form>
		</s:iterator>
	</table>
	<s:form action = "LogoutAdminAction">
	<div align="right">
	<input type="submit" class="btn btn-default" value="管理者ログアウト" />
	</div>
	</s:form>
	</div>
</body>
</html>