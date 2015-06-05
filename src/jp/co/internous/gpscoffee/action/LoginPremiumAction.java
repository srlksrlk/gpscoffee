package jp.co.internous.gpscoffee.action;

import java.util.ArrayList;
import java.util.List;

import jp.co.internous.gpscoffee.dao.LoginPremiumDAO;
import jp.co.internous.gpscoffee.dto.BeanGoodsDTO;
import jp.co.internous.gpscoffee.util.ActionClass;
/**
 * LoginPremiumAction ログインアクション
 * @author Y.Yamazaki
 * @since 2015/05/07
 * @version 1.0
 */
public class LoginPremiumAction extends ActionClass {
	/**
	 * @author Y.Yamazaki
	 * @since 2015/05/07
	 * premiumId			プレミアムID
	 * premiumPassword		プレミアムパスワード
	 * shopId				店舗ID
	 * BeanGoodsList		Goodsリスト
	 * errorMessage			ログインの際のログインエラーメッセージ
	 */
	private String premiumId;
	private String premiumPass;
	private int shopId;
	private String errorMessage;
	List<BeanGoodsDTO> BeanGoodsList = new ArrayList<BeanGoodsDTO>();

	/**
	 * premium_membershipの照合＆BeansListの取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/07
	 * @return result LoginPremiumDAOからexecuteを実行しtrueを取得したらSUCCESSを返す
	 */
	public String execute() {
		result = ERROR;
		try {
			LoginPremiumDAO dao = new LoginPremiumDAO();
			if (dao.select(premiumId,premiumPass)) {
				result = SUCCESS;
				sessionMap.put("id", dao.getId());
				sessionMap.put("premiumId", dao.getPremiumId());
				sessionMap.put("userName", dao.getName());
				shopId=(int)sessionMap.get("shopId");
				BeanGoodsList = dao.SQLQuery(shopId);
				sessionMap.put("goodsInfoList",BeanGoodsList );
			}else{
				errorMessage="※IDまたはPASSが間違っています";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	/**
	 * ログインの際のログインエラーメッセージ取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/07
	 * @return errorMessage ログインの際のログインエラーメッセージを返す
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	/**
	 * ログインの際のログインエラーメッセージ登録メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/07
	 * @param errorMessage ログインの際のログインエラーメッセージ
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	/**
	 * 店舗ID登録メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/07
	 * @param shopId 店舗ID
	 */
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	/**
	 * プレミアムID登録メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/07
	 * @param premiumId プレミアムID
	 */
	public void setPremiumId(String premiumId) {
		this.premiumId = premiumId;
	}
	/**
	 * プレミアムパスワード登録メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/07
	 * @param premiumPass プレミアムパスワード
	 */
	public void setPremiumPass(String premiumPass) {
		this.premiumPass = premiumPass;
	}
}

