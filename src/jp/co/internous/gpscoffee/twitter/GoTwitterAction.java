package jp.co.internous.gpscoffee.twitter;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import twitter4j.TwitterException;

import com.opensymphony.xwork2.ActionSupport;
/**
 * GoTwitterAction Twitter認証画面へと遷移するアクションクラス
 * @author T.Iwase
 * @since 2015/5/7
 * @version 1.0
 */
public class GoTwitterAction extends ActionSupport implements ServletResponseAware,ServletRequestAware{
	/**
	 * @author T.Iwase
	 * @since 2015/5/7
	 * result                        実行結果を返す
	 * sessionMAP					 セッションマップ
	 * HttpServletResponse response  サーバーからのレスポンス情報
	 * HttpServletRequest request    サーバーからのリクエスト情報
	 */
	private String result="success";
	public Map<String, Object> sessionMap;
	private HttpServletResponse response;
	private HttpServletRequest request;
	/**
	 * 実行メソッド
	 * @author T.Iwase
	 * @since 2015/5/7
	 * @return result SUCCESSを返す
	 */
	public String execute(){
		TwitterRequestToken trt = new TwitterRequestToken();
		try {
			result=trt.loginOAuth(response,request);
		} catch (TwitterException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
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
	 * @param request リクエスト
	 */
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}
}
