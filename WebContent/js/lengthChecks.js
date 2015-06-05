//指定した文字数を入力しないようにする
//Version            : 1.1
//Author             : Y.Narita
//

function adminLengthCheck() {
	administratorId = document.admin.administratorId.value;
	administratorPass = document.admin.administratorPass.value;
	var wordCount = 30;
	if ( administratorId.length > wordCount) {
		document.admin.administratorId.value="";
		alert(wordCount + "文字以内にしてください。");
	}
	var wordCount = 30;
	if ( administratorPass.length > wordCount) {
		document.admin.administratorPass.value="";
		alert(wordCount + "文字以内にしてください。");
	}
}

function userInfoLengthCheck(){
	name = document.insert.name.value;
	phoneNumber = document.insert.phoneNumber.value;
	premiumId = document.insert.premiumId.value;
	premiumPass = document.insert.premiumPass.value;
	premiumPassRekey = document.insert.premiumPassRekey.value;
	findPremiumId = document.find.findPremiumId.value;
	editName = document.edit.editName.value;
	editPhoneNumber = document.edit.editPhoneNumber.value;
	var wordCount = 50;
	if( name.length > wordCount){
		document.insert.name.value="";
		alert(wordCount + "文字以内にしてください。");
	}
	var wordCount = 11;
	if( phoneNumber.length > wordCount ){
		document.insert.phoneNumber.value="";
		alert(wordCount + "文字以内にしてください。");
	}
	var wordCount = 30;
	if( premiumId.length > wordCount ){
		document.insert.premiumId.value="";
		alert(wordCount + "文字以内にしてください。");
	}
	var wordCount = 30;
	if( premiumPass.length > wordCount ){
		document.insert.premiumPass.value="";
		alert(wordCount + "文字以内にしてください。");
	}
	var wordCount = 30;
	if( premiumPassRekey.length > wordCount ){
		document.insert.premiumPassRekey.value="";
		alert(wordCount + "文字以内にしてください。");
	}
	var wordCount = 30;
	if( findPremiumId.length > wordCount ){
		document.find.findPremiumId.value="";
		alert(wordCount + "文字以内にしてください。");
	}
	var wordCount = 50;
	if( editName.length > wordCount ){
		document.edit.editName.value="";
		alert(wordCount + "文字以内にしてください。");
	}
	var wordCount = 11;
	if( editPhoneNumber.length > wordCount ){
		document.edit.editPhoneNumber.value="";
		alert(wordCount + "文字以内にしてください。");
	}
}