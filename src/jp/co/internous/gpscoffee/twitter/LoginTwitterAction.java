package jp.co.internous.gpscoffee.twitter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.internous.gpscoffee.dao.LoginPremiumDAO;
import jp.co.internous.gpscoffee.dto.BeanGoodsDTO;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * LoginTwitterAction  Twitter認証画面へと遷移するためのアクションクラス
 * @author T.Iwase
 * @since 2015/5/7
 * @version 1.0
 */

public class LoginTwitterAction extends ActionSupport implements ServletResponseAware,ServletRequestAware,SessionAware{
	/**
	 * @author T.Iwase
	 * @since 2015/5/7
	 * session   セッション
	 * response  レスポンス
	 * request   リクエスト
	 * userData  ユーザー情報
	 * result    実行結果を返す
	 */
	public Map<String, Object> sessionMap;
	private HttpServletResponse response;
	private HttpServletRequest request;
	private String[] userData=new String[2];
	private String result;
	public int shopId;
	List<BeanGoodsDTO> BeanGoodsList = new ArrayList<BeanGoodsDTO>();
	/**
	 * 実行メソッド
	 * @author T.Iwase
	 * @since 2015/5/7
	 * @return result TwitterのuserDataを取得したらSUCCESSを返す
	 * @throws Exception 予期せぬ例外
	 * @see TwitterAccessToken
	 */
	public String execute() throws Exception{

		TwitterAccessToken twitter = new TwitterAccessToken();

		try{
		userData = twitter.loginOAuth(response, request);
		}catch(Exception e){
			return ERROR;
		}

		if(userData[0] != null){
		sessionMap.put("NAME", userData[0]);
		sessionMap.put("userName", userData[1]);
		shopId = (int)sessionMap.get("shopId");
		LoginPremiumDAO loginpremiumDao = new LoginPremiumDAO();
		BeanGoodsList = loginpremiumDao.SQLQuery(shopId);
		sessionMap.put("goodsInfoList",BeanGoodsList );
		sessionMap.put("premiumId", userData[0]);
		result = SUCCESS;
		}

		return result;
	}
	/**
	 * レスポンス格納メソッド
	 * @author T.Iwase
	 * @since 2015/5/7
	 * @param response レスポンス
	 */
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}
	/**
	 * リクエスト格納メソッド
	 * @author T.Iwase
	 * @since 2015/5/7
	 * @param request リクエストを返す
	 */
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}
	/**
	 * セッション格納メソッド
	 * @author T.Iwase
	 * @since 2015/5/7
	 * @param session セッションに保存するMap
	 */
	public void setSession(Map<String, Object> session) {
		this.sessionMap=session;
	}
}
