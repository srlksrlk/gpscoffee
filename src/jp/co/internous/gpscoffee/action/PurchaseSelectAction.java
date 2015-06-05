package jp.co.internous.gpscoffee.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jp.co.internous.gpscoffee.dto.ReservationDTO;
import jp.co.internous.gpscoffee.util.ActionClass;
import jp.co.internous.gpscoffee.util.CreateSelectId;
import jp.co.internous.gpscoffee.util.GoodsComparator;

/**
 * PurchaseSelectAction パーチェスセレクトアクション
 * @author Y.Yamazaki
 * @since 2015/05/12
 * @version 1.0
 */
public class PurchaseSelectAction extends ActionClass{
	/**
	 * @author Y.Yamazaki
	 * @since 2015/05/12
	 * shopId		店舗ID
	 * goodsId		商品ID
	 * beanName		コーヒー豆の種類
	 * price		商品のグラム金額
	 * beanRoast	焙煎時間の引数
	 * roastName	焙煎時間の名称
	 * roastTime 	焙煎時間
	 * beanGrind	挽き具合の引数
	 * grindName	挽き具合の名称
	 * grindTime	挽く所要時間
	 * gram			受注グラム
	 * drink		ドリンク受注杯数
	 * totalAmount	豆ごとの小計
	 * cartList		カートリスト
	 * premiumId	プレミアムID
	 */
	private int shopId;
	private int goodsId;
	private String beanName;
	private int price;
	private int beanRoast;
	private String roastName;
	private int roastTime;
	private int beanGrind;
	private String grindName;
	private int grindTime = 5;
	private int gram;
	private int drink;
	private int totalAmount;
	List<ReservationDTO> cartList= new ArrayList<ReservationDTO>();
	private String premiumId;
	private int go=1;

	/**
	 * 選択された商品をカートリストに入れる処理をするメソッド
	 * @author Y.Yamazaki
	 * @since 2015/05//12
	 * @return result catListの要素数が0でなければSUCCESSを返す
	 */
	public String execute() {
		result = ERROR;
		CreateSelectId number = new CreateSelectId();
		if(drink == 0){
			totalAmount = price * gram /100;
		} else {
			totalAmount = price * drink;
			gram = drink * 20;
		}
		if(sessionMap.containsKey("cartList")){
			cartList = (List<ReservationDTO>) sessionMap.get("cartList");
		}
		sessionMap.remove("cartList");
		premiumId=(String)sessionMap.get("premiumId");
		ReservationDTO item = new ReservationDTO();
		item.setShopId(shopId);
		item.setPremiumId(premiumId);
		item.setGoodsId(goodsId);
		item.setBeanName(beanName);
		item.setGram(gram);
		item.setPrice(price);
		item.setBeanRoast(beanRoast);
		switch(beanRoast){
		case 1:
			this.roastName = "ライト・ロースト";
			roastTime = 12;
			break;
		case 2:
			this.roastName = "シナモン・ロースト";
			roastTime = 13;
			break;
		case 3:
			this.roastName = "ミディアム・ロースト";
			roastTime = 15;
			break;
		case 4:
			this.roastName = "ハイ・ロースト";
			roastTime = 17;
			break;
		case 5:
			this.roastName = "シティ・ロースト";
			roastTime = 18;
			break;
		case 6:
			this.roastName = "フルシティ・ロースト";
			roastTime = 19;
			break;
		case 7:
			this.roastName = "フレンチ・ロースト";
			roastTime = 20;
			break;
		case 8:
			this.roastName = "イタリアン・ロースト";
			roastTime = 22;
			break;
		default:
			this.roastName = null;
		}
		item.setRoastName(roastName);
		item.setRoastTime(roastTime);
		item.setBeanGrind(beanGrind);
		switch(beanGrind){
		case 1:
			this.grindName = "極細挽き";
			break;
		case 2:
			this.grindName = "細挽き";
			break;
		case 3:
			this.grindName = "中細挽き";
			break;
		case 4:
			this.grindName = "中挽き";
			break;
		case 5:
			this.grindName = "粗挽き";
			break;
		default:
			this.grindName = null;
		}
		item.setGrindName(grindName);
		item.setGrindTime(grindTime);
		item.setDrink(drink);
		item.setTotalAmount(totalAmount);
		item.setSelectId(number.execute());
		cartList.add(item);
		for(int i = 0;i < cartList.size();i++){
			for(int j = i+1;j < cartList.size();j++){
				if(cartList.get(i).getGoodsId() == cartList.get(j).getGoodsId()
						&& cartList.get(i).getBeanRoast()==cartList.get(j).getBeanRoast()
						&& cartList.get(i).getBeanGrind()==cartList.get(j).getBeanGrind()
						&& (cartList.get(i).getDrink() != 0 && cartList.get(j).getDrink() != 0 || cartList.get(i).getDrink() == 0 && cartList.get(j).getDrink() == 0)){
					cartList.get(j).setGram(
							cartList.get(j).getGram()+
							cartList.get(i).getGram());
					cartList.get(j).setDrink(cartList.get(i).getDrink() + cartList.get(j).getDrink());
					cartList.get(j).setTotalAmount(
							cartList.get(j).getTotalAmount()+
							cartList.get(i).getTotalAmount());
					cartList.remove(i);
				}
			}
		}
		Collections.sort(cartList, new GoodsComparator());
		if(cartList.size() > 0){
			sessionMap.put("cartList",cartList);
			result = SUCCESS;
		}
		return result;
	}
	/**
	 * 商品ID登録メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/12
	 * @param goodsId 商品ID
	 */
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	/**
	 * コーヒー豆の種類登録メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/12
	 * @param beanName コーヒー豆の種類
	 */
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
	/**
	 * 商品のグラム金額登録メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/12
	 * @param price 商品のグラム金額
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * 豆ごとの小計取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/12
	 * @return totalAmount 豆ごとの小計を返す
	 */
	public int getTotalAmount() {
		return totalAmount;
	}
	/**
	 * 豆ごとの小計登録メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/12
	 * @param totalAmount 豆ごとの小計
	 */
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * 挽き具合登録メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/12
	 * @param beanRoast 挽き具合
	 */
	public void setBeanRoast(int beanRoast) {
		this.beanRoast = beanRoast;
	}
	/**
	 * 焙煎時間の名称登録メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05//12
	 * @param beanGrind 焙煎時間の名称
	 */
	public void setBeanGrind(int beanGrind) {
		this.beanGrind = beanGrind;
	}
	/**
	 * 店舗ID格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/12
	 * @param shopId 店舗ID
	 */
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	/**
	 * 受注グラム格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/12
	 * @param gram 受注グラム
	 */
	public void setGram(int gram) {
		this.gram = gram;
	}
	/**
	 * ドリンク受注杯数取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/12
	 * @return drink ドリンク受注杯数
	 */
	public int getDrink() {
		return drink;
	}
	/**
	 * ドリンク受注杯数登録メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/12
	 * @param drink ドリンク受注杯数
	 */
	public void setDrink(int drink) {
		this.drink = drink;
	}
	/**
	 * カートに商品入れた事を認識するメソッド
	 * @author S.takiyosi
	 * @since 2015/05/20
	 * @return go カートに商品を入れた事を認識する
	 */
	public int getGo() {
		return go;
	}
	/**
	 * カートに商品入れた事を認識するメソッド
	 * @author S.takiyosi
	 * @since 2015/05/20
	 * @param go カートに商品を入れた事を認識する
	 */
	public void setGo(int go) {
		this.go = go;
	}
}