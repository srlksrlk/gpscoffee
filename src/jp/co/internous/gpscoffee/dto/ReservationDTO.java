package jp.co.internous.gpscoffee.dto;
/**
 * ResevrvationDTO  商品の予約情報を扱う
 * @author S.takiyoshi
 * @since 2015/04/30
 * @version 1.0
 */
public class ReservationDTO {

	/**
	 * @author S.takiyoshi
	 * @since 2015/04/30
	 * shopId		受注店舗ID
	 * inquiry		受注番号
	 * premiumId	プレミアム会員ID
	 * beanName		コーヒー豆の種類
	 * beanRoast	焙煎時間
	 * roastName	焙煎時間の名称
	 * beanGrind	挽き方
	 * grindName	挽き方の名称
	 * grindTime	挽く時間
	 * gram			受注グラム
	 * drink		ドリンク個数
	 * totalAmount	豆ごとの小計
	 * deliveryTime 商品受け渡し予定時刻
	 * reservationTime 予約受注時刻
	 * price		金額
	 * goodsId		商品ID
	 * roastTime	ロースト時間
	 * orderCode	識別用コード
	 * drink		ドリンク
	 * selectId		セレクトId
	 */

		private int goodsId;
		private int shopId;
		private int inquiry;
		private int price;
		private String premiumId;
		private String beanName;
		private int beanRoast;
		private String roastName;
		private int roastTime;
		private int beanGrind;
		private String grindName;
		private int grindTime;
		private int gram;
		private int drink;
		private int totalAmount;
		private String  deliveryTime;
		private String reservationTime;
		private int selectId;
		private int orderCode;

		/**
		 * 受注店舗ID取得メソッド
	     * @author S.takiyoshi
	     * @since2015/04/30
		 * @return shopId 受注店舗ID
		 */
		public int getShopId() {
			return shopId;
		}

		/**
		 * 受注店舗ID格納メソッド
	     * @author S.takiyoshi
	     * @since2015/04/30
		 * @param shopId 受注店舗ID
		 */
		public void setShopId(int shopId) {
			this.shopId = shopId;
		}

		/**
		 * 受注番号取得メソッド
	     * @author S.takiyoshi
	     * @since 2015/04/30
		 * @return inquiry 受注番号
		 */
		public int getInquiry() {
			return inquiry;
		}

		/**
		 * 受注番号格納メソッド
	     * @author S.takiyoshi
	     * @since 2015/04/30
		 * @param inquiry 受注番号
		 */
		public void setInquiry(int inquiry) {
			this.inquiry = inquiry;
		}

		/**
		 * プレミアム会員ID取得メソッド
	     * @author S.takiyoshi
	     * @since 2015/04/30
		 * @return premiumId プレミアム会員ID
		 */
		public String getPremiumId() {
			return premiumId;
		}

		/**
		 * プレミアム会員ID格納メソッド
	     * @author S.takiyoshi
	     * @since 2015/04/30
		 * @param premiumId プレミアム会員ID
		 */
		public void setPremiumId(String premiumId) {
			this.premiumId = premiumId;
		}

		/**
		 * コーヒー豆の種類取得メソッド
	     * @author S.takiyoshi
	     * @since 2015/04/30
		 * @return beanName コーヒー豆の種類
		 */
		public String getBeanName() {
			return beanName;
		}

		/**
		 * コーヒー豆の種類格納メソッド
	     * @author S.takiyoshi
	     * @since 2015/04/30
		 * @param beanName コーヒー豆の種類
		 */
		public void setBeanName(String beanName) {
			this.beanName = beanName;
		}

		/**
		 * 焙煎時間取得メソッド
	     * @author S.takiyoshi
	     * @since 2015/04/30
		 * @return beanRoast  焙煎時間
		 */
		public int getBeanRoast() {
			return beanRoast;
		}

		/**
		 * 焙煎時間格納メソッド
	     * @author S.takiyoshi
	     * @since 2015/04/30
		 * @param beanRoast  焙煎時間ID
		 */
		public void setBeanRoast(int beanRoast) {
			this.beanRoast = beanRoast;
		}

		/**
		 * 焙煎名称取得メソッド
	     * @author Y.Yamazaki
	     * @since 2015/05/14
		 * @return  roastName 焙煎時間の名称
		 */
		public String getRoastName() {
			return roastName;
		}

		/**
		 * 焙煎名称格納メソッド
	     * @author Y.Yamazaki
	     * @since 2015/05/14
		 * @param roastName  焙煎時間の名称
		 */
		public void setRoastName(String roastName) {
			this.roastName = roastName;
		}


		/**
		 * 焙煎する時間取得メソッド
	     * @author S.takiyoshi
	     * @since 2015/04/30
		 * @return  roastTime 焙煎する時間
		 */
		public int getRoastTime() {
			return roastTime;
		}

		/**
		 * 焙煎する時間を格納するメソッド
		 * @author Y.Gouda
		 * @since 2015/5/18
		 * @param roastTime 焙煎時間
		 */
		public void setRoastTime(int roastTime) {
			this.roastTime = roastTime;
		}

		/**
		 * 挽き方取得メソッド
	     * @author S.takiyoshi
	     * @since 2015/04/30
		 * @return  beanGrind 挽き方
		 */
		public int getBeanGrind() {
			return beanGrind;
		}

