package jp.co.internous.gpscoffee.action;

import java.util.ArrayList;
import java.util.List;

import jp.co.internous.gpscoffee.dao.LoginAdminDAO;
import jp.co.internous.gpscoffee.dto.ReservationDTO;
import jp.co.internous.gpscoffee.util.ActionClass;
/**
 * LoginAdminAction 管理者ログインページへボタンが押下された際の処理を行うアクションクラス
 * @author Y.Matsukawa
 * @since 2015/04/30
 * @version 1.2
 */
public class LoginAdminAction extends ActionClass {
	/**
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * erroeMessage			管理者ログインの際のログインエラーメッセージ
	 * administratorId		管理者ID
	 * administratorPass	管理者パスワード
	 * reservation			予約情報
	 */
	private String errorMessage;
	private String administratorId;
	private String administratorPass;
	private List<ReservationDTO> reservation = new ArrayList<ReservationDTO>();
	/**
	 * 管理者照合及びログインした管理者に対応する店舗の予約情報取得を行いresultを返す実行メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return result 管理者照合が成功し、管理者に対応する店舗の予約情報が取得できればSUCCESSを返す
	 */
	public String execute() {

		LoginAdminDAO loginAdminDao = new LoginAdminDAO();
		try {
			boolean res = loginAdminDao.selectAdmin(administratorId,administratorPass);
			if(res){
				sessionMap.put("administrator_name", loginAdminDao.getAdministratorName());
				sessionMap.put("shop_name", loginAdminDao.getShopName());
			}else{
				setErrorMessage("管理者IDもしくはPASSが違います");
				result = ERROR;
			}
			boolean ret = loginAdminDao.selectReservation();
			if(ret){
				reservation.addAll(loginAdminDao.getReservation());
				sessionMap.put("reservation",reservation);
				result = SUCCESS;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	/**
	 * 管理者ID取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return administratorId 管理者IDを返す
	 */
	public String getAdministratorId() {
		return administratorId;
	}
	/**
	 * 管理者ID登録メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @param administratorId 管理者ID
	 */
	public void setAdministratorId(String administratorId) {
		this.administratorId = administratorId;
	}
	/**
	 * 管理者パスワード取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return administratorPass 管理者パスワードを返す
	 */
	public String getAdministratorPass() {
		return administratorPass;
	}
	/**
	 * 管理者パスワード登録メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @param administratorPass 管理者パスワード
	 */
	public void setAdministratorPass(String administratorPass) {
		this.administratorPass = administratorPass;
	}
	/**
	 * 管理者ログインの際のログインエラーメッセージ取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return errorMessage 管理者ログインの際のログインエラーメッセージを返す
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	/**
	 * 管理者ログインの際のログインエラーメッセージ登録メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @param errorMessage 管理者ログインの際のログインエラーメッセージ
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}