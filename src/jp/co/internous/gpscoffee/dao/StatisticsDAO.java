package jp.co.internous.gpscoffee.dao;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jp.co.internous.gpscoffee.dto.StatisticsDTO;
import jp.co.internous.gpscoffee.util.DBconnector;
import jp.co.internous.gpscoffee.util.DaoClass;

/**
 * StatisticsDAO	StatisticsActionがDBに接続するためのDAOクラス
 * @author K.Nishikigawa
 * @since 2015/5/20
 * @version 1.0
 */
public class StatisticsDAO extends DaoClass {
	/**
	 * DBにアクセスして、購入履歴テーブルから売上情報を持ってくるメソッド
	 * @author K.Nishikigawa
	 * @since  2015/5/20
	 * @param  purchaseTimeA 	購入日を格納
	 * @param  purchaseTimeB 	購入日を格納
	 * @param  shopIds			店舗別IDを格納
	 * @return dto              例外に入らなければdtoを返す
	 */
	public StatisticsDTO select(String purchaseTimeA,String purchaseTimeB,int shopIds) throws SQLException{
		DBconnector DBconnector = new DBconnector();
		StatisticsDTO dto = new StatisticsDTO();
		con = DBconnector.getConnection();
		try{
			String sql = "select sum(total_amount) from history where delivery_time between ? and ? and shop_id=?" ;
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1,purchaseTimeA);
			ps.setString(2,purchaseTimeB);
			ps.setInt(3,shopIds);

			ResultSet rs = ps.executeQuery();
			while(rs.next()){

				double accurateProfit = rs.getInt(1)*0.6;
				BigDecimal bi = new BigDecimal(String.valueOf(accurateProfit));
				double roundProfit = bi.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
				dto.setProfit(roundProfit);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return dto;
	}
}
