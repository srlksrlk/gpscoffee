package jp.co.internous.gpscoffee.dto;
/**
 * HistoryDTO  商品の履歴情報を扱う
 * @author S.takiyoshi
 * @since 2015/05/01
 * @version 1.0
 */

public class HistoryDTO {

	/**
	 * @author S.takiyoshi
	 * @since 2015/05/01
	 * shopId		受注店舗ID
	 * inquiry		受注番号
	 * premiumId	プレミアム会員ID
	 * beanName		コーヒー豆の種類
	 * beanRoast	焙煎方法
	 * beanGrind	挽き方
	 * gram			受注グラム
	 * totalAmount	豆ごとの小計
	 * deliveryTime 商品受け渡し時刻
	 */

	private int shopId;
	private int inquiry;
	private String premiumId;
	private String beanName;
	private int beanRoast;
	private int beanGrind;
	private int gram;
	private int totalAmount;
	private String  deliveryTime;

	/**
	 * 受注店舗ID取得メソッド
	 * @author S.takiyoshi
	 * @since 2015/05/01
	 * @return shopId 受注店舗ID
	 */
	public int getShopId() {
		return shopId;
	}

	/**
	 * 受注店舗ID格納メソッド
	 * @author S.takiyoshi
	 * @since 2015/05/01
	 * @param shopId 受注店舗ID
	 */
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	/**
	 * 受注番号取得メソッド
	 * @author S.takiyoshi
	 * @since 2015/05/01
	 * @return inquiry 受注番号
	 */
	public int getInquiry() {
		return inquiry;
	}

	/**
	 * 受注番号格納メソッド
	 * @author S.takiyoshi
	 * @since 2015/05/01
	 * @param inquiry 受注番号
	 */
	public void setInquiry(int inquiry) {
		this.inquiry = inquiry;
	}

	/**
	 * プレミアム会員ID取得メソッド
	 * @author S.takiyoshi
	 * @since 2015/05/01
	 * @return premiumId プレミアム会員ID
	 */
	public String getPremiumId() {
		return premiumId;
	}

	/**
	 * プレミアム会員ID格納メソッド
	 * @author S.takiyoshi
	 * @since 2015/05/01
	 * @param premiumId プレミアム会員ID
	 */
	public void setPremiumId(String premiumId) {
		this.premiumId = premiumId;
	}

	/**
	 * コーヒー豆の種類取得メソッド
	 * @author S.takiyoshi
	 * @since 2015/05/01
	 * @return beanName コーヒー豆の種類
	 */
	public String getBeanName() {
		return beanName;
	}

	/**
	 * コーヒー豆の種類格納メソッド
	 * @author S.takiyoshi
	 * @since 2015/05/01
	 * @param beanName コーヒー豆の種類
	 */
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	/**
	 * 焙煎方法取得メソッド
	 * @author S.takiyoshi
	 * @since 2015/05/01
	 * @return beanRoast  焙煎方法
	 */
	public int getBeanRoast() {
		return beanRoast;
	}

	/**
	 * 焙煎方法格納メソッド
	 * @author S.takiyoshi
	 * @since 2015/05/01
	 * @param beanRoast  焙煎方法
	 */
	public void setBeanRoast(int beanRoast) {
		this.beanRoast = beanRoast;
	}

	/**
	 * 挽き方取得メソッド
	 * @author S.takiyoshi
	 * @since 2015/05/01
	 * @return  beanGrind 挽き方
	 */
	public int getBeanGrind() {
		return beanGrind;
	}

	/**
	 * 挽き方格納メソッド
	 * @author S.takiyoshi
	 * @since 2015/05/01
	 * @param  beanGrind 挽き方
	 */
	public void setBeanGrind(int beanGrind) {
		this.beanGrind = beanGrind;
	}

	/**
	 * 受注グラム取得メソッド
	 * @author S.takiyoshi
	 * @since 2015/05/01
	 * @return gram 受注グラム
	 */
	public int getGram() {
		return gram;
	}

	/**
	 * 受注グラム格納メソッド
	 * @author S.takiyoshi
	 * @since 2015/05/01
	 * @param gram 受注グラム
	 */
	public void setGram(int gram) {
		this.gram = gram;
	}

	/**
	 * 豆ごとの小計取得メソッド
	 * @author S.takiyoshi
	 * @since 2015/05/01
	 * @return totalAmount 豆ごとの小計
	 */
	public int getTotalAmount() {
		return totalAmount;
	}

	/**
	 * 豆ごとの小計格納メソッド
	 * @author S.takiyoshi
	 * @since 2015/05/01
	 * @param totalAmount 豆ごとの小計
	 */
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * 商品受け渡し時刻取得メソッド
	 * @author S.takiyoshi
	 * @since 2015/05/01
	 * @return deliveryTime 商品受け渡し時刻
	 */
	public String getDeliveryTime() {
		return deliveryTime;
	}

	/**
	 *商品受け渡し時刻格納メソッド
	 * @author S.takiyoshi
	 * @since 2015/05/01
	 * @param deliveryTime 商品受け渡し時刻
	 */
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
}
