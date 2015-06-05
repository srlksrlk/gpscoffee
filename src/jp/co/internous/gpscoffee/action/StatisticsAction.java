package jp.co.internous.gpscoffee.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import jp.co.internous.gpscoffee.dao.StatisticsDAO;
import jp.co.internous.gpscoffee.dto.StatisticsDTO;
import jp.co.internous.gpscoffee.util.ActionClass;

/**
 * StatisticsAction
 * StatisticsDAOを実行ししStatisticsDTOに値を格納するクラス
 * @author K.Nishikigawa
 * @since 2015/05/20
 * @version 1.0
 */
public class StatisticsAction extends ActionClass {
	/**
	 * @author K,Nishikigawa
	 * @since 2015/05/20
	 * sales		利益
	 * calendar		現在年月日
	 * yearCount	年
	 * monthCount	月
	 * shopId		店舗ID
	 */
	private ArrayList<StatisticsDTO> sales =new ArrayList<StatisticsDTO>();
	Calendar calendar = Calendar.getInstance();
	private int yearCount=calendar.get(Calendar.YEAR);
	private int monthCount=calendar.get(Calendar.MONTH) + 1;
	private int shopId;
	/**
	 * DAOを実行し、salesにdtoを格納するメソッド
	 * @author K.Nishikigawa
	 * @since 2015/05/20
	 * @return success 例外に入らなければ実行結果を返す
	 */
	public String execute() {
		StatisticsDAO dao =new StatisticsDAO();
		try {
			for(int i=1;i<32;i++){
				sales.add(dao.select(yearCount+"-"+monthCount+"-"+i+" 00:00:00",yearCount+"-"+monthCount+"-"+i+" 23:59:59",shopId));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "success";
	}
	/**
	 * StatisticsDTO型のArrayList取得メソッド
	 * @author K.Nishikigawa
	 * @since 2015/5/20
	 * @return sales 売り上げ情報を格納したDTOが入ったArryListを返す
	 */
	public ArrayList<StatisticsDTO> getSales() {
		return sales;
	}

	/**
	 * StatisticsDTO型のArrayList取得メソッド
	 * @author K.Nishikigawa
	 * @since 2015/5/20
	 * @param sales 売り上げ情報を格納したDTOが入ったArryList
	 */
	public void setSales(ArrayList<StatisticsDTO> sales) {
		this.sales = sales;
	}

	/**
	 * 現在年度情報取得メソッド
	 * @author K.Nishikigawa
	 * @since 2015/5/20
	 * @return yearCount 現在年度情報を返す
	 */
	public int getYearCount() {
		return yearCount;
	}

	/**
	 * 現在年度情報登録メソッド
	 * @author K.Nishikigawa
	 * @since 2015/5/20
	 * @param yearCount 現在年度情報を格納した変数
	 */
	public void setYearCount(int yearCount) {
		this.yearCount = yearCount;
	}

	/**
	 * 現在月情報取得メソッド
	 * @author K.Nishikigawa
	 * @since 2015/5/20
	 * @return monthCount 現在年度情報を返す
	 */
	public int getMonthCount() {
		return monthCount;
	}

	/**
	 * 現在月情報登録メソッド
	 * @author K.Nishikigawa
	 * @since 2015/5/20
	 * @param monthCount 現在月情報を格納した変数
	 */
	public void setMonthCount(int monthCount) {
		this.monthCount = monthCount;
	}

	/**
	 * 店舗ID取得メソッド
	 * @author K.Nishikigawa
	 * @since 2015/5/20
	 * @return shopId 店舗IDを返す
	 */
	public int getShopId() {
		return shopId;
	}

	/**
	 *店舗ID登録メソッド
	 * @author K.Nishikigawa
	 * @since 2015/5/20
	 * @param shopId 店舗Idを格納した変数
	 */
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
}
