package jp.co.internous.gpscoffee.dto;

/**
 * StatisticsDTO
 * 利益を格納するためのDTO
 * @author K.Nishikigawa
 * @since 2015/05/20
 *@version 1.0
 */

public class StatisticsDTO {
	/**
	 * @author K.Nishikigawa
	 * @since 2015/05/01
	 * profit 利益
	 */
	private double profit;
	/**
	 * 利益取得メソッド
	 * @author K.NIshikigawa
	 * @since 2015/05/20
	 * @return profit 利益
	 */
	public double getProfit() {
		return profit;
	}
	/**
	 * 利益登録メソッド
	 * @author K.Nishikigawa
	 * @since 2015/05/20
	 * @param profit 利益
	 */
	public void setProfit(double profit) {
		this.profit = profit;
	}
}

