package jp.co.internous.gpscoffee.dao;
import jp.co.internous.gpscoffee.util.DBconnector;
import jp.co.internous.gpscoffee.util.DaoClass;
/**
 * InsertUserInfoActionから取得したデータをDBのpremium_membershipに追加するDAOクラス
 * @author Y.Narita
 * @since 2015/05/04
 * @version 1.0
 */
public class InsertUserInfoDAO extends DaoClass {
    /**
     * @author Y.Narita
     * @since 2015/05/04
     * DBconnector      MySQLでデータベースへの接続を行う
     */
    DBconnector DBconnector = new DBconnector();
    /**
     * 取得したIDとDBのpremium_membershipに存在するIDを比較するメソッド
     * @author Y.Narita
     * @since 2015/05/04
     * @param premiumId プレミアムID
     * @return res 例外処理に入らなければtrueを返す
     */
    public boolean isCompareID(String premiumId){
        res = true ;
        try{
            con = DBconnector.getConnection();
            sql = "select * from premium_membership where premium_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1,premiumId);
            rs = ps.executeQuery();
            while(rs.next()){
                res = false;
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return res;
    }
    /**
     * 取得したパスワードが正しいか照合するメソッド
     * @author Y.Narita
     * @since 2015/05/04
     * @param premiumPass プレミアムパスワード
     * @param premiumPassRekey 再入力の
     * @return 必ず実行結果を返す
     */
    public boolean isComparePassword(String premiumPass,String premiumPassRekey){
        boolean result = false;
        if(premiumPass.equals(premiumPassRekey)){
            result = true;
        }
        return result;
    }
    /**
     * premium_membershipテーブルに顧客情報を追加するメソッド
     * @author Y.Narita
     * @since 2015/05/04
     * @param premiumId プレミアムID
     * @param premiumPass プレミアムパスワード
     * @param name 名前
     * @param phoneNumber 電話番号
     */
    public void insertCustomerInfo(String premiumId,String premiumPass,String name,
            String phoneNumber){
        try{
            con = DBconnector.getConnection();
            sql = "INSERT INTO premium_membership (premium_id,premium_pass,name,phone_number)"
                    + "VALUES (?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,premiumId);
            ps.setString(2,premiumPass);
            ps.setString(3,name);
            ps.setString(4,phoneNumber);
            ps.executeUpdate();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}