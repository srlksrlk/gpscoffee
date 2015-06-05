package jp.co.internous.gpscoffee.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.internous.gpscoffee.dto.ReservationDTO;
import jp.co.internous.gpscoffee.util.DBconnector;
import jp.co.internous.gpscoffee.util.DaoClass;
/**
 * DeliveryAcceptDAO	DeliveryAcceptActionがDBに接続するためのDAOクラス
 * @author Y.Matsukawa
 * @since 2015/05/03
 * @version 1.0
 */
public class DeliveryAcceptDAO extends DaoClass {
	/**
	 * @author Y.Matsukawa
	 * @since 2015/05/03
	 * reservation	予約情報
	 * DBconnector	MySQLでデータベースへの接続を行う
	 */
	public List<ReservationDTO> reservation = new ArrayList<ReservationDTO>();
	DBconnector DBconnector = new DBconnector();
	/**
	 * insert 管理者によって選択された予約情報をDBのhistoryテーブルに追加するためのメソッド(プレミアム会員ドリンク用)
	 * @author Y.Matsukawa
	 * @since 2015/05/03
	 * @param shopId		店舗ID
	 * @param inquiry		受注番号
	 * @param premiumId		プレミアム会員ID
	 * @param beanName		コーヒー豆の種類
	 * @param beanRoast		焙煎時間
	 * @param beanGrind		挽き方
	 * @param gram			受注グラム
	 * @param drink			ドリンク個数
	 * @param totalAmount	豆ごとの小計
	 * @return res			例外処理に入らなければtrueを返す
	 * @throws SQLException
	 */
	public boolean insert(int shopId, int inquiry, String premiumId, String beanName, int beanRoast, 
			int beanGrind, int gram, int drink, int totalAmount, int orderCode) throws SQLException{
		try{
			sql = "INSERT INTO history (shop_id, inquiry, premium_id, bean_name, bean_roast, bean_grind, gram, drink, total_amount, order_code)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
			con = DBconnector.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1,shopId);
			ps.setInt(2,inquiry);
			ps.setString(3,premiumId);
			ps.setString(4,beanName);
			ps.setInt(5,beanRoast);
			ps.setInt(6,beanGrind);
			ps.setInt(7,gram);
			ps.setInt(8,drink);
			ps.setInt(9,totalAmount);
			ps.setInt(10,orderCode);
			ps.executeUpdate();
			res = true;
		} catch (Exception e){
			e.printStackTrace();
		}
		return res;	
	}
	/**
	 * insert 管理者によって選択された予約情報をDBのhistoryテーブルに追加するためのメソッド(プレミアム会員豆用)
	 * @author Y.Matsukawa
	 * @since 2015/05/20
	 * @param shopId		店舗ID
	 * @param inquiry		受注番号
	 * @param premiumId		プレミアム会員ID
	 * @param beanName		コーヒー豆の種類
	 * @param beanRoast		焙煎時間
	 * @param beanGrind		挽き方
	 * @param gram			受注グラム
	 * @param totalAmount	豆ごとの小計
	 * @return res			例外処理に入らなければtrueを返す
	 * @throws SQLException
	 */
	public boolean insert(int shopId, int inquiry, String premiumId, String beanName, int beanRoast, 
			int beanGrind, int gram,  int totalAmount, int orderCode) throws SQLException{
		try{
			sql = "INSERT INTO history (shop_id, inquiry, premium_id, bean_name, bean_roast, bean_grind, gram, total_amount, order_code)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
			con = DBconnector.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1,shopId);
			ps.setInt(2,inquiry);
			ps.setString(3,premiumId);
			ps.setString(4,beanName);
			ps.setInt(5,beanRoast);
			ps.setInt(6,beanGrind);
			ps.setInt(7,gram);
			ps.setInt(8,totalAmount);
			ps.setInt(9,orderCode);
			ps.executeUpdate();
			res = true;
		} catch (Exception e){
			e.printStackTrace();
		}
		return res;	
	}
	/**
	 * insert 管理者によって選択された予約情報をDBのhistoryテーブルに追加するためのメソッド(ゲストユーザー用)
	 * @author Y.Matsukawa
	 * @since 2015/05/20
	 * @param shopId		店舗ID
	 * @param inquiry		受注番号
	 * @param beanName		コーヒー豆の種類
	 * @param beanRoast		焙煎時間
	 * @param beanGrind		挽き方
	 * @param gram			受注グラム
	 * @param totalAmount	豆ごとの小計
	 * @return res			例外処理に入らなければtrueを返す
	 * @throws SQLException
	 */
	public boolean insert(int shopId, int inquiry, String beanName, int beanRoast, 
			int beanGrind, int gram,  int totalAmount, int orderCode) throws SQLException{
		try{
			sql = "INSERT INTO history (shop_id, inquiry, bean_name, bean_roast, bean_grind, gram, total_amount, order_code)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
			con = DBconnector.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1,shopId);
			ps.setInt(2,inquiry);
			ps.setString(3,beanName);
			ps.setInt(4,beanRoast);
			ps.setInt(5,beanGrind);
			ps.setInt(6,gram);
			ps.setInt(7,totalAmount);
			ps.setInt(8,orderCode);
			ps.executeUpdate();
			res = true;
		} catch (Exception e){
			e.printStackTrace();
		}
		return res;	
	}
	/**
	 * delete 管理者によって選択された注文情報をDBのreservationテーブルから削除するためのメソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/03
	 * @param inquiry	受注番号
	 * @return res		例外処理に入らなければtrueを返す
	 * @throws SQLException
	 */
	public boolean delete(int inquiry) throws SQLException{
		try{
			sql = "delete from reservation where inquiry = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1,inquiry);
			ps.executeUpdate();
			res = true;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return res;
	}
}
