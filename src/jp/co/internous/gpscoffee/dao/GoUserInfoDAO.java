package jp.co.internous.gpscoffee.dao;

import jp.co.internous.gpscoffee.util.DBconnector;
import jp.co.internous.gpscoffee.util.DaoClass;

/**
 * GoUserInfoDAO    GoUserInfoActionがDBに接続するためのDAOクラス
 * @author Y.Narita
 * @since 2015/05/14
 * @version 1.0
 */
public class GoUserInfoDAO extends DaoClass{
    /**
     * @author Y.Narita
     * @since 2015/05/14
     * administoratorName   管理者名
     * DBconnector          MySQLでデータベースへの接続を行う
     */
    private String administratorName;
    DBconnector DBconnector = new DBconnector();
    /**
     * セッションに格納されている管理者名がDBのstore_listに存在する真偽値を返すメソッド
     * @author Y.Narita
     * @since 2015/05/14
     * @param administratorName 管理者名
     * @return res レスポンスを返す
     */
    public boolean isCheckShopName(String administratorName){
        res = false ;
        try{
            con = DBconnector.getConnection();
            sql = "select * from store_list where administrator_name = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1,administratorName);
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
     * 管理者名取得メソッド
     * @author Y.Narita
     * @since 2015/05/14
     * @return administratorName    取得した管理者名を返す
     */
    public String getAdministratorName() {
        return administratorName;
    }
    /**
     * 管理者名登録メソッド
     * @author Y.Narita
     * @since 2015/05/14
     * @param administratorName 管理者名
     */
    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName;
    }
}
