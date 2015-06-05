package jp.co.internous.gpscoffee.dto;
/**
 * GoStorListDTO storeListの情報を格納するクラス
 * @author Y.Yamazaki
 * @since 2015/05/01
 * @version 1.0
 */
public class StoreListDTO {

	/**
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * shopId			 店舗ID
	 * shopName			 店舗名
	 * zipcode			 店舗郵便番号
	 * shopAddress		 店舗住所
	 * shopNumber		 店舗電話番号
	 * administratorId	 管理用ID
	 * administratorPass 管理パスワード
	 * administratorName 責任者名
	 */
	private int shopId;
	private String shopName;
	private String zipcode;
	private String shopAddress;
	private String shopNumber;
	private String administratorId;
	private String administratorPass;
	private String administratorName;

	/**
	 * 店舗ID取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @return shopId 店舗ID
	 */
	public int getShopId() {
		return shopId;
	}

	/**
	 *  店舗ID格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @param shopId 店舗ID
	 */
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	/**
	 * 店舗名取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @return shopName 店舗名
	 */
	public String getShopName() {
		return shopName;
	}

	/**
	 * 店舗名格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @param shopName 店舗名
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/**
	 * 店舗郵便番号取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @return zipcode 店舗郵便番号
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * 店舗郵便番号格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @param zipcode 店舗郵便番号
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 *  店舗住所取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @return  店舗住所
	 */
	public String getShopAddress() {
		return shopAddress;
	}

	/**
	 *  店舗住所格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @param shopAddress 店舗住所
	 */
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	/**
	 * 店舗電話番号取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @return shopNumber 店舗電話番号
	 */
	public String getShopNumber() {
		return shopNumber;
	}

	/**
	 * 店舗電話番号格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @param shopNumber 店舗電話番号
	 */
	public void setShopNumber(String shopNumber) {
		this.shopNumber = shopNumber;
	}

	/**
	 * 管理用ID取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @return administratorId 管理用ID
	 */
	public String getAdministratorId() {
		return administratorId;
	}

	/**
	 * 管理用ID格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @param administratorId 管理用ID
	 */
	public void setAdministratorId(String administratorId) {
		this.administratorId = administratorId;
	}

	/**
	 * 管理パスワード取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @return administratorPass 管理パスワード
	 */
	public String getAdministratorPass() {
		return administratorPass;
	}

	/**
	 * 管理パスワード格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @param administratorPass 管理パスワード
	 */
	public void setAdministratorPass(String administratorPass) {
		this.administratorPass = administratorPass;
	}

	/**
	 * 責任者名取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @return administratorName 責任者名
	 */
	public String getAdministratorName() {
		return administratorName;
	}

	/**
	 * 責任者名格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @param administratorName 責任者名
	 */
	public void setAdministratorName(String administratorName) {
		this.administratorName = administratorName;
	}
}
