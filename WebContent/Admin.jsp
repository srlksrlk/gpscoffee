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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8ß">
<link href="bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="stylecss/Master.css" rel="stylesheet">
<link rel="shortcut icon" href="img/fab.ico" />
<script src="js/lengthChecks.js"></script>
<title>管理者ログイン画面</title>
</head>
<body>

	<div align="center">
		<br> <br>
		<h1>管理者用ログイン画面</h1><br><br>
			<s:form class="well" action="LoginAdminAction" name="admin">
			<s:token />
				<label for="id"><div align="left">管理者ID</div><s:textfield type="text"
						name="administratorId" value="" class="formcon1"
						id="administratorId" size="20" pattern="\w{1,30}"
						title="30文字以内で入力してください。" onkeyup="adminLengthCheck();"/></label>
				
				<br>
				<label for="pass"><div align="left">管理者パスワード</div><s:textfield
						type="password" name="administratorPass" value="" class="formcon2"
						id="administratorPass" size="20" pattern="\w{1,30}"
						title="30文字以内で入力してください。" onkeyup="adminLengthCheck();"/></label>
						<br>
				
				<input type="submit" class="btn btn-default" value="管理者ログイン" />
			</s:form>
			<br>
			<s:form name = "test">
			<s:hidden name="errorMessage" value="%{errorMessage}"/>
			</s:form>
			<script type = "text/javascript">
			if(test.errorMessage.value){
			var errorMessage = document.test.errorMessage.value;
			alert(errorMessage);
			}
			</script>
	</div>
</body>
</html>