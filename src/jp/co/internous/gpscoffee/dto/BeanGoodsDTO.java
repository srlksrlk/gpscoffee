package jp.co.internous.gpscoffee.dto;

/**
 * GoodsInfoDTO 商品情報を格納するクラス
 * @author K.Nishikigawa
 * @since 2015/4/30
 * @version 1.4
 */
public class BeanGoodsDTO {
	/**
	 * @author K.Nishikigawa
	 * @since 2015/4/30
	 * goodsId		商品ID
	 * beanName	    コーヒー豆の名称
	 * directFrom   産地
	 * price		グラム単価
	 * stock	    グラム在庫
	 * shopId	    管理店舗ID
	 * beanGrind 挽き具合の番号
	 * beanRoast 焙煎の番号
	 * totalAmount 商品種別の小計
	 * description コーヒー豆の説明
	 * bitterness 苦味の度合い
	 * sourness 酸味の度合い
	 * depth コクの度合い
	 * imageUrl 商品画像URL（相対パス）
	 * premiumImageUrl ドリンクメニュー用の商品画像URL（相対パス）
	 */

	private int goodsId;
	private String beanName;
	private String directFrom;
	private int price;
	private int stock;
	private int shopId;
	private int beanGrind;
	private int beanRoast;
	private int totalAmount;
	private String description;
	private int bitterness;
	private int sourness;
	private int depth;
	private String imageUrl;
	private String premiumImageUrl;
	/**
	 * 商品ID取得メソッド
	 * @author K.Nishikigawa
	 * @since 2015/4/30
	 * @return goodsId 商品IDを返す
	 */
	public int getGoodsId() {
		return goodsId;
	}
	/**
	 * 商品ID格納メソッド
	 * @author K.Nishikigawa
	 * @since 2015/4/30
	 * @param goodsId 商品IDを格納した変数
	 */
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	/**
	 * コーヒー豆の種類取得メソッド
	 * @author K.Nishikigawa
	 * @since 2015/4/30
	 * @return beanName コーヒー豆の種類を返す
	 */
	public String getBeanName() {
		return beanName;
	}
	/**
	 * コーヒー豆の種類格納メソッド
	 * @author K.Nishikigawa
	 * @since 2015/4/30
	 * @param beanName コーヒー豆の種類を格納した変数
	 */
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
	/**
	 * 産地取得メソッド
	 * @author K.Nishikigawa
	 * @since 2015/4/30
	 * @return directFrom 産地を返す
	 */
	public String getDirectFrom() {
		return directFrom;
	}
	/**
	 * 産地格納メソッド
	 * @author K.Nishikigawa
	 * @since 2015/4/30
	 * @param directFrom 産地を格納した変数
	 */
	public void setDirectFrom(String directFrom) {
		this.directFrom = directFrom;
	}
	/**
	 * グラム単価取得メソッド
	 * @author K.Nishikigawa
	 * @since 2015/4/30
	 * @return price グラム単価を返す
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * グラム単価格納メソッド
	 * @author K.Nishikigawa
	 * @since 2015/4/30
	 * @param price グラム単価を格納した変数
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * グラム在庫取得メソッド
	 * @author K.Nishikigawa
	 * @since 2015/4/30
	 * @return stock グラム在庫を返す
	 */
	public int getStock() {
		return stock;
	}
	/**
	 * グラム在庫格納メソッド
	 * @author K.Nishikigawa
	 * @since 2015/4/30
	 * @param stock グラム在庫を格納した変数
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}
	/**
	 * 管理店舗ID取得メソッド
	 * @author K.Nishikigawa
	 * @since 2015/4/30
	 * @return shopId 管理店舗IDを返す
	 */
	public int getShopId() {
		return shopId;
	}
	/**
	 * 管理店舗ID格納メソッド
	 * @author K.Nishikigawa
	 * @since 2015/4/30
	 * @param shopId 管理店舗IDを格納した変数
	 */
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	/**
	 * 合計金額格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/5/8
	 * @return totalAmount 合計金額を格納した変数
	 */
	public int getTotalAmount() {
		return totalAmount;
	}
	/**
	 * 合計金額格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/5/11
	 * @param totalAmount 合計金額を格納した変数
	 */
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * 粗さ格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/5/8
	 * @return	beanGrind 粗さを返す
	 */
	public int getBeanGrind() {
		return beanGrind;
	}
	/**
	 * 粗さ格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/5/8
	 * @param beanGrind 粗さを格納する変数
	 */
	public void setBeanGrind(int beanGrind) {
		this.beanGrind = beanGrind;
	}
	/**
	 * 焙煎時間格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/5/11
	 * @return beanRoast 焙煎時間を返す変数
	 */
	public int getBeanRoast() {
		return beanRoast;
	}
	/**
	 * 焙煎時間を格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/5/11
	 * @param beanRoast 焙煎時間を格納する変数
	 */
	public void setBeanRoast(int beanRoast) {
		this.beanRoast = beanRoast;
	}
	/**
	 * 商品説明文取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/5/11
	 * @return description 商品説明文
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 商品説明文格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/5/11
	 * @param description 商品説明文
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 苦味の度合い取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/5/11
	 * @return bitterness 苦味の度合い
	 */
	public int getBitterness() {
		return bitterness;
	}
	/**
	 * 苦味の度合い格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/5/11
	 * @param bitterness 苦味の度合い
	 */
	public void setBitterness(int bitterness) {
		this.bitterness = bitterness;
	}
	/**
	 * 酸味の度合い取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/5/11
	 * @return sourness 酸味の度合い
	 */
	public int getSourness() {
		return sourness;
	}
	/**
	 * 酸味の度合い格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/5/11
	 * @param sourness 酸味の度合い
	 */
	public void setSourness(int sourness) {
		this.sourness = sourness;
	}
	/**
	 * コクの度合い取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/5/11
	 * @return depth コクの度合い
	 */
	public int getDepth() {
		return depth;
	}
	/**
	 * コクの度合い格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/5/11
	 * @param depth コクの度合い
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}
	/**
	 * 商品画像URL取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/5/11
	 * @return imageUrl 商品画像URL
	 */
	public String getImageUrl() {
		return imageUrl;
	}
	/**
	 * 商品画像URL格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/5/11
	 * @param imageUrl セットする imageUrl
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	/**
	 * ドリンクメニュー用商品画像URL取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/5/11
	 * @return premiumImageUrl ドリンクメニュー用商品画像URL
	 */
	public String getPremiumImageUrl() {
		return premiumImageUrl;
	}
	/**
	 * ドリンクメニュー用商品画像URL格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/5/11
	 * @param premiumImageUrl ドリンクメニュー用商品画像URL
	 */
	public void setPremiumImageUrl(String premiumImageUrl) {
		this.premiumImageUrl = premiumImageUrl;
	}
}
