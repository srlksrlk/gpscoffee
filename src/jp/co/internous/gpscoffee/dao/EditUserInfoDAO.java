package jp.co.internous.gpscoffee.dao;

import jp.co.internous.gpscoffee.util.DBconnector;
import jp.co.internous.gpscoffee.util.DaoClass;

/**
 * EditUserInfoDAO  DB内のpremium_membershipテーブルに存在する顧客情報を変更するDAOクラス
 * @author Y.Narita
 * @since 2015/05/08
 * @version 1.0
 */
public class EditUserInfoDAO extends DaoClass {
    /**
     * @author Y.Narita
     * @since 2015/05/08
     * DBconnector      MySQLでデータベースへの接続を行う
     */
    DBconnector DBconnector = new DBconnector();
    /**
     * 入力フォームから取得したIDとDBのpremium_membershipに存在するIDを比較するメソッド
     * @author Y.Narita
     * @since 2015/05/08
     * @param findPremiumId    プレミアムID
     * @return res 例外処理に入らなければtrueを返す
     */
    public boolean isCheckID(String findPremiumId){
        res = false ;
        try{
            con = DBconnector.getConnection();
            sql = "select * from premium_membership where premium_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1,findPremiumId);
            rs = ps.executeQuery();
            while(rs.next()){
                res = true;
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return res;
    }
    /**
     * premium_membershipテーブルに存在する顧客情報を変更するメソッド
     * @author Y.Narita
     * @since 2015/05/08
     * @param editName              変更する名前
     * @param editPhoneNumber       変更する電話番号
     * @param findPremiumId         検索するプレミアムID
     */
    public void updatePremiumMembership(String editName,String editPhoneNumber,String findPremiumId){
        try{
            con = DBconnector.getConnection();
            sql = "update premium_membership set name = ? , phone_number = ? where premium_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1,editName);
            ps.setString(2,editPhoneNumber);
            ps.setString(3,findPremiumId);
            ps.executeUpdate();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
