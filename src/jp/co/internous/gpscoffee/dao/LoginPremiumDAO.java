package jp.co.internous.gpscoffee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.internous.gpscoffee.dto.BeanGoodsDTO;
import jp.co.internous.gpscoffee.util.DBconnector;
import jp.co.internous.gpscoffee.util.DaoClass;
/**
 * LoginPremiumDAO LoginPremiumActionがDBに接続するためのDAOクラス
 * @author Y.Yamazaki
 * @since 2015/05/07
 * @version 1.0
 */
public class LoginPremiumDAO extends DaoClass{
	/**
	 * @author Y.Yamazaki
	 * @since 2015/05/07
	 * id アカウント番号
	 * premiumId プレミアムID
	 * name 名前
	 * DBconnector MySQLでデータベースへの接続を行う
	 * BeanGoodsList	商品一覧
	 */
	private int id;
	private String premiumId;
	private String name;
	DBconnector DBconnector = new DBconnector();
	List<BeanGoodsDTO> BeanGoodsList = new ArrayList<BeanGoodsDTO>();
/**
 * DBにアクセスして入力されたLogin情報と照合するメソッド
 * @author Y.Yamazaki
 * @since 2015/05/07
 * @param CustomerLoginId	入力されたログインID
 * @param CustomerLoginPassword 入力されたログインパスワード
 * @return res データベースに接続しデータを取得したらtrueを返す
 * @throws SQLException SQL操作における例外
 */
	public boolean select(String CustomerLoginId,String CustomerLoginPassword) throws SQLException {
			try {
				con=DBconnector.getConnection();
				sql = "select * from premium_membership where premium_id = ? and premium_pass = ?";
				ps = con.prepareStatement(sql);
				ps.setString(1, CustomerLoginId);
				ps.setString(2, CustomerLoginPassword);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					res = true;
					setId(rs.getInt(1));
					setPremiumId(rs.getString(2));
					setName(rs.getString(4));
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				con.close();
			}
			return res;
		}
	/**
	 * DBにアクセスして入力されたshopIdと照合してGoodsリストを取得するメソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/07
	 * @param shopId	店舗ID
	 * @return res shopIdからグッズ情報を取得したらtrueを返す
	 * @throws SQLException SQL操作における例外
	 */
	public List<BeanGoodsDTO> SQLQuery(int shopId) {
		try{
			con=DBconnector.getConnection();
			String sql = "SELECT A.goods_id,A.bean_name,A.direct_from,A.price,B.stock,A.description,A.bitterness,A.sourness,A.depth,A.image_url,A.premium_image_url FROM bean_goods A,store_goods B WHERE A.goods_id=B.goods_id AND B.shop_id=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, shopId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				BeanGoodsDTO dto = new BeanGoodsDTO();
				dto.setGoodsId(rs.getInt(1));
				dto.setBeanName(rs.getString(2));
				dto.setDirectFrom(rs.getString(3));
				dto.setPrice(rs.getInt(4));
				dto.setStock(rs.getInt(5));
				dto.setDescription(rs.getString(6));
				dto.setBitterness(rs.getInt(7));
				dto.setSourness(rs.getInt(8));
				dto.setDepth(rs.getInt(9));
				dto.setImageUrl(rs.getString(10));
				dto.setPremiumImageUrl(rs.getString(11));
				BeanGoodsList.add(dto);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return BeanGoodsList;
	}
	/**
	 * アカウント番号取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/07
	 * @return id アカウント番号
	 */
	public int getId() {
		return id;
	}
	/**
	 * アカウント番号格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/07
	 * @param id アカウント番号
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * プレミアムID取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/07
	 * @return premiumId プレミアムID
	 */
	public String getPremiumId(){
		return premiumId;
	}
	/**
	 * プレミアムID格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/07
	 * @param premiumId プレミアムID
	 */
	public void setPremiumId(String premiumId){
		this.premiumId = premiumId;
	}
	/**
	 * 名前取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/07
	 * @return name 名前
	 */
	public String getName() {
		return name;
	}
	/**
	 * 名前格納メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/07
	 * @param name 名前
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 商品一覧取得メソッド
	 * @author Y.Yamazaki
	 * @since 2015/05/07
	 * @return BeabGoodsList 商品一覧
	 */
	public List<BeanGoodsDTO> getBeanGoodsList() {
		return BeanGoodsList;
	}
}
