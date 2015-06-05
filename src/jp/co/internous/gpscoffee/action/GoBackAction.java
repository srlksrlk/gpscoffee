package jp.co.internous.gpscoffee.action;

import jp.co.internous.gpscoffee.util.ActionClass;
/**
 * GoBackAction SUCCESSを返す、画面遷移用アクション
 * @author T.Mori
 * @since 2015/05/12
 * @version 1.0
 */
public class GoBackAction extends ActionClass{
	/**
	 * 必ずSUCCESSを返し、各画面に遷移させるメソッド
	 * @author T.Mori
	 * @since 2015/05/12
	 * @return result 必ずSUCCESSを返す
	 */
	public String execute(){
		result = SUCCESS;
		return result;
	}
}