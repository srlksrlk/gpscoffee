package jp.co.internous.gpscoffee.action;

import jp.co.internous.gpscoffee.util.ActionClass;

/**
 * LogOutAdminAction 管理者ログアウトボタンが押下された際の処理を行うアクションクラス
 * @author Y.Matsukawa
 * @since 2015/05/13
 * @version 1.0
 */
public class LogoutAdminAction extends ActionClass{
	/**
	 * 管理者ログイン情報を破棄し管理者ログイン画面へと遷移する実行メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/13
	 * @return result 必ずSUCCESSを返す
	 */
	public String execute() {
		sessionMap.clear();
		if((sessionMap.isEmpty())){
			result = SUCCESS;
		}
		return result;
	}
}
