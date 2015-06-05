package jp.co.internous.gpscoffee.action;

import java.util.ArrayList;
import java.util.List;

import jp.co.internous.gpscoffee.dao.DeliveryAcceptDAO;
import jp.co.internous.gpscoffee.dto.ReservationDTO;
import jp.co.internous.gpscoffee.util.ActionClass;
/**
 * DeliveryAcceptAction　提供完了ボタンが押下された際の処理を行うアクションクラス
 * @author Y.Matsukawa
 * @since 2015/5/02
 * @version 1.0
 */
public class DeliveryAcceptAction extends ActionClass{
	/**
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * reservation	予約情報
	 * shopId		店舗ID
	 * inquiry		受注番号
	 * premiumId	プレミアム会員ID
	 * beanName		コーヒー豆の種類
	 * beanRoast	焙煎時間
	 * beanGrind	挽き方
	 * gram			受注グラム
	 * totalAmount	豆ごとの小計
	 * orderCode	識別用コード
	 */
	private List<ReservationDTO> reservation = new ArrayList<ReservationDTO>();
	private int shopId;
	private int inquiry;
	private String premiumId;
	private String beanName;
	private int beanRoast;
	private int beanGrind;
	private int gram;
	private int drink;
	private int totalAmount;
	private int orderCode;
	/**
	 * 選択された注文情報をDBreservationから削除及びhistoryへと追加しresultを返す実行メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return result	DBhistoryテーブルへのinsertが成功し例外処理に入らなければSUCCESSを返す
	 */
	public String execute() {
		reservation = (List<ReservationDTO>)sessionMap.get("reservation");
		DeliveryAcceptDAO dao = new DeliveryAcceptDAO();
		try{
			if(premiumId != null){
				if(drink != 0){
					if(dao.insert(shopId, inquiry, premiumId, beanName, beanRoast, beanGrind, gram, drink, totalAmount, orderCode)){
						for(int i = 0; i < reservation.size(); i++){
							if(inquiry == reservation.get(i).getInquiry()){
								reservation.remove(i);
								dao.delete(inquiry);
							}
						}
					}
				}else{
					if(dao.insert(shopId, inquiry, premiumId, beanName, beanRoast, beanGrind, gram, totalAmount, orderCode)){
						for(int i = 0; i < reservation.size(); i++){
							if(inquiry == reservation.get(i).getInquiry()){
								reservation.remove(i);
								dao.delete(inquiry);
							}
						}
					}
				}
			}else{
				if(dao.insert(shopId, inquiry, beanName, beanRoast, beanGrind, gram, totalAmount, orderCode)){
					for(int i = 0; i < reservation.size(); i++){
						if(inquiry == reservation.get(i).getInquiry()){
							reservation.remove(i);
							dao.delete(inquiry);
						}
					}
				}
			}
			result = SUCCESS;
		}catch (Exception e) {
			e.printStackTrace();

		}
		return result;
	}
	/**
	 * 予約情報取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return reservation　予約情報を返す
	 */
	public List<ReservationDTO> getReservation() {
		return reservation;
	}
	/**
	 * 店舗ID取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return shopId 店舗IDを返す
	 */
	public int getShopId() {
		return shopId;
	}
	/**
	 * 店舗ID登録メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/03
	 * @param shopId 店舗ID
	 */
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	/**
	 * 受注番号取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return inquiry 受注番号を返す
	 */
	public int getInquiry() {
		return inquiry;
	}
	/**
	 * 受注番号登録メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @param inquiry 受注番号
	 */
	public void setInquiry(int inquiry) {
		this.inquiry = inquiry;
	}
	/**
	 * プレミアム会員ID取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return premiumId プレミアム会員IDを返す
	 */
	public String getPremiumId() {
		return premiumId;
	}
	/**
	 * プレミアム会員ID登録メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @param premiumId プレミアム会員ID
	 */
	public void setPremiumId(String premiumId) {
		this.premiumId = premiumId;
	}
	/**
	 * コーヒー豆の種類取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return beanName コーヒー豆の種類を返す
	 */
	public String getBeanName() {
		return beanName;
	}
	/**
	 * コーヒー豆の種類登録メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @param beanName コーヒー豆の種類
	 */
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
	/**
	 * 焙煎時間取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return beanRoast 焙煎時間
	 */
	public int getBeanRoast() {
		return beanRoast;
	}
	/**
	 * 焙煎時間登録メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @param beanRoast 焙煎時間
	 */
	public void setBeanRoast(int beanRoast) {
		this.beanRoast = beanRoast;
	}
	/**
	 * 挽き方取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return beanGrind 挽き方
	 */
	public int getBeanGrind() {
		return beanGrind;
	}
	/**
	 * 挽き方登録メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @param beanGrind 挽き方
	 */
	public void setBeanGrind(int beanGrind) {
		this.beanGrind = beanGrind;
	}
	/**
	 * 受注グラム取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return gram 受注グラムを返す
	 */
	public int getGram() {
		return gram;
	}
	/**
	 * 受注グラム登録メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @param gram 受注グラム
	 */
	public void setGram(int gram) {
		this.gram = gram;
	}
	/**
	 * ドリンク個数取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/14
	 * @return drink ドリンク個数を返す
	 */
	public int getDrink() {
		return drink;
	}
	/**
	 * ドリンク個数登録メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/14
	 * @param drink ドリンク個数
	 */
	public void setDrink(int drink) {
		this.drink = drink;
	}
	/**
	 * 豆ごとの小計取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return totalAmount 豆ごとの小計を返す
	 */
	public int getTotalAmount() {
		return totalAmount;
	}
	/**
	 * 豆ごとの小計登録メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @param totalAmount 豆ごとの小計
	 */
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * 識別用コード取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/19
	 * @return orderCode 識別用コードを返す
	 */
	public int getOrderCode() {
		return orderCode;
	}
	/**
	 * 識別用コード登録メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/19
	 * @param orderCode 識別用コード
	 */
	public void setOrderCode(int orderCode) {
		this.orderCode = orderCode;
	}
}
