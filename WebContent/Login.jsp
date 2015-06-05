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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="stylecss/Login.css" rel="stylesheet">
<link rel="shortcut icon" href="img/fab.ico" />
<link href="bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
<title>Premium Login</title>
</head>

<body>
	<br><br><br>
	<div align="center" class="container well">
		<!-- エラーメッセージ -->
		<s:if test="%{errorMessage!=null}">
			<font size="5" color="gold"><s:property value="errorMessage" /></font>
		</s:if>
		<div class="hero-unit">
			<s:form action="LoginPremiumAction" cssClass="form-inline">
			<s:token />
				<h1>Premium Login</h1>
				<p>来店時に受け取ったカードに記載されたID<br>
				その時にあなたが決めたPASSを入力してください。</p>
				<div class="form-group"><input name="premiumId" type="text" class="form-control" placeholder="ID"></div>
				<div class="form-group"><input name="premiumPass" type="password" class="form-control" placeholder="PASS"></div>
				<input name="LoginPremiumAction" type="submit" class="btn btn-primary" value="sign in">
			</s:form>
				<s:form action="BackGoodsAction"><br><br>
				<input type="submit" class="btn btn-default" value="戻る">
			</s:form>
		</div>
	</div>
	
</body>
</html>