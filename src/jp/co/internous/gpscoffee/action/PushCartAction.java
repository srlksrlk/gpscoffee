package jp.co.internous.gpscoffee.action;

import java.util.ArrayList;
import java.util.List;

import jp.co.internous.gpscoffee.dto.ReservationDTO;
import jp.co.internous.gpscoffee.util.ActionClass;

/**
 * PushCartAction カート内商品の加工時間と合計金額を加算し、購入確認画面に遷移させる
 * @author Y.okabe
 * @since 2015/05/08
 * @version 1.0
 */
public class PushCartAction extends ActionClass {
	/**
	 * @author Y.Okabe
	 * @since 2015/05/08
	 * cartList			 カートリスト
	 * costTime          コーヒー豆加工時間
	 * cartAmount        カート内の合計金額
	 * arrivalTime       ユーザー到着所要時間
	 */
	public List<ReservationDTO> cartList = new ArrayList<ReservationDTO>();
	private int costTime;
	private int cartAmount;
	private int arrivalTime;
	/**
	 * 合計金額と豆の準備所要時間を算出し、購入確認画面に遷移させるメソッド
     * @author Y.Okabe
     * @since 2015/05/08
	 * @return result ユーザー到着所要時間とカートリストがある場合SUCCESSを返す
	 */
	public String execute(){
		if(sessionMap.containsKey("arrivalTime")){
			arrivalTime = (int)sessionMap.get("arrivalTime");
		}
		if(sessionMap.containsKey("cartList")){
			cartList = (List<ReservationDTO>)sessionMap.get("cartList");
			for (int i = 0; i < cartList.size(); i++) {
				costTime += cartList.get(i).getRoastTime() + cartList.get(i).getGrindTime();
				cartAmount += cartList.get(i).getTotalAmount();
			}
			if(costTime <  arrivalTime){
				sessionMap.put("deliveryTime", arrivalTime);
			} else {
				sessionMap.put("deliveryTime", costTime);
			}
			sessionMap.put("cartAmount", cartAmount);
			result = SUCCESS;
		}else {
			result = ERROR;
		}
		return result;
	}
}
