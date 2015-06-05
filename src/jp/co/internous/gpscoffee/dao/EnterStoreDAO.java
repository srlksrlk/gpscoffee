package jp.co.internous.gpscoffee.dao;


import java.util.ArrayList;
import java.util.List;

import jp.co.internous.gpscoffee.dto.BeanGoodsDTO;
import jp.co.internous.gpscoffee.util.DBconnector;
import jp.co.internous.gpscoffee.util.DaoClass;

/**
 * GoodsInfoListDAO   商品一覧をDBから取得する
 * @author S.Takiyoshi
 * @since 2015/05/10
 * @version 1.0
 */
public class EnterStoreDAO  extends DaoClass{
	/**
	 * @author S.Takiyoshi
	 * @since2015/05/10
	 * BeanGoods 商品一覧
	 */
	List<BeanGoodsDTO> BeanGoods = new ArrayList<BeanGoodsDTO>();
	/**
	 *  DBにアクセスして選択された店舗情報から商品一覧情報を照合するメソッド
	 * @author S.Takiyoshi
	 * @since 2015/05/10
	 * @param shopId 店舗ID
	 * @return 例外処理に入らなければtrueを返す
	 * @throws Exception  SQL操作における例外
	 */
	public boolean SQLQuery(int shopId) throws Exception {
		DBconnector DBconnector = new DBconnector();
		res = false;
		con = null;
		try {
			con = DBconnector.getConnection();
			sql = "SELECT A.goods_id,A.bean_name,A.direct_from,A.price,B.stock,A.description,A.bitterness,A.sourness,A.depth,A.image_url FROM bean_goods A,store_goods B WHERE A.goods_id=B.goods_id AND B.shop_id=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, shopId);
			rs = ps.executeQuery();
			while (rs.next()) {
				res = true;
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
				BeanGoods.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return res;
	}
	/**
	 * 商品一覧取得メソッド
	 * @author S.Takiyoshi
	 * @since 2015/05/10
	 * @return BeanGoods 商品一覧
	 */
	public List<BeanGoodsDTO> getBeanGoods() {
		return BeanGoods;
	}
}