		/**
		 * 挽き方格納メソッド
	     * @author S.takiyoshi
	     * @since 2015/04/30
		 * @param  beanGrind 挽き方
		 */
		public void setBeanGrind(int beanGrind) {
			this.beanGrind = beanGrind;
		}


		/**
		 * 挽き方名称取得メソッド
	     * @author Y.Yamazaki
	     * @since 2015/05/14
		 * @return grindName 挽き方の名称
		 */
		public String getGrindName() {
			return grindName;
		}

		/**
		 * 挽き方名称格納メソッド
	     * @author Y.Yamazaki
	     * @since 2015/05/14
		 * @param grindName 挽き方の名称
		 */
		public void setGrindName(String grindName) {
			this.grindName = grindName;
		}


		/**
		 * 挽く時間取得メソッド
	     * @author Y.Yamazaki
	     * @since 2015/05/14
		 * @return grindTime 挽く時間
		 */
		public int getGrindTime(){
			return grindTime;
		}

		/**
		 * 挽く時間格納するメソッド
		 * @author Y.Gouda
		 * @since 2015/5/18
		 * @param grindTime 挽く時間
		 */
		public void setGrindTime(int grindTime) {
			this.grindTime = grindTime;
		}

		/**
		 * 受注グラム取得メソッド
	     * @author S.takiyoshi
	     * @since 2015/04/30
		 * @return gram 受注グラム
		 */
		public int getGram() {
			return gram;
		}

		/**
		 * 受注グラム格納メソッド
	     * @author S.takiyoshi
	     * @since 2015/04/30
		 * @param gram 受注グラム
		 */
		public void setGram(int gram) {
			this.gram = gram;
		}

		/**
		 * ドリンク個数取得メソッド
		 * @author Y.Matsukawa
		 * @since 2015/05/14
		 * @return drink
		 */
		public int getDrink() {
			return drink;
		}

		/**
		 * ドリンク個数格納メソッド
		 * @author Y.Matsukawa
		 * @since 2015/05/14
		 * @param drink セットする drink
		 */
		public void setDrink(int drink) {
			this.drink = drink;
		}

		/**
		 * 豆ごとの小計取得メソッド
	     * @author S.takiyoshi
	     * @since 2015/04/30
		 * @return totalAmount 豆ごとの小計
		 */
		public int getTotalAmount() {
			return totalAmount;
		}

		/**
		 * 豆ごとの小計格納メソッド
	     * @author S.takiyoshi
	     * @since 2015/04/30
		 * @param totalAmount 豆ごとの小計
		 */
		public void setTotalAmount(int totalAmount) {
			this.totalAmount = totalAmount;
		}

		/**
		 * 商品受け渡し予定時刻取得メソッド
		 * @author S.takiyoshi
		 * @since 2015/05/01
		 * @return deliveryTime 商品受け渡し時刻
		 */
		public String getDeliveryTime() {
			return deliveryTime;
		}

		/**
		 * 商品受け渡し予定時刻格納メソッド
		 * @author S.takiyoshi
		 * @since 2015/05/01
		 * @param deliveryTime 商品受け渡し時刻
		 */
		public void setDeliveryTime(String deliveryTime) {
			this.deliveryTime = deliveryTime;
		}

		/**
		 * 金額取得メソッド
		 * @author Y.Yamazaki
		 * @since 2015/05/11
		 * @return price 金額
		 */
		public int getPrice() {
			return price;
		}
		/**
		 * 金額格納メソッド
		 * @author Y.Yamazaki
		 * @since 2015/05/11
		 * @param price 金額
		 */
		public void setPrice(int price) {
			this.price = price;
		}

		/**
		 * グッズID取得メソッド
		 * @author Y.Yamazaki
		 * @since 2015/05/11
		 * @return goodsId グッズID
		 */
		public int getGoodsId() {
			return goodsId;
		}

		/**
		 * グッズID格納メソッド
		 * @author Y.Yamazaki
		 * @since 2015/05/11
		 * @param goodsId グッズID
		 */
		public void setGoodsId(int goodsId) {
			this.goodsId = goodsId;
		}

		/**
		 * 購入日時取得メソッド
		 * @author Y.Yamazaki
		 * @since 2015/05/11
		 * @return reservationTime 購入日時
		 */
		public String getReservationTime() {
			return reservationTime;
		}

		/**
		 * 金額格納メソッド
		 * @author Y.Yamazaki
		 * @since 2015/05/11
		 * @param reservationTime 購入日時
		 */
		public void setReservationTime(String reservationTime) {
			this.reservationTime = reservationTime;
		}

		/**
		 * セレクトID取得メソッド
		 * @author Y.Yamazaki
		 * @since 2015/05/11
		 * @return selectId セレクトId
		 */
		public int getSelectId() {
			return selectId;
		}

		/**
		 * セレクトID格納メソッド
		 * @author Y.Yamazaki
		 * @since 2015/05/11
		 * @param selectId セレクトId
		 */
		public void setSelectId(int selectId) {
			this.selectId = selectId;
		}

		/**
		 * 識別用コード取得メソッド
		 * @author Y.Matsukawa
		 * @since 2015/05/19
		 * @return orderCode
		 */
		public int getOrderCode() {
			return orderCode;
		}
		/**
		 * 識別用コード登録メソッド
		 * @author Y.Matsukawa
		 * @since 2015/05/19
		 * @param orderCode セットする orderCode
		 */
		public void setOrderCode(int orderCode) {
			this.orderCode = orderCode;
		}
}
