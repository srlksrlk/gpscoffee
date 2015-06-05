package jp.co.internous.gpscoffee.action;

import jp.co.internous.gpscoffee.util.ActionClass;

/**
 * DeleteCartAction
 * カートの中のセッション情報を全て削除する
 * @author K.Nishikigawa
 * @since 2015/05/07
 * @version 1.0
 */
public class DeleteCartAction<ReservationDTO> extends ActionClass{
/**
 * @author K.Nishikigawa
 * @since 2015/05/07
 * message 処理完了を通知するメッセージ
 */
	private String message;
	/**
	 * カートリストをセッションから削除し、提供時刻と合計金額の再算出するメソッド
	 * @author K.Nishikigawa
	 * @since 2015/5/07
	 * @return result sessionの中にcartlistというキーがなければsuccessを格納し実行結果を返す
	 */
	public String execute() {
		result = ERROR;
		sessionMap.remove("cartList");
		sessionMap.put("deliveryTime", sessionMap.get("arrivalTime"));
		sessionMap.put("cartAmount", 0);
		if(!(sessionMap.containsKey("cartList"))){
				message = "全件削除しました";
				result = SUCCESS;
		}
		return result;
	}
	/**
	 * メッセージ取得メソッド
	 * @author K.Nishikigawa
	 * @since 2015/5/07
	 * @return message メッセージを返す
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * メッセージ格納メソッド
	 * @author K.Nishikigawa
	 * @since 2015/5/07
	 * @param message メッセージ
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}