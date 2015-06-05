package jp.co.internous.gpscoffee.action;

import java.security.SecureRandom;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jp.co.internous.gpscoffee.dao.EditCompleteDAO;
import jp.co.internous.gpscoffee.dto.ReservationDTO;
import jp.co.internous.gpscoffee.util.ActionClass;

/**
 * EditCompleteAction カート内情報をDBテーブルreservationへインサートする
 * @author T.Matsuda
 * @since 2015/05/08
 * @version 1.0
 */
public class EditCompleteAction extends ActionClass{
	/**
	 * @author T.Matsuda
	 * @since 2015/05/08
	 * shopName 	店舗名
	 * zipcode 		店舗郵便番号
	 * shopAddress	店舗住所
	 * shopNumber 	店舗電話番号
	 * orderCode 	識別用コード
	 * deliveryTime 商品受け渡し時刻
	 */
	private String shopName;
	private String zipcode;
	private String shopAddress;
	private String shopNumber;
	private int orderCode;
	private Timestamp deliveryTime;
	/**
	 * カート内の商品をレコードとしてDBに格納し、購入完了画面に遷移するアクションクラス
	 * @author T.Matsuda
	 * @since 2015/05/18
	 * @version 1.0
	 * @return result EditCompleteDAOのinsertメソッドを実行し、trueが返ればSUCCESSを返す
	 */
	public String execute(){
		result = ERROR;
		List<ReservationDTO> cartList = new ArrayList<ReservationDTO>();
		if(sessionMap.containsKey("cartList")){
			cartList = (List<ReservationDTO>) sessionMap.get("cartList");
			SecureRandom secureRandom = new SecureRandom();
			orderCode = secureRandom.nextInt();
			if(orderCode < 0){
				orderCode *= -1;
			}
		} else {
			return result;
		}
		deliveryTime = compareToDeliveryTime();
		Iterator<ReservationDTO> it = cartList.iterator();
		while(it.hasNext()){
			ReservationDTO data = it.next();
			EditCompleteDAO dao = new EditCompleteDAO();
			if(sessionMap.get("premiumId") != null){
				if(data.getDrink() != 0){
					if(dao.insert((int)sessionMap.get("shopId"), data.getPremiumId(), data.getBeanName(), data.getBeanRoast(),
							data.getBeanGrind(), data.getGram(), data.getDrink(), data.getTotalAmount(), deliveryTime, orderCode)){
						result = SUCCESS;
					}
				} else {
					if(dao.insert((int)sessionMap.get("shopId"),data.getPremiumId(),data.getBeanName(),
							data.getBeanRoast(),data.getBeanGrind(), data.getGram(), data.getTotalAmount(), deliveryTime, orderCode)){
						result = SUCCESS;
					}
				}
			} else {
				if(dao.insert((int)sessionMap.get("shopId"),data.getBeanName(),data.getBeanRoast(),data.getBeanGrind(), data.getGram(), data.getTotalAmount(), deliveryTime, orderCode)){
					result = SUCCESS;
				}
			}
		}

		if(sessionMap.containsKey("shopId")){
			EditCompleteDAO dao = new EditCompleteDAO();
			if(dao.select((int)sessionMap.get("shopId"))){
				shopName=(dao.getShopName());
				zipcode=(dao.getZipcode());
				shopAddress=(dao.getShopAddress());
				shopNumber=(dao.getShopNumber());
			}
		}
		return result;
	}
	/**
	 * 現在時刻を取得し、そこから提供時刻を計算するメソッド
	 * @author Y.Gouda
	 * @since 2015/05/19
	 * @return deliveryTime 商品受け渡し時刻を返す
	 */
	private Timestamp compareToDeliveryTime (){
		deliveryTime = new Timestamp(System.currentTimeMillis());
		long costTime = deliveryTime.getTime();
		costTime += (int)sessionMap.get("deliveryTime") * 60 * 1000;
		deliveryTime.setTime(costTime);
		return deliveryTime;
	}
	/**
	 * 店舗名取得メソッド
	 * @author T.Matsuda
	 * @since 2015/05/18
	 * @version 1.0
	 * @return shopName 店舗名を返す
	 */
	public String getShopName() {
		return shopName;
	}
	/**
	 * 店舗名登録メソッド
	 * @author T.Matsuda
	 * @since 2015/05/18
	 * @version 1.0
	 * @param shopName 店舗名
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * 店舗郵便番号取得メソッド
	 * @author T.Matsuda
	 * @since 2015/05/18
	 * @version 1.0
	 * @return zipcode 店舗郵便番号を返す
	 */
	public String getZipcode() {
		return zipcode;
	}
	/**
	 * 店舗郵便番号登録メソッド
	 * @author T.Matsuda
	 * @since 2015/05/18
	 * @version 1.0
	 * @param zipcode 店舗郵便番号
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	/**
	 * 店舗住所取得メソッド
	 * @author T.Matsuda
	 * @since 2015/05/18
	 * @version 1.0
	 * @return shopAddress 店舗住所を返す
	 */
	public String getShopAddress() {
		return shopAddress;
	}
	/**
	 * 店舗住所登録メソッド
	 * @author T.Matsuda
	 * @since 2015/05/18
	 * @version 1.0
	 * @param shopAddress 店舗住所
	 */
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	/**
	 * 店舗電話番号取得メソッド
	 * @author T.Matsuda
	 * @since 2015/05/18
	 * @version 1.0
	 * @return shopNumber 店舗電話番号を返す
	 */
	public String getShopNumber() {
		return shopNumber;
	}
	/**
	 * 店舗電話番号登録メソッド
	 * @author T.Matsuda
	 * @since 2015/05/18
	 * @version 1.0
	 * @param shopNumber 店舗電話番号
	 */
	public void setShopNumber(String shopNumber) {
		this.shopNumber = shopNumber;
	}
	/**
	 * 識別用コード取得メソッド
	 * @author T.Matsuda
	 * @since 2015/05/18
	 * @version 1.0
	 * @return orderCode 識別用コードを返す
	 */
	public int getOrderCode() {
		return orderCode;
	}
	/**
	 * 識別用コード登録メソッド
	 * @author T.Matsuda
	 * @since 2015/05/18
	 * @version 1.0
	 * @param orderCode 識別用コード
	 */
	public void setOrderCode(int orderCode) {
		this.orderCode = orderCode;
	}
	/**
	 * 商品受け渡し時刻取得メソッド
	 * @author T.Matsuda
	 * @since 2015/05/18
	 * @version 1.0
	 * @return deliveryTime 商品受け渡し時刻を返す
	 */
	public Timestamp getDeliveryTime() {
		return deliveryTime;
	}
	/**
	 * 商品受け渡し時刻登録メソッド
	 * @author T.Matsuda
	 * @since 2015/05/18
	 * @version 1.0
	 * @param deliveryTime 商品受け渡し時刻
	 */
	public void setDeliveryTime(Timestamp deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
}

