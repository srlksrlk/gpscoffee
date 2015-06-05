package jp.co.internous.gpscoffee.action;

import java.util.ArrayList;
import java.util.List;

import jp.co.internous.gpscoffee.dao.GoStoreListDAO;
import jp.co.internous.gpscoffee.dto.StoreListDTO;
import jp.co.internous.gpscoffee.util.ActionClass;

/**
 * GoStoreListAction 店舗一覧情報を取得するアクションクラス
 * @author Y.Yamazaki
 * @since 2015/05/01
 * @version 1.0
 */
public class GoStoreListAction extends ActionClass {
	/**
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * storeList 店舗一覧情報
	 */
	private List<StoreListDTO> storeList = new ArrayList<StoreListDTO>();
	/**
	 * 店舗一覧をDBから取得し、店舗一覧画面に遷移させるメソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @return result GoStoreListDAOのexecuteを実行しtrueを取得したらSUCCESSを返す
	 */
	public String execute() {
		GoStoreListDAO dao = new GoStoreListDAO();
		if(dao.SQLQuery()){
			storeList.addAll(dao.getStoreList());
			sessionMap.put("storeList",storeList );
			result=SUCCESS;
		}
		return result;
	}
	/**
	 * 店舗一覧情報取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @return streList 店舗一覧情報を返す
	 */
	public List<StoreListDTO> getStoreList(){
		return storeList;
	}
}
