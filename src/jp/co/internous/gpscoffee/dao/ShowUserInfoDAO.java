package jp.co.internous.gpscoffee.dao;

import jp.co.internous.gpscoffee.util.DBconnector;
import jp.co.internous.gpscoffee.util.DaoClass;

/**
 * ShowUserInfoDAO  DBのpremium_membershipに存在する顧客情報をUserInfo.jspの指定フォームに表示するクラス
 * @author Y.Narita
 * @since 2015/05/08
 * @version 1.0
 */
public class ShowUserInfoDAO extends DaoClass {
    /**
     * @author Y.Narita
     * @since 2015/05/08
     * showName         表示させ名前
     * showPhoneNumber  表示させる電話番号
     * DBconnector      MySQLでデータベースへの接続を行う
     */
    private String showName;
    private String showPhoneNumber;
    DBconnector DBconnector = new DBconnector();
    /**
     * DBのpremium_membership内から取得したプレミアムIDを検索し、合致した顧客情報を取得するメソッド
     * @author Y.Narita
     * @since 2015/05/08
     * @param findPremiumId    検索に使用するプレミアムID
     * @return res  例外処理に入らなければtrueを返す
     */
    public boolean selectUserInfo(String findPremiumId){
        res = false ;
        try{
            con = DBconnector.getConnection();
            sql = "select * from premium_membership where premium_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1,findPremiumId);
            rs = ps.executeQuery();
            while(rs.next()){
                res = true;
                showName = rs.getString(4);
                showPhoneNumber = rs.getString(5);
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return res;
    }
    /**
     * 名前取得メソッド
     * @author Y.Narita
     * @since 2015/05/08
     * @return showName     取得した表示させる名前を変えす
     */
    public String getShowName() {
        return showName;
    }
    /**
     * 名前登録メソッド
     * @author Y.Narita
     * @since 2015/05/08
     * @param showName      表示させる名前
     */
    public void setShowName(String showName) {
        this.showName = showName;
    }
    /**
     * 電話番号取得メソッド
     * @author Y.Narita
     * @since 2015/05/08
     * @return showPhoneNumber  取得した表示させる電話番号を変えす
     */
    public String getShowPhoneNumber() {
        return showPhoneNumber;
    }
    /**
     * 電話番号登録メソッド
     * @author Y.Narita
     * @since 2015/05/08
     * @param showPhoneNumber       表示させる電話番号
     */
    public void setShowPhoneNumber(String showPhoneNumber) {
        this.showPhoneNumber = showPhoneNumber;
    }
}
