<!--
-@author T.Senna 5/21
-@version 1.0
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="stylecss/Master.css" rel="stylesheet">
<link href="img/fab.ico" rel="shortcut icon" />
<script src="js/lengthChecks.js"></script>
<title>会員情報編集画面</title>
<script>
	window.onload = function(){
        document.Register.action = "GoUserInfoAction.action";
        document.Register.submit();
		}
</script>
</head>
<body>
	<div class="container-fluid">
		<div align="center">
			<h1>会員情報登録</h1>
			<div class="noticeFont">
				<s:property value="notice" />
				<br>
			</div>
		</div>
		<div class="row">

			<div class="col-xs-6">
				<div align="center">
					<s:form action="InsertUserInfoAction" name="insert">
						<s:token />
						<div class=formWidth>
							<h3>新規登録</h3><br>
							氏名<br> <input name="name" value="<s:property value="name" />" class="form-control"
								placeholder="氏名" required pattern="\S{1,50}"onkeyup="userInfoLengthCheck();" title="スペース無し、50文字以内でお願いします。" /><br>
							電話番号<br> <input name="phoneNumber" value="<s:property value="phoneNumber" />" class="form-control"
								type="tel" placeholder="08012345678" required pattern="\d{1,11}" onkeyup="userInfoLengthCheck();"
								title="半角数字11文字以内でお願いします。" /><br>
							プレミアムID<br> <input name="premiumId" value="<s:property value="premiumId" />"
								class="form-control" placeholder="id" required pattern="\w{4,30}" onkeyup="userInfoLengthCheck();"
								title="半角英数字 4～30文字以内でお願いします。" /><br>
							パスワード<br> <input name="premiumPass" value="<s:property value="premiumPass" />"
								class="form-control" type="password" placeholder="パスワード" required pattern="^(?=.*[0-9])(?=.*[a-z])[0-9a-z\-]{6,30}$"
								onkeyup="userInfoLengthCheck();" title="6文字以上30文字です。半角数字、半角英小文字、ハイフンを使用してください。数字、英小文字の混在の必要があります" /><br>
							パスワードの再入力<br> <input oncopy="return false" onpaste="return false" oncontextmenu="return false"name="premiumPassRekey" value="<s:property value="premiumPassRekey" />"
								class="form-control" type="password" placeholder="パスワード" required pattern="^(?=.*[0-9])(?=.*[a-z])[0-9a-z\-]{6,30}$"
								onkeyup="userInfoLengthCheck();" title="6文字以上30文字です。半角数字、半角英小文字、ハイフンを使用してください。数字、英小文字の混在の必要があります" /><br>
							<input type="submit" class="btn btn-default" value="新規登録">
						</div>
					</s:form>
				</div>
			</div>

			<div class="col-xs-6">
				<div align="center">
					<s:form action="ShowUserInfoAction" name="find">
					<s:token />
						<div class=formWidth>
							<h3>会員情報編集</h3>
							<br> プレミアムID<br> <input name="findPremiumId"
								value="<s:property value="findPremiumId" />"
								class="form-control" placeholder="id" required
								pattern="\w{4,30}" onkeyup="userInfoLengthCheck();"
								title="半角英数字 4～30文字以内でお願いします。" /><br> <input type="submit"
								class="btn btn-default" value="ID照会" /><br>
							<br>
						</div>
					</s:form>
					<s:form action="EditUserInfoAction" name="edit">
					<s:token />
						<input type="hidden" name="findPremiumId" value="<s:property value="findPremiumId" />">
						<div class=formWidth>
							変更前の氏名<br> <input name="showName"
								value="<s:property value="showName" />" type="text"
								readonly="readonly" class="form-control"><br>
							変更前の電話番号<br> <input name="showPhoneNumber"
								value="<s:property value="showPhoneNumber" />" type="text"
								readonly="readonly" class="form-control"><br>
							変更後の氏名<br> <input name="editName"
								value="<s:property value="editName" />" class="form-control"
								placeholder="氏名" required pattern="\S{1,30}"
								onkeyup="userInfoLengthCheck();" title="スペース無し、30文字以内でお願いします。" /><br>
							変更後の電話番号<br> <input name="editPhoneNumber"
								value="<s:property value="editPhoneNumber" />"
								class="form-control" type="tel" placeholder="08012345678"
								required pattern="\d{1,11}" onkeyup="userInfoLengthCheck();"
								title="半角数字11文字以内でお願いします。" /><br> <input type="submit"
								class="btn btn-default" value="更新" /><br>
							<br>
							<br>
						</div>
					</s:form>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-12">
			<div align="center">
				<s:form action="LogoutAdminAction">
					<input type="submit" class="btn btn-default" value="管理者ログアウト"/><br>
				</s:form>
				<br><br><br>
			</div>
		</div>
	</div>
</body>
</html>