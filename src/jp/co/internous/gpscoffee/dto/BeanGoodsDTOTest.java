package jp.co.internous.gpscoffee.dto;

import static org.junit.Assert.*;
import org.junit.Test;

public class BeanGoodsDTOTest {

	@Test
	public void testGetGoodsId() {
		int goodsId = 10;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setGoodsId(10);
		assertSame(goodsId, expected.getGoodsId());
        assertEquals(goodsId, expected.getGoodsId());
	}
	@Test
	public void testSetGoodsId() {
		int goodsId = 10;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setGoodsId(10);
		int value = expected.getGoodsId();
		assertSame(value, goodsId);
	    assertEquals(value, goodsId);
	}
	@Test
	public void testGetBeanName() {
		String beanName = "ブラジル・サンマリノ";
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setBeanName("ブラジル・サンマリノ");
		assertSame(beanName, expected.getBeanName());
	    assertEquals(beanName, expected.getBeanName());
	}
	@Test
	public void testSetBeanName() {
		String beanName = "ブラジル・サンマリノ";
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setBeanName("ブラジル・サンマリノ");
		String value = expected.getBeanName();
		assertSame(value, beanName);
	    assertEquals(value, beanName);
	}
	@Test
	public void testGetDirectFrom() {
		String directFrom = "南米・ブラジル";
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setDirectFrom("南米・ブラジル");
		assertSame(directFrom, expected.getDirectFrom());
	    assertEquals(directFrom, expected.getDirectFrom());
	}
	@Test
	public void testSetDirectFrom() {
		String directFrom = "南米・ブラジル";
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setDirectFrom("南米・ブラジル");
		String value = expected.getDirectFrom();
		assertSame(value, directFrom);
	    assertEquals(value, directFrom);
	}
	@Test
	public void testGetPrice() {
		int price = 9999999;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setPrice(9999999);
	    assertEquals(price, expected.getPrice());
	}
	@Test
	public void testSetPrice() {
		int price = 9999999;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setPrice(9999999);
		int value = expected.getPrice();
	    assertEquals(value, price);
	}
	@Test
	public void testGetStock() {
		int stock = 9999999;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setStock(9999999);
	    assertEquals(stock, expected.getStock());
	}
	@Test
	public void testSetStock() {
		int stock = 9999999;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setStock(9999999);
		int value = expected.getStock();
	    assertEquals(value, stock);
	}
	@Test
	public void testGetShopId() {
		int shopId = 23;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setShopId(23);
		assertSame(shopId, expected.getShopId());
	    assertEquals(shopId, expected.getShopId());
	}
	@Test
	public void testSetShopId() {
		int shopId = 23;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setShopId(23);
		int value = expected.getShopId();
		assertSame(value, shopId);
	    assertEquals(value, shopId);
	}
	@Test
	public void testGetTotalAmount() {
		int totalAmount = 9999999;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setTotalAmount(9999999);
	    assertEquals(totalAmount, expected.getTotalAmount());
	}
	@Test
	public void testSetTotalAmount() {
		int totalAmount = 9999999;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setTotalAmount(9999999);
		int value = expected.getTotalAmount();
	    assertEquals(value, totalAmount);
	}
	@Test
	public void testGetBeanGrind() {
		int beanGrind = 5;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setBeanGrind(5);
		assertSame(beanGrind, expected.getBeanGrind());
	    assertEquals(beanGrind, expected.getBeanGrind());
	}
	@Test
	public void testSetBeanGrind() {
		int beanGrind = 5;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setBeanGrind(5);
		int value = expected.getBeanGrind();
		assertSame(value, beanGrind);
	    assertEquals(value, beanGrind);
	}
	@Test
	public void testGetBeanRoast() {
		int beanRoast = 30;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setBeanRoast(30);
		assertSame(beanRoast, expected.getBeanRoast());
	    assertEquals(beanRoast, expected.getBeanRoast());
	}
	@Test
	public void testSetBeanRoast() {
		int beanRoast = 30;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setBeanRoast(30);
		int value = expected.getBeanRoast();
		assertSame(value, beanRoast);
	    assertEquals(value, beanRoast);
	}
	@Test
	public void testGetDescription() {
		String description = "強烈な主張を持つコクと甘み。 「これぞ、ブラジル産」と言わしめる力強さを持ち合わせています。";
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setDescription("強烈な主張を持つコクと甘み。 「これぞ、ブラジル産」と言わしめる力強さを持ち合わせています。");
		assertSame(description, expected.getDescription());
	    assertEquals(description, expected.getDescription());
	}
	@Test
	public void testSetDescription() {
		String description = "強烈な主張を持つコクと甘み。 「これぞ、ブラジル産」と言わしめる力強さを持ち合わせています。";
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setDescription("強烈な主張を持つコクと甘み。 「これぞ、ブラジル産」と言わしめる力強さを持ち合わせています。");
		String value = expected.getDescription();
		assertSame(value, description);
	    assertEquals(value, description);
	}
	@Test
	public void testGetBitterness() {
		int bitterness = 200;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setBitterness(200);
	    assertEquals(bitterness, expected.getBitterness());
	}
	@Test
	public void testSetBitterness() {
		int bitterness = 200;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setBitterness(200);
		int value = expected.getBitterness();
	    assertEquals(value, bitterness);
	}
	@Test
	public void testGetSourness() {
		int sourness = 200;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setSourness(200);
	    assertEquals(sourness, expected.getSourness());
	}
	@Test
	public void testSetSourness() {
		int sourness = 200;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setSourness(200);
		int value = expected.getSourness();
	    assertEquals(value, sourness);
	}
	@Test
	public void testGetDepth() {
		int depth = 200;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setDepth(200);
	    assertEquals(depth, expected.getDepth());
	}
	@Test
	public void testSetDepth() {
		int depth = 200;
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setDepth(200);
		int value = expected.getDepth();
	    assertEquals(value, depth);
	}
	@Test
	public void testGetImageUrl() {
		String imageUrl = "goods/1.jpg";
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setImageUrl("goods/1.jpg");
		assertSame(imageUrl, expected.getImageUrl());
	    assertEquals(imageUrl, expected.getImageUrl());
	}
	@Test
	public void testSetImageUrl() {
		String imageUrl = "goods/1.jpg";
		BeanGoodsDTO expected = new BeanGoodsDTO();
		expected.setImageUrl("goods/1.jpg");
		String value = expected.getImageUrl();
		assertSame(value, imageUrl);
	    assertEquals(value, imageUrl);
	}
}
