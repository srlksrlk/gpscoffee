package jp.co.internous.gpscoffee.dao;

import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import jp.co.internous.gpscoffee.dto.ReservationDTO;
import jp.co.internous.gpscoffee.dto.StoreListDTO;
import jp.co.internous.gpscoffee.util.DBconnector;
import jp.co.internous.gpscoffee.util.DaoClass;
/**
 * LoginAdminDAO AdminLoginActionがDBに接続するためのDAOクラス
 * @author Y.Matsukawa
 * @since 2015/05/01
 * @version 1.2
 */
public class LoginAdminDAO extends DaoClass{
	/**
	 * @author Y.Matsukawa
	 * @since 2015/05/01
	 * administratorId		管理者ID
	 * administratorPass	管理者パスワード
	 * administratorName	管理者名
	 * shopName				店舗名
	 * shopId				店舗ID
	 * reservation			予約情報
	 * DBconnector			MySQLでデータベースへの接続を行う
	 * orderCode			識別用コード
	 */
	String administratorId;
	String administratorPass;
	String administratorName;
	String shopName;
	int shopId;
	List<ReservationDTO> reservation = new ArrayList<ReservationDTO>();
	DBconnector DBconnector = new DBconnector();
	int orderCode;
	/**
	 * DBにアクセスして入力された管理者情報と照合するメソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/01
	 * @param administratorId	管理者ID
	 * @param administratorPass	管理者パスワード
	 * @return res	例外処理に入らなければtrueを返す
	 */
	public boolean selectAdmin(String administratorId,String administratorPass) {
		try{
			sql = "SELECT * FROM store_list WHERE ( administrator_id=? AND administrator_pass=? )";
			con = DBconnector.getConnection();
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1,administratorId);
			ps.setString(2,administratorPass);
			rs = ps.executeQuery();
			while (rs.next()) {
				res=true;
				StoreListDTO dto = new StoreListDTO();
				dto.setShopId(rs.getInt(1));		
				dto.setShopName(rs.getString(2));	
				dto.setAdministratorName(rs.getString(8));
				administratorName = dto.getAdministratorName();
				shopName = dto.getShopName();
				shopId = dto.getShopId();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	/**
	 * ログインした管理者情報に対応する予約情報を取得するメソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return res	例外処理に入らなければtrueを返す
	 */
	public boolean selectReservation() {
		try{
			sql = "SELECT * FROM reservation WHERE shop_id = ?";
			con = DBconnector.getConnection();
			ps = (PreparedStatement)con.prepareStatement(sql);
			ps.setInt(1,shopId);
			rs = ps.executeQuery();
			while (rs.next()) {
				res=true;
				ReservationDTO dto = new ReservationDTO();
				dto.setShopId(rs.getInt(1));
				dto.setInquiry(rs.getInt(2));
				dto.setPremiumId(rs.getString(3));
				dto.setBeanName(rs.getString(4));
				dto.setBeanRoast(rs.getInt(5));
				dto.setBeanGrind(rs.getInt(6));
				dto.setGram(rs.getInt(7));
				dto.setDrink(rs.getInt(8));
				dto.setTotalAmount(rs.getInt(9));
				dto.setReservationTime (rs.getString(10).substring(11,16));
				dto.setDeliveryTime(rs.getString(11).substring(11,16));
				dto.setOrderCode(rs.getInt(12));
				reservation.add(dto);
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	/**
	 * 管理者ID取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return administratorId 管理者IDを返す
	 */
	public String getAdministratorId() {
		return administratorId;
	}
	/**
	 * 管理者ID登録メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @param administratorId 管理者ID
	 */
	public void setAdministratorId(String administratorId) {
		this.administratorId = administratorId;
	}
	/**
	 * 管理者パスワード取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return administratorPass 管理者パスワードを返す
	 */
	public String getAdministratorPass() {
		return administratorPass;
	}
	/**
	 * 管理者パスワード登録メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @param administratorPass 管理者パスワード
	 */
	public void setAdministratorPass(String administratorPass) {
		this.administratorPass = administratorPass;
	}

	/**
	 * 管理者名取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return administratorName 管理者名を返す
	 */
	public String getAdministratorName() {
		return administratorName;
	}
	/**
	 * 管理者名登録メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @param administratorName 管理者名
	 */
	public void setAdministratorName(String administratorName) {
		this.administratorName = administratorName;
	}
	/**
	 * 店舗名取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return shopName 店舗名を返す
	 */
	public String getShopName() {
		return shopName;
	}
	/**
	 * 店舗名登録メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @param shopName 店舗名
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * 店舗ID取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return shopId 店舗ID
	 */
	public int getShopId() {
		return shopId;
	}
	/**
	 * 店舗ID登録メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @param shopId 店舗ID
	 */
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	/**
	 * 予約情報取得メソッド
	 * @author Y.Matsukawa
	 * @since 2015/05/02
	 * @return reservation 予約情報
	 */
	public List<ReservationDTO> getReservation() {
		return reservation;
	}
}
