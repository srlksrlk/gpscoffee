package jp.co.internous.gpscoffee.action;
import java.util.ArrayList;
import java.util.List;

import jp.co.internous.gpscoffee.dao.EnterStoreDAO;
import jp.co.internous.gpscoffee.dto.BeanGoodsDTO;
import jp.co.internous.gpscoffee.dto.StoreListDTO;
import jp.co.internous.gpscoffee.util.ActionClass;

/**
 * EnterStoreAction DBから商品一覧を取得して商品一覧画面に遷移するアクションクラス
 * @author S.Takiyoshi
 * @since 2015/05/10
 * @version 1.0
 */
public class EnterStoreAction extends ActionClass {
	/**
	 * @author S.Takiyoshi
	 * @since 2015/05/10
	 * shopId			店舗ID
	 * shopAddress  	店舗住所
	 * duration     	GoogleMapAPIによって取得してきたユーザーの到着所要時間
	 * arrivalTime  	ユーザーの到着所要時間（分換算）
	 * storeList 		店舗一覧情報
	 * beanGoods 		商品一覧情報
	 */
	private int shopId;
	private String shopAddress;
	private String duration;
	private int arrivalTime;
	private List<StoreListDTO> storeList = new ArrayList<StoreListDTO>();
	private List<BeanGoodsDTO> beanGoods = new ArrayList<BeanGoodsDTO>();
	/**
	 * bean_goodsの照合＆beanGoodsの取得メソッド
	 * @author S.Takiyoshi
	 * @since 2015/05/10
	 * @return result EnterStoreDAOからexecuteを実行しtrueを取得したらSUCCESSを返す
	 */
	public String execute() {
		storeList = (List<StoreListDTO>)sessionMap.get("storeList");
		for(int i = 0; i < storeList.size(); i++){
			if(shopAddress.equals(storeList.get(i).getShopAddress())){
				shopId = storeList.get(i).getShopId();
				sessionMap.put("shopName",storeList.get(i).getShopName());
			}
		}
		if(duration.length() != 0){
			if(duration.contains("時間")){
				String sHour = duration.substring(0,duration.indexOf("時間"));
				String sMinute = duration.substring(duration.indexOf("時間") + 2, duration.length() - 1);
				arrivalTime = 60 * Integer.parseInt(sHour);
				arrivalTime += Integer.parseInt(sMinute);
			} else {
				String s = duration.substring(0, duration.length() - 1);
				arrivalTime = Integer.parseInt(s);
			}
		sessionMap.put("arrivalTime", arrivalTime);
		}
		try {
			EnterStoreDAO dao = new EnterStoreDAO();
			dao.SQLQuery(shopId);
			result=SUCCESS;
			beanGoods.addAll(dao.getBeanGoods());
			sessionMap.put("shopId",shopId);
			sessionMap.put("goodsInfoList", beanGoods);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	/**
	 *店舗ID取得メソッド
	 * @author S.Takiyoshi
	 * @since 2015/05/10
	 * @return shopId  店舗IDを返す
	 */
	public int getShopId() {
		return shopId;
	}
	/**
	 * 店舗ID登録メソッド
	 * @author S.Takiyoshi
	 * @since 2015/05/10
	 * @param shopId  店舗ID
	 */
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	/**
	 * 店舗住所取得メソッド
	 * @author S.Takiyoshi
	 * @since 2015/05/19
	 * @return shopAddress 店舗住所を返す
	 */
	public String getShopAddress() {
		return shopAddress;
	}
	/**
	 * 店舗住所登録メソッド
	 * @author S.Takiyoshi
	 * @since 2015/05/19
	 * @param shopAddress 店舗住所
	 */
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	/**
	 * ユーザーの到着所要時間取得メソッド
	 * @author Y.Gouda
	 * @since 2015/05/19
	 * @return duration ユーザーの到着所要時間を返す
	 */
	public String getDuration() {
		return duration;
	}
	/**
	 * ユーザーの到着所要時間登録メソッド
	 * @author Y.Gouda
	 * @since 2015/05/19
	 * @param duration ユーザーの到着所要時間
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}
	/**
	 * ユーザーの到着所要時間（分換算）取得メソッド
	 * @author Y.Gouda
	 * @since 2015/05/19
	 * @return arrivalTime ユーザーの到着所要時間（分換算）を返す
	 */
	public int getArrivalTime() {
		return arrivalTime;
	}
	/**
	 * ユーザーの到着所要時間（分換算）登録メソッド
	 * @author Y.Gouda
	 * @since 2015/05/19
	 * @param arrivalTime ユーザーの到着所要時間（分換算）
	 */
	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	/**
	 * 店舗一覧情報取得メソッド
	 * @author S.Takiyoshi
	 * @since 2015/05/19
	 * @return storeList 店舗一覧情報を返す
	 */
	public List<StoreListDTO> getStoreList() {
		return storeList;
	}
	/**
	 * 店舗一覧登録メソッド
	 * @author S.Takiyoshi
	 * @since 2015/05/19
	 * @param storeList 店舗一覧情報
	 */
	public void setStoreList(List<StoreListDTO> storeList) {
		this.storeList = storeList;
	}
	/**
	 *商品一覧取得メソッド
	 * @author S.Takiyoshi
	 * @since 2015/05/10
	 * @return beanGoods  商品一覧情報を返す
	 */
	public List<BeanGoodsDTO> getBeanGoods() {
		return beanGoods;
	}
	/**
	 * 商品一覧情報登録メソッド
	 * @author S.Takiyoshi
	 * @since 2015/05/10
	 * @param beanGoods  商品一覧情報
	 */
	public void setBeanGoods(List<BeanGoodsDTO> beanGoods) {
		this.beanGoods = beanGoods;
	}
}
