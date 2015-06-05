function sendMail(){
	if(document.mail.Name.value != "" && document.mail.mailNo.value != "" && document.mail.inquiry.value  != ""){
	  $.ajax({
	    type: "POST",
	    url: "https://mandrillapp.com/api/1.0/messages/send.json",
	    data: {
	      'key': 'igt4UST_hHSKoFO9alfKKA',
	      'message': {
	        'from_email': document.mail.mailNo.value,
	        'to': [
	          {
	            'email': 'cafe.stardusts@gmail.com',
	            'name': 'Stardusts',
	            'type': 'to'
	          }
	        ],
	        'subject': document.mail.Name.value,
	        'text': document.mail.inquiry.value,      }
	    }
	  });
	alert('お問い合わせ有難う御座います(^_^)');
	document.mail.Name.value = "";
	document.mail.mailNo.value = "";
	document.mail.inquiry.value = "";
	}
	else{
	alert('必須項目を入力してください。');
	}

}