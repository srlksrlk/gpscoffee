/**
 *
 */
package jp.co.internous.gpscoffee.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * DaoClass
 *DAOクラスを記述する際に共通のフィールドとメソッドを持った抽象クラス
 * @author Y.Gouda
 * @since 2015/4/30
 * @version 1.0
 */
public abstract class DaoClass {
	/**
	 * @author Y.Gouda
	 * @since 2015/4/30
	 * res 	レスポンス
	 * con 	コネクション
	 * sql	SQL文の基となる文字列
	 * ps	文字列をSQL文にして格納する
	 * rs	SQLの実行結果を格納する
	 */
	protected boolean res;
	protected Connection con;
	protected String sql;
	protected PreparedStatement ps;
	protected ResultSet rs;
}
