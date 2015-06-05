package jp.co.internous.gpscoffee.util;

/**
 * CreateSelectId
 * 選択削除用のランダムIdを生成するクラス
 * @author K.Nishikigawa
 * @since 2015/05//15
 * @version 1.0
 */
public class CreateSelectId{
	/**
	 * 選択削除用のIDを生成するメソッド
	 * @author K.Nishikigawa
	 * @since 2015/05//12
	 * @return r 生成した乱数を返す
	 */
	public int execute() {
		int r=0;
		r = (int)(Math.random() * 100) + 1;
		return r ;
	}
}