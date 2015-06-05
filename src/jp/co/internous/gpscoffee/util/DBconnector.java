package jp.co.internous.gpscoffee.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

/**
 * DBconnecto
 * DB接続を管理するクラス
 * @author Y.Yamazaki
 * @since 2015/4/9
 * @version 1.0
 */
public class DBconnector {
	/**
	 * @author Y.Yamazaki
	 * @since 2015/4/9
	 * driverName		ドライブの名前
	 * URL				ウェブサイトのアドレス
	 * DB				データベース
	 * URLplusDB		ウェブサイトのアドレスとデータベース
	 * user				ユーザー
	 * pass				パスワード
	 */
	private String driverName = "com.mysql.jdbc.Driver";
	private String URL = "jdbc:mysql://";
	private String hostName = "localhost";
	private String DB = "gpscoffee";
	private String user = "root";
	private String pass = "mysql";
	/**
	 * ホスト名とデータベース名を変更できるコンストラクタ
	 * @author Y.Gouda
	 * @since 2015/5/7
	 * @param hostName ホスト名
	 * @param database データベース名
	 */
	public DBconnector(String hostName, String database) {
		this.hostName = hostName;
		this.DB = database;
	}
	/**
	 * ホスト名を変更できるコンストラクタ
	 * @author Y.Gouda
	 * @since 2015/5/7
	 * @param hostName ホスト名
	 */
	public DBconnector(String hostName){
		this.hostName = hostName;
	}
	/**
	 * 引数なしのデフォルトコンストラクタ
	 * @author Y.Gouda
	 * @since 2015/5/7
	 */
	public DBconnector(){
	}
	/**
	 * データーベースと接続して管理するメソッド
	 * @author Y.Gouda
	 * @since 2015/4/9
	 * @return con 例外処理に入らなければコネクションを返す
	 */
	public Connection getConnection(){
		Connection con = null;
		try {
			Class.forName(driverName);
			con = (Connection) DriverManager.getConnection(URL+hostName+"/"+DB, user, pass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}