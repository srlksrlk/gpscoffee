package jp.co.internous.gpscoffee.action;

import jp.co.internous.gpscoffee.dao.ShowUserInfoDAO;
import jp.co.internous.gpscoffee.util.ActionClass;

/**
 * ShowUserInfoAction  DBのpremium_membershipテーブルから顧客情報を取得しUserInfo.jsp内の指定フォームに表示するアクションクラス
 * @author Y.Narita
 * @since 2015/05/08
 * @version 1.0
 */
public class ShowUserInfoAction extends ActionClass {
    /**
	 * @author Y.Narita
	 * @since 2015/05/08
	 * findPremiumId       検索に使用するプレミアムID
	 * showName            表示させる名前
	 * showPhoneNumber     表示させる電話番号
	 * notice              エラー通知
	 */
    private String findPremiumId;
    private String showName;
    private String showPhoneNumber;
	private String notice;
	/**
	 * premium_membershipテーブルに存在する顧客情報を表示させるメソッド
	 * @author Y.Narita
	 * @since 2015/05/08
	 * @return result IDが正しければSUCCESSを返す
	 */
	public String execute(){
        ShowUserInfoDAO ShowUserInfoDao = new ShowUserInfoDAO();
        boolean res = ShowUserInfoDao.selectUserInfo(findPremiumId);

        if(res){
            setShowName(ShowUserInfoDao.getShowName());
            setShowPhoneNumber(ShowUserInfoDao.getShowPhoneNumber());
            result = SUCCESS;
        }else {
            result = ERROR;
            notice = "入力されたIDは登録されていません。再度入力してください";
        }
		return result;
	}
    /**
     * プレミアムID取得メソッド
     * @author Y.Narita
     * @since 2015/05/08
     * @return findPremiumId    取得した検索に使用するプレミアムIDを返す
     */
    public String getFindPremiumId() {
        return findPremiumId;
    }
    /**
     * プレミアムID登録メソッド
     * @author Y.Narita
     * @since 2015/05/08
     * @param findPremiumId     検索に使用するプレミアムIDs
     */
    public void setFindPremiumId(String findPremiumId) {
        this.findPremiumId = findPremiumId;
    }
    /**
     * 名前取得メソッド
     * @author Y.Narita
     * @since 2015/05/08
     * @return showName     取得した表示する名前を返す
     */
    public String getShowName() {
        return showName;
    }
    /**
     * 名前登録メソッド
     * @author Y.Narita
     * @since 2015/05/08
     * @param showName      表示する名前
     */
    public void setShowName(String showName) {
        this.showName = showName;
    }
    /**
     * 電話番号取得メソッド
     * @author Y.Narita
     * @since 2015/05/08
     * @return showPhoneNumber      取得した表示する電話番号を返す
     */
    public String getShowPhoneNumber() {
        return showPhoneNumber;
    }
    /**
     * 電話番号登録メソッド
     * @author Y.Narita
     * @since 2015/05/08
     * @param showPhoneNumber       表示する電話番号
     */
    public void setShowPhoneNumber(String showPhoneNumber) {
        this.showPhoneNumber = showPhoneNumber;
    }
    /**
     * エラー通知取得メソッド
     * @author Y.Narita
     * @since 2015/05/08
     * @return notice       取得したエラー通知を返す
     */
    public String getNotice() {
        return notice;
    }
    /**
     * エラー通知登録メソッド
     * @author Y.Narita
     * @since 2015/05/08
     * @param notice    エラー通知
     */
    public void setNotice(String notice) {
        this.notice = notice;
    }
}
