package jp.co.internous.gpscoffee.action;

import java.util.ArrayList;
import java.util.List;

import jp.co.internous.gpscoffee.dao.GoUserInfoDAO;
import jp.co.internous.gpscoffee.dto.ReservationDTO;
import jp.co.internous.gpscoffee.util.ActionClass;

/**
 * GoUserInfoAction   Task.jspの新規顧客登録ボタンから実行し、画面遷移を制御するクラス
 * @author Y.Narita
 * @since 2015/05/14
 * @version 1.0
 */
public class GoUserInfoAction extends ActionClass {
    /**
     * @author Y.Narita
     * @since 2015/05/14
     * administoratorName   管理者名
     * reservation          予約情報
     */
    private String administratorName;
    List<ReservationDTO> reservation = new ArrayList<ReservationDTO>();

    /**
     *セッションに格納されている管理者名がDBのstore_listに存在する場合SUCCESSを返すメソッド
     *@author Y.Narita
     *@since  2015/05/14
     *@return result DBのstore_listテーブルと照会しログインしている管理者名が存在すればSUCCESSを返す
     */
    public String execute() {
        GoUserInfoDAO goUserInfoDao = new GoUserInfoDAO();
        boolean res = goUserInfoDao.isCheckShopName((String)sessionMap.get("administrator_name"));
        if(res){
            result = SUCCESS;
        }else{
            result = ERROR;
        }
        return result;
    }
    /**
     * 管理者名取得メソッド
     * @author Y.Narita
     * @since  2015/05/14
     * @return administratorName 管理者名を返す
     */
    public String getAdministratorName() {
        return administratorName;
    }
    /**
     * 管理者名登録メソッド
     * @author Y.Narita
     * @since  2015/05/14
     * @param administratorName 管理者名
     */
    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName;
    }
}
