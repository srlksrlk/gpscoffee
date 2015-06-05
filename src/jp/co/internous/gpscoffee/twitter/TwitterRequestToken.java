package jp.co.internous.gpscoffee.twitter;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.RequestToken;

/**
 * TwitterRequestToken ツイッターの認証を得るためのクラス
 * @author T.Iwase
 * @since 2015/5/7
 * @version 1.0
 * @see TwitterFactory
 */
public class TwitterRequestToken{
	String result = null;

	final String CONSUMER_KEY = "iZzntf6CuXursbxqKP4CcTNnu";
	final String CONSUMER_SECRET = "6vW9PAaio9vYRIa76YMtVAR2oU5U9Zq4SCZ682LtD4t9VzZgry";

	static TwitterFactory twitterFactory = new TwitterFactory();
	/**
	 * 認証用トークン取得メソッド
	 * @author T.Iwase
	 * @since 2015/5/7
	 * @return result 例外処理に入らなければresultを返す
	 * @throws TwitterException
	 * @throws IOException
	 */
	public String loginOAuth(HttpServletResponse response,HttpServletRequest request) throws TwitterException, IOException {

		Twitter twitter = twitterFactory.getInstance();
		twitter.setOAuthConsumer(CONSUMER_KEY, CONSUMER_SECRET);

		try{
			RequestToken reqToken = twitter.getOAuthRequestToken();

			HttpSession session = request.getSession();
			session.setAttribute("RequestToken", reqToken);
			session.setAttribute("Twitter", twitter);

			String strUrl = reqToken.getAuthorizationURL();
			response.sendRedirect(strUrl);

		}catch (TwitterException e){
			e.printStackTrace();
		}
		return result;
	}
	
}