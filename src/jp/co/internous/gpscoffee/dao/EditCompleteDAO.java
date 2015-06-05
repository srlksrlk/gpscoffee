package jp.co.internous.gpscoffee.dao;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import jp.co.internous.gpscoffee.dto.ReservationDTO;
import jp.co.internous.gpscoffee.util.DBconnector;
import jp.co.internous.gpscoffee.util.DaoClass;

/**
 * EditCompleteDAO
 * @author T.Matsuda
 * @since 2015/05/08
 * @version 1.0
 */
public class EditCompleteDAO extends DaoClass{
	/**
	 * @author T.Matsuda
	 * @since 2015/05/08
	 * cartList カートリスト
	 * shopName 店舗名
	 * shopNumber 店舗の電話番号
	 * zipcode 店舗の郵便番号
	 * shopNumber 店舗の電話番号
	 * DBconnector DB接続の設定
	 */
	private List<ReservationDTO> cartList = new ArrayList<ReservationDTO>();
	private String shopName;
	private String zipcode;
	private String shopAddress;
	private String shopNumber;
	DBconnector DBconnector = new DBconnector();
	/**
	 * プレミアム会員ユーザーの豆の購入レコードをreservationテーブルに格納するメソッド
	 * @author T.Matsuda
	 * @since 2015/05/08
	 * @param shopId 店舗ID
	 * @param premiumId プレミアムユーザーID
	 * @param beanName 商品名
	 * @param beanRoast 焙煎度
	 * @param beanGrind 挽き度
	 * @param gram 注文グラム
	 * @param totalAmount 商品種別の小計
	 * @param deliveryTime 商品受け渡し時刻
	 * @param orderCode 識別用コード
	 * @return res 例外処理に入らなければtrueを返す
	 */
	public boolean insert(int shopId,String premiumId,String beanName,int beanRoast,int beanGrind,int gram,int totalAmount, Timestamp deliveryTime, int orderCode){
		res =false;
		try{
			con = DBconnector.getConnection();
			sql = "INSERT INTO reservation(shop_id,premium_id,bean_name,bean_roast,bean_grind,gram,total_amount,delivery_time,order_code) VALUE(?,?,?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, shopId);
			ps.setString(2, premiumId);
			ps.setString(3, beanName);
			ps.setInt(4, beanRoast);
			ps.setInt(5, beanGrind);
			ps.setInt(6, gram);
			ps.setInt(7, totalAmount);
			ps.setTimestamp(8, deliveryTime);
			ps.setInt(9, orderCode);
			ps.executeUpdate();
			con.close();
			res = true;
		} catch (SQLException e){
			e.printStackTrace();
		}
		return res;
	}
	/**
	 * プレミアム会員ユーザーのドリンクの購入レコードをreservationテーブルに格納するメソッド
	 * @author T.Matsuda
	 * @since 2015/05/08
	 * @param shopId 店舗ID
	 * @param premiumId プレミアムユーザーID
	 * @param beanName 商品名
	 * @param beanRoast 焙煎度
	 * @param beanGrind 挽き度
	 * @param gram 注文グラム
	 * @param drink ドリンク個数
	 * @param totalAmount 商品種別の小計
	 * @param deliveryTime 商品受け渡し時刻
	 * @param orderCode 識別用コード
	 * @return res 例外処理に入らなければtrueを返す
	 */
	public boolean insert(int shopId,String premiumId,String beanName,int beanRoast,int beanGrind,int gram, int drink, int totalAmount, Timestamp deliveryTime, int orderCode){
		res =false;
		try{
			con = DBconnector.getConnection();
			sql = "INSERT INTO reservation(shop_id,premium_id,bean_name,bean_roast,bean_grind,gram,drink,total_amount,delivery_time,order_code) VALUE(?,?,?,?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, shopId);
			ps.setString(2, premiumId);
			ps.setString(3, beanName);
			ps.setInt(4, beanRoast);
			ps.setInt(5, beanGrind);
			ps.setInt(6, gram);
			ps.setInt(7, drink);
			ps.setInt(8, totalAmount);
			ps.setTimestamp(9, deliveryTime);
			ps.setInt(10, orderCode);
			ps.executeUpdate();
			con.close();
			res = true;
		} catch (SQLException e){
			e.printStackTrace();
		}
		return res;
	}
	/**
	 * ゲストユーザーの豆の購入レコードをreservationテーブルに格納するメソッド
	 * @author T.Matsuda
	 * @since 2015/05/08
	 * @param shopId 店舗ID
	 * @param beanName 商品名
	 * @param beanRoast 焙煎度
	 * @param beanGrind 挽き度
	 * @param gram 注文グラム
	 * @param totalAmount 商品種別の小計
	 * @param deliveryTime 商品受け渡し時刻
	 * @param orderCode 識別用コード
	 * @return res 例外処理に入らなければtrueを返す
	 */
	public boolean insert(int shopId,String beanName,int beanRoast,int beanGrind,int gram,int totalAmount,Timestamp deliveryTime, int orderCode){
		res =false;
		try{
			con = DBconnector.getConnection();
			sql = "INSERT INTO reservation(shop_id,bean_name,bean_roast,bean_grind,gram,total_amount,delivery_time,order_code) VALUE(?,?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, shopId);
			ps.setString(2, beanName);
			ps.setInt(3, beanRoast);
			ps.setInt(4, beanGrind);
			ps.setInt(5, gram);
			ps.setInt(6, totalAmount);
			ps.setTimestamp(7, deliveryTime);
			ps.setInt(8, orderCode);
			ps.executeUpdate();
			con.close();
			res = true;
		} catch (SQLException e){
			e.printStackTrace();
		}
		return res;
	}
	/**
	 * 店舗IDから店舗情報を取得してくるメソッド
	 * @param shopId 店舗ID
	 * @return res 例外処理に入らなければtrueを返す
	 */
	public boolean select(int shopId){
		res=true;
		try{
			con=DBconnector.getConnection();
			sql = "select * from store_list where shop_id=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, shopId);
			rs = ps.executeQuery();
			while(rs.next()){
				shopName=rs.getString(2);
				zipcode=rs.getString(3);
				shopAddress=rs.getString(4);
				shopNumber=rs.getString(5);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return res;
	}
	/**
	 * カートリスト取得メソッド
	 * @author T.Matsuda
	 * @since 2015/05/08
	 * @return cartList カートリスト
	 */
	public List<ReservationDTO> getCartList() {
		return cartList;
	}
	/**
	 * 店舗名取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/15
	 * @return shopName 店舗名
	 */
	public String getShopName() {
		return shopName;
	}
	/**
	 * 店舗の郵便番号取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/15
	 * @return zipcode 店舗の郵便番号
	 */
	public String getZipcode() {
		return zipcode;
	}
	/**
	 * 店舗住所取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/15
	 * @return shopAddress 店舗住所
	 */
	public String getShopAddress() {
		return shopAddress;
	}
	/**
	 * 店舗の電話番号取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/15
	 * @return shopNumber 店舗の電話番号
	 */
	public String getShopNumber() {
		return shopNumber;
	}
}
