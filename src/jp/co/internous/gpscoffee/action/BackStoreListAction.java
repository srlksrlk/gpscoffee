package jp.co.internous.gpscoffee.action;

import jp.co.internous.gpscoffee.util.ActionClass;

/**
 * BackStoreListAction
 * 既存のセッションを破棄して店舗一覧画面へ戻るアクションクラス
 * @author T.Matsuda
 * @since 2015/05/07
 * @version 1.0
 */
public class BackStoreListAction extends ActionClass{
	/**
	 * 既存のセッションを破棄して店舗一覧画面へ戻るメソッド
	 * @author Y.Gouda
	 * @since 2015/05/18
	 * @return result セッションを破棄されたことが確認できればSUCCESSを返す
	 */
	public String execute() {
		sessionMap.clear();
		if((sessionMap.isEmpty())){
			result = SUCCESS;
		}
		return result;
	}
}