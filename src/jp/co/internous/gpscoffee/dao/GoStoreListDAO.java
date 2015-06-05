package jp.co.internous.gpscoffee.dao;

import java.util.ArrayList;
import java.util.List;

import jp.co.internous.gpscoffee.dto.StoreListDTO;
import jp.co.internous.gpscoffee.util.DBconnector;
import jp.co.internous.gpscoffee.util.DaoClass;
/**
 * GoStoreListDAO 店舗一覧の情報を取得するDAOクラス
 * @author Y.Yamazaki
 * @since 2015/05/01
 * @version 1.0
 */
public class GoStoreListDAO extends DaoClass{
	/**
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * storeList 店舗一覧
	 */
	List<StoreListDTO> storeList = new ArrayList<StoreListDTO>();
	/**
	 * DBに接続して店舗情報群を取得してくるメソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @return res 店舗一覧情報を取得したらtrueを返す
	 */
	public boolean SQLQuery() {
		DBconnector DBconnector = new DBconnector();
		res=false;
		try{
			con=DBconnector.getConnection();
			sql = "SELECT * FROM store_list";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				res=true;
				StoreListDTO dto = new StoreListDTO();
				dto.setShopId(rs.getInt(1));
				dto.setShopName(rs.getString(2));
				dto.setZipcode(rs.getString(3));
				dto.setShopAddress(rs.getString(4));
				dto.setShopNumber(rs.getString(5));
				dto.setAdministratorId(rs.getString(6));
				dto.setAdministratorPass(rs.getString(7));
				dto.setAdministratorName(rs.getString(8));
				storeList.add(dto);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	/**
	 * 店舗一覧取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/01
	 * @return storeList 店舗一覧
	 */
	public List<StoreListDTO> getStoreList(){
		return storeList;
	}
}