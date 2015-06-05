package jp.co.internous.gpscoffee.action;

import jp.co.internous.gpscoffee.dao.EditUserInfoDAO;
import jp.co.internous.gpscoffee.util.ActionClass;

/**
 * EditUserInfoAction   DB内のpremium_membershipテーブルに存在する顧客情報を変更するActionクラス
 * @author Y.Narita
 * @since 2015/05/08
 * @version 1.0
 */
public class EditUserInfoAction extends ActionClass {
    /**
     * @author Y.Narita
     * @since 2015/05/08
     * editName          変更する名前
     * editPhoneNumber   変更する電話番号
     * findPremiumId     検索するプレミアム会員ID
     * notice            エラー通知
     */
    private String editName;
    private String editPhoneNumber;
    private String findPremiumId;
    private String notice;
    /**
     * premium_membershipテーブルに格納された顧客情報を変更するメソッド
     * @author Y.Narita
     * @since 2015/05/08
     * @return result IDが正しければSUCCESSを返す
     */
    public String execute(){
        EditUserInfoDAO EditUserInfoDAO = new EditUserInfoDAO();
        boolean checkID = EditUserInfoDAO.isCheckID(findPremiumId);
        if(checkID){
            EditUserInfoDAO.updatePremiumMembership(editName,editPhoneNumber,findPremiumId);
            notice = "変更が完了しました。";
            result = SUCCESS;
        }else {
            notice = "入力されたIDは登録されていません。再度入力してください";
            result = ERROR;
        }
        return result;
    }
    /**
     * 変更する名前取得メソッド
     * @author Y.Narita
     * @since 2015/05/8
     * @return editName 変更する名前を返す
     */
    public String getEditName() {
        return editName;
    }
    /**
     * 変更する名前登録メソッド
     * @author Y.Narita
     * @since 2015/05/8
     * @param editName 変更する名前
     */
    public void setEditName(String editName) {
        this.editName = editName;
    }
    /**
     * 電話番号取得メソッド
     * @author Y.Narita
     * @since 2015/05/8
     * @return phoneNumber 電話番号を返す
     */
    public String getEditPhoneNumber() {
        return editPhoneNumber;
    }
    /**
     * 電話番号登録メソッド
     * @author Y.Narita
     * @since 2015/05/8
     * @param editPhoneNumber 電話番号
     */
    public void setEditPhoneNumber(String editPhoneNumber) {
        this.editPhoneNumber = editPhoneNumber;
    }
    /**
     * 検索するプレミアム会員ID取得メソッド
     * @author Y.Narita
     * @since 2015/05/8
     * @return findPremiumId 検索するプレミアムIDを返す
     */
    public String getFindPremiumId() {
        return findPremiumId;
    }
    /**
     * 検索するプレミアム会員ID登録メソッド
     * @author Y.Narita
     * @since 2015/05/8
     * @param findPremiumId 検索するプレミアムID
     */
    public void setFindPremiumId(String findPremiumId) {
        this.findPremiumId = findPremiumId;
    }
    /**
     * エラー通知取得メソッド
     * @author Y.Narita
     * @since 2015/05/8
     * @return notice エラー通知を返す
     */
    public String getNotice() {
        return notice;
    }
    /**
     * エラー通知登録メソッド
     * @author Y.Narita
     * @since 2015/05/8
     * @param notice エラー通知
     */
    public void setNotice(String notice) {
        this.notice = notice;
    }
}