// フィールドが変更された場合に処理する関数
function fieldChanged(arg_id){
    console.log("-- fieldChanged arg_id:"+arg_id);

    //ids　の値を取得
    var obj_item_delete = getField("itemDelete"+arg_id);
	var obj_ids = getField("ids");
	var str_ids = obj_ids.getAttribute("value");

	//作業用配列へ格納
    var ary_ids = new Array;
    if(str_ids.length>0){ary_ids = str_ids.split(",");}
    console.log("str_ids:"+str_ids);
    console.log("ary_ids.length:"+ary_ids.length);
    //チェックを付けたidを追加
	if(obj_item_delete.checked){
		 ary_ids.push(arg_id);

	}

	//作業用配列　--　チェックが外れたidを除外
    var ary_ids_new = new Array;
    if(ary_ids.length>0){
    	for(i=0;i<ary_ids.length;i++){
    	    console.log("ary_ids["+i+"]:"+ary_ids[i]);
       		if(ary_ids[i]==arg_id){
       			if(obj_item_delete.checked){
       				ary_ids_new.push(ary_ids[i]);
       			}else{
       				//pushしない
       			}
       		}else{
       			ary_ids_new.push(ary_ids[i]);
       		}
       	}
   	}
    console.log("ary_ids.length:"+ary_ids.length);
    //ソートして　ids　へ戻す
    var str_ids_new="";
    if(ary_ids_new.length>0){
    	ary_ids_new.sort();
    	for(i=0;i<ary_ids_new.length;i++){
    		if(str_ids_new.length>0){str_ids_new = str_ids_new + ",";}
    	    console.log("ary_ids_new["+i+"]:"+ary_ids_new[i]);
    	    str_ids_new = str_ids_new + ary_ids_new[i];
    	}
    }
    console.log("str_ids_new:"+str_ids_new);
    obj_ids.setAttribute("value", str_ids_new);

}

// フィールドを取得する関数
function getField(fieldName){
    var field = document.getElementById(fieldName);
    if (field == undefined) {
        throw new Error("要素が見つかりません: " + fieldName);
    }
    return field;
}
