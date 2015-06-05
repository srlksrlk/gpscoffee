package jp.co.internous.gpscoffee.action;

import java.util.ArrayList;
import java.util.List;

import jp.co.internous.gpscoffee.dto.ReservationDTO;
import jp.co.internous.gpscoffee.util.ActionClass;

/**
 * SelectDeletetCartAction
 * カートの中のセッション情報を選択し、削除する
 * @author K.Nishikigawa
 * @since 2015/05/07
 * @version 1.0
 */
public class SelectDeleteCartAction extends ActionClass {
	/**
	 * @author K.Nishikigawa
	 * @since 2015/05/07
	 * ids 削除ID
	 */
	private String ids;
	/**
	 * 選択されたカート内商品を削除し、購入確認画面に遷移させるメソッド
	 * @author K.Nishikigawa
	 * @since 2015/5/07
	 * @return result 例外処理に入らなければSUCCESSを返す
	 */
	public String execute() {
		result=SUCCESS;
		String str = ids;
		if(str.length()>0){
			String[] idList = str.split(",", 0);
			int intId;
			List<ReservationDTO> cartList= new ArrayList<ReservationDTO>();
			if(sessionMap.containsKey("cartList")){
				cartList = (List<ReservationDTO>) sessionMap.get("cartList");
			}
			sessionMap.remove("cartList");
			for(int i = 0;i < cartList.size();i++){
				for(int j = 0;j < idList.length;j++){
					intId = Integer.parseInt(idList[j]);
					if(cartList.get(i).getSelectId() == intId){
						cartList.remove(i);
					}
				}
			}
			sessionMap.put("cartList",cartList);
		}
		return result;
	}
	/**
	 * 削除ID取得メソッド
	 * @author K.Nishikigawa
	 * @since 2015/5/07
	 * @return ids 削除IDを返す
	 */
	public String getIds() {
		return ids;
	}
	/**
	 * 削除ID登録メソッド
	 * @author K.Nishikigawa
	 * @since 2015/5/07
	 * @param ids 削除ID
	 */
	public void setIds(String ids) {
		this.ids = ids;
	}
}