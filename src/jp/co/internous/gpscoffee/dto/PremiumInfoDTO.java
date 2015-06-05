package jp.co.internous.gpscoffee.dto;

/**
 * LoginDTO
 * プレミアムユーザー情報を格納するクラス
 * @author Y.okabe
 * @since 2015/05/03
 *@version 1.0
 */
public class PremiumInfoDTO {
	/**
	 * @author Y.okabe
	 * @since 2015/05/05
	 * id アカウントID
	 * premiumId プレミアムID
	 * premiumPassWord プレミアムパスワード
	 * name 名前
	 * phoneNumber 電話番号
	 * registerDate 格納日時
	 * updateDate 更新日時
	 * deleteDate 削除日時
	 */
	private int id;
	private String premiumId;
	private String premiumPassWord;
	private String name;
	private String phoneNumber;
	private int registerDate;
	private int updateDate;
	private int deleteDate;
	/**
	 * アカウントID取得メソッド
	 * @author Y.okabe
	 * @since 2015/05/03
	 * @return id アカウントID
	 */
	public int getId() {
		return id;
	}
	/**
	 * アカウントID格納メソッド
	 * @author Y.okabe
	 * @since 2015/05/03
	 * @param id アカウントID
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * プレミアムID取得メソッド
	 * @author Y.okabe
	 * @since 2015/05/03
	 * @return premiumId プレミアムID
	 */
	public String getPremiumId() {
		return premiumId;
	}
	/**
	 * プレミアムID格納メソッド
	 * @author Y.okabe
	 * @since 2015/05/03
	 * @param premiumId プレミアムID
	 */
	public void setPremiumId(String premiumId) {
		this.premiumId = premiumId;
	}
	/**
	 * プレミアムパスワード取得メソッド
	 * @author Y.okabe
	 * @since 2015/05/03
	 * @return premiumPassWord プレミアムパスワード
	 */
	public String getPremiumPassWord() {
		return premiumPassWord;
	}
	/**
	 * プレミアムパスワード格納メソッド
	 * @author Y.okabe
	 * @since 2015/05/03
	 * @param premiumPassWord プレミアムパスワード
	 */
	public void setPremiumPassWord(String premiumPassWord) {
		this.premiumPassWord = premiumPassWord;
	}
	/**
	 * 名前取得メソッド
	 * @author Y.okabe
	 * @since 2015/05/03
	 * @return name 名前
	 */
	public String getName() {
		return name;
	}
	/**
	 * 名前格納メソッド
	 * @author Y.okabe
	 * @since 2015/05/03
	 * @param name 名前
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 電話番号取得メソッド
	 * @author Y.okabe
	 * @since 2015/05/03
	 * @return phoneNumber 電話番号
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * 電話番号格納メソッド
	 * @author Y.okabe
	 * @since 2015/05/03
	 * @param phoneNumber 電話番号
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * 格納日時取得メソッド
	 * @author Y.okabe
	 * @since 2015/05/03
	 * @return registerDate 格納日時
	 */
	public int getRegisterDate() {
		return registerDate;
	}
	/**
	 * 格納日時格納メソッド
	 * @author Y.okabe
	 * @since 2015/05/03
	 * @param registerDate 格納日時
	 */
	public void setRegisterDate(int registerDate) {
		this.registerDate = registerDate;
	}
	/**
	 * 更新日時取得メソッド
	 * @author Y.okabe
	 * @since 2015/05/03
	 * @return updateDate 更新日時
	 */
	public int getUpdateDate() {
		return updateDate;
	}
	/**
	 * 更新日時格納メソッド
	 * @author Y.okabe
	 * @since 2015/05/03
	 * @param updateDate 更新日時
	 */
	public void setUpdateDate(int updateDate) {
		this.updateDate = updateDate;
	}
	/**
	 * 削除日時取得メソッド
	 * @author Y.okabe
	 * @since 2015/05/03
	 * @return deleteDate 削除日時
	 */
	public int getDeleteDate() {
		return deleteDate;
	}
	/**
	 * 削除日時格納メソッド
	 * @author Y.okabe
	 * @since 2015/05/03
	 * @param deleteDate 削除日時
	 */
	public void setDeleteDate(int deleteDate) {
		this.deleteDate = deleteDate;
	}
}
