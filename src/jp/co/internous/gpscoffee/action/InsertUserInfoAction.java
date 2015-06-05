package jp.co.internous.gpscoffee.action;

import jp.co.internous.gpscoffee.dao.InsertUserInfoDAO;
import jp.co.internous.gpscoffee.util.ActionClass;

/**
 * InsertUserInfoAction UserInfo.jspから取得した顧客IDが重複がないかDBのpremium_membershipテーブルを確認し、存在しない場合同一テーブルに格納する
 * @author Y.Narita
 * @since 2015/05/04
 * @version 1.0
 */
public class InsertUserInfoAction extends ActionClass {
	/**
	 * @author Y.Narita
	 * @since 2015/05/04
	 * premiumId           プレミアムID
	 * premiumPass         プレミアムパスワード
	 * premiumPassRekey    再入力のプレミアムパスワード
	 * name                名前
	 * phoneNumber         電話番号
	 * notice              エラー通知
	 */
	private String premiumId;
	private String premiumPass;
	private String premiumPassRekey;
	private String name;
	private String phoneNumber;
	private String notice;
	/**
	 * 顧客情報をpremium_membershipテーブルに格納するメソッド
	 * @author Y.Narita
	 * @since 2015/05/04
	 * @return result  IDとPassが正しければSUCCESSを返す
	 */
	public String execute(){
		InsertUserInfoDAO InsertUserInfoDao = new InsertUserInfoDAO();
		boolean checkID = InsertUserInfoDao.isCompareID(premiumId);
		boolean checkPass = InsertUserInfoDao.isComparePassword(premiumPass, premiumPassRekey);
		if(checkID){
			if(checkPass){
				InsertUserInfoDao.insertCustomerInfo(premiumId,premiumPass,name,phoneNumber);
				notice = "登録が完了しました。";
				result = SUCCESS;
			}else{
				notice = "パスワードが正しくありません。再度入力してください";
				result = ERROR;
			}
		}else {
			result = ERROR;
			setNotice("すでにIDが登録されています。再度入力してください");
		}
		return result;
	}
	/**
	 * プレミアムID取得メソッド
	 * @author Y.Narita
	 * @since 2015/05/04
	 * @return premiumId プレミアムIDを返す
	 */
	public String getPremiumId() {
		return premiumId;
	}
	/**
	 * プレミアムID登録メソッド
	 * @author Y.Narita
	 * @since 2015/05/04
	 * @param premiumId プレミアムID
	 */
	public void setPremiumId(String premiumId) {
		this.premiumId = premiumId;
	}
	/**
	 * プレミアムパスワード取得メソッド
	 * @author Y.Narita
	 * @since 2015/05/04
	 * @return premiumPass プレミアムパスワードを返す
	 */
	public String getPremiumPass() {
		return premiumPass;
	}
	/**
	 * プレミアムパスワード登録メソッド
	 * @author Y.Narita
	 * @since 2015/05/04
	 * @param premiumPass プレミアムパスワード
	 */
	public void setPremiumPass(String premiumPass) {
		this.premiumPass = premiumPass;
	}
	/**
	 * 再入力のプレミアムパスワード取得メソッド
	 * @author Y.Narita
	 * @since 2015/05/04
	 * @return premiumPassRekey 再入力のプレミアムパスワードを返す
	 */
	public String getPremiumPassRekey() {
		return premiumPassRekey;
	}
	/**
	 * 再入力のプレミアムパスワード登録メソッド
	 * @author Y.Narita
	 * @since 2015/05/04
	 * @param premiumPassRekey 再入力のプレミアムパスワード
	 */
	public void setPremiumPassRekey(String premiumPassRekey) {
		this.premiumPassRekey = premiumPassRekey;
	}
	/**
	 * 名前取得メソッド
	 * @author Y.Narita
	 * @since 2015/05/04
	 * @return name 名前を返す
	 */
	public String getName() {
		return name;
	}
	/**
	 * 名前登録メソッド
	 * @author Y.Narita
	 * @since 2015/05/04
	 * @param name 名前
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 電話番号取得メソッド
	 * @author Y.Narita
	 * @since 2015/05/04
	 * @return phoneNumber 電話番号を返す
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * 電話番号登録メソッド
	 * @author Y.Narita
	 * @since 2015/05/04
	 * @param phoneNumber 電話番号
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * エラー通知取得メソッド
	 * @author Y.Narita
	 * @since 2015/05/04
	 * @return notice エラー通知を返す
	 */
	public String getNotice() {
		return notice;
	}
	/**
	 * エラー通知取得メソッド
	 * @author Y.Narita
	 * @since 2015/05/04
	 * @param notice エラー通知
	 */
	public void setNotice(String notice) {
		this.notice = notice;
	}
}
