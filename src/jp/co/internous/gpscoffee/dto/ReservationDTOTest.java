package jp.co.internous.gpscoffee.dto;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReservationDTOTest {

	@Test
	public void testGetShopId() {
		int shopId = 23;
		ReservationDTO expected = new ReservationDTO();
		expected.setShopId(23);
		assertSame(shopId, expected.getShopId());
        assertEquals(shopId, expected.getShopId());
	}
	@Test
	public void testSetShopId() {
		int shopId = 23;
		ReservationDTO expected = new ReservationDTO();
		expected.setShopId(23);
		int value = expected.getShopId();
		assertSame(value, shopId);
	    assertEquals(value, shopId);
	}
	@Test
	public void testGetInquiry() {
		int inquiry = 1000000;
		ReservationDTO expected = new ReservationDTO();
		expected.setInquiry(1000000);
        assertEquals(inquiry, expected.getInquiry());
	}
	@Test
	public void testSetInquiry() {
		int inquiry = 1000000;
		ReservationDTO expected = new ReservationDTO();
		expected.setInquiry(1000000);
		int value = expected.getInquiry();
	    assertEquals(value, inquiry);
	}
	@Test
	public void testGetPremiumId() {
		String premiumId = "test";
		ReservationDTO expected = new ReservationDTO();
		expected.setPremiumId("test");
		assertSame(premiumId, expected.getPremiumId());
        assertEquals(premiumId, expected.getPremiumId());
	}
	@Test
	public void testSetPremiumId() {
		String premiumId = "test";
		ReservationDTO expected = new ReservationDTO();
		expected.setPremiumId("test");
		String value = expected.getPremiumId();
		assertSame(value, premiumId);
	    assertEquals(value, premiumId);
	}
	@Test
	public void testGetBeanName() {
		String beanName = "ブラジル・サンマリノ";
		ReservationDTO expected = new ReservationDTO();
		expected.setBeanName("ブラジル・サンマリノ");
		assertSame(beanName, expected.getBeanName());
        assertEquals(beanName, expected.getBeanName());
	}
	@Test
	public void testSetBeanName() {
		String beanName = "ブラジル・サンマリノ";
		ReservationDTO expected = new ReservationDTO();
		expected.setBeanName("ブラジル・サンマリノ");
		String value = expected.getBeanName();
		assertSame(value, beanName);
	    assertEquals(value, beanName);
	}
	@Test
	public void testGetBeanRoast() {
		int beanRoast = 8;
		ReservationDTO expected = new ReservationDTO();
		expected.setBeanRoast(8);
		assertSame(beanRoast, expected.getBeanRoast());
        assertEquals(beanRoast, expected.getBeanRoast());
	}
	@Test
	public void testSetBeanRoast() {
		int beanRoast = 8;
		ReservationDTO expected = new ReservationDTO();
		expected.setBeanRoast(8);
		int value = expected.getBeanRoast();
		assertSame(value, beanRoast);
	    assertEquals(value, beanRoast);
	}
	@Test
	public void testGetRoastName() {
		String roastName = "ライト・ロースト";
		ReservationDTO expected = new ReservationDTO();
		expected.setRoastName("ライト・ロースト");
		assertSame(roastName, expected.getRoastName());
        assertEquals(roastName, expected.getRoastName());
	}
	@Test
	public void testSetRoastName() {
		String roastName = "ライト・ロースト";
		ReservationDTO expected = new ReservationDTO();
		expected.setRoastName("ライト・ロースト");
		String value = expected.getRoastName();
		assertSame(value, roastName);
	    assertEquals(value, roastName);
	}
	@Test
	public void testGetRoastTime() {
		int roastTime = 1000;
		ReservationDTO expected = new ReservationDTO();
		expected.setRoastTime(1000);
        assertEquals(roastTime, expected.getRoastTime());
	}
	@Test
	public void testSetRoastTime() {
		int roastTime = 1000;
		ReservationDTO expected = new ReservationDTO();
		expected.setRoastTime(1000);
		int value = expected.getRoastTime();
	    assertEquals(value, roastTime);
	}
	@Test
	public void testGetBeanGrind() {
		int beanGrind = 10;
		ReservationDTO expected = new ReservationDTO();
		expected.setBeanGrind(10);
		assertSame(beanGrind, expected.getBeanGrind());
        assertEquals(beanGrind, expected.getBeanGrind());
	}
	@Test
	public void testSetBeanGrind() {
		int beanGrind = 10;
		ReservationDTO expected = new ReservationDTO();
		expected.setBeanGrind(10);
		int value = expected.getBeanGrind();
		assertSame(value, beanGrind);
	    assertEquals(value, beanGrind);
	}
	@Test
	public void testGetGrindName() {
		String grindName ="極細挽き";
		ReservationDTO expected = new ReservationDTO();
		expected.setGrindName("極細挽き");
		assertSame(grindName, expected.getGrindName());
        assertEquals(grindName, expected.getGrindName());
	}
	@Test
	public void testSetGrindName() {
		String grindName ="極細挽き";
		ReservationDTO expected = new ReservationDTO();
		expected.setGrindName("極細挽き");
		String value = expected.getGrindName();
		assertSame(value, grindName);
	    assertEquals(value, grindName);
	}
	@Test
	public void testGetGrindTime(){
		int grindTime = 1000;
		ReservationDTO expected = new ReservationDTO();
		expected.setGrindTime(1000);
        assertEquals(grindTime, expected.getGrindTime());
	}
	@Test
	public void testSetGrindTime() {
		int grindTime = 1000;
		ReservationDTO expected = new ReservationDTO();
		expected.setGrindTime(1000);
		int value = expected.getGrindTime();
	    assertEquals(value, grindTime);
	}
	@Test
	public void testGetGram() {
		int gram = 99999;
		ReservationDTO expected = new ReservationDTO();
		expected.setGram(99999);
        assertEquals(gram, expected.getGram());
	}
	@Test
	public void testSetGram() {
		int gram = 99999;
		ReservationDTO expected = new ReservationDTO();
		expected.setGram(99999);
		int value = expected.getGram();
	    assertEquals(value, gram);
	}
	@Test
	public void testGetDrink() {
		int drink = 99;
		ReservationDTO expected = new ReservationDTO();
		expected.setDrink(99);
		assertSame(drink, expected.getDrink());
        assertEquals(drink, expected.getDrink());
	}
	@Test
	public void testSetDrink() {
		int drink = 99;
		ReservationDTO expected = new ReservationDTO();
		expected.setDrink(99);
		int value = expected.getDrink();
		assertSame(value, drink);
	    assertEquals(value, drink);
	}
	@Test
	public void testGetTotalAmount() {
		int totalAmount = 99999;
		ReservationDTO expected = new ReservationDTO();
		expected.setTotalAmount(99999);
        assertEquals(totalAmount, expected.getTotalAmount());
	}
	@Test
	public void testSetTotalAmount() {
		int totalAmount = 99999;
		ReservationDTO expected = new ReservationDTO();
		expected.setTotalAmount(99999);
		int value = expected.getTotalAmount();
	    assertEquals(value, totalAmount);
	}
	@Test
	public void testGetDeliveryTime() {
		String deliveryTime = "2015-05-12 17:30:00";
		ReservationDTO expected = new ReservationDTO();
		expected.setDeliveryTime("2015-05-12 17:30:00");
		assertSame(deliveryTime, expected.getDeliveryTime());
        assertEquals(deliveryTime, expected.getDeliveryTime());
	}
	@Test
	public void testSetDeliveryTime() {
		String deliveryTime = "2015-05-12 17:30:00";
		ReservationDTO expected = new ReservationDTO();
		expected.setDeliveryTime("2015-05-12 17:30:00");
		String value = expected.getDeliveryTime();
		assertSame(value, deliveryTime);
	    assertEquals(value, deliveryTime);
	}
	@Test
	public void testGetPrice() {
		int price = 9999;
		ReservationDTO expected = new ReservationDTO();
		expected.setPrice(9999);
        assertEquals(price, expected.getPrice());
	}
	@Test
	public void testSetPrice() {
		int price = 9999;
		ReservationDTO expected = new ReservationDTO();
		expected.setPrice(9999);
		int value = expected.getPrice();
	    assertEquals(value, price);
	}
	@Test
	public void testGetGoodsId() {
		int goodsId = 999;
		ReservationDTO expected = new ReservationDTO();
		expected.setGoodsId(999);
        assertEquals(goodsId, expected.getGoodsId());
	}
	@Test
	public void testSetGoodsId() {
		int goodsId = 999;
		ReservationDTO expected = new ReservationDTO();
		expected.setGoodsId(999);
		int value = expected.getGoodsId();
	    assertEquals(value, goodsId);
	}
	@Test
	public void testGetReservationTime() {
		String reservationTime = "2015-05-12 12:30:00";
		ReservationDTO expected = new ReservationDTO();
		expected.setReservationTime("2015-05-12 12:30:00");
		assertSame(reservationTime, expected.getReservationTime());
        assertEquals(reservationTime, expected.getReservationTime());
	}
	@Test
	public void testSetReservationTime() {
		String reservationTime = "2015-05-12 12:30:00";
		ReservationDTO expected = new ReservationDTO();
		expected.setReservationTime("2015-05-12 12:30:00");
		String value = expected.getReservationTime();
		assertSame(value, reservationTime);
	    assertEquals(value, reservationTime);
	}
	@Test
	public void testGetSelectId() {
		int selectId = 999999999;
		ReservationDTO expected = new ReservationDTO();
		expected.setSelectId(999999999);
        assertEquals(selectId, expected.getSelectId());
	}
	@Test
	public void testSetSelectId() {
		int selectId = 999999999;
		ReservationDTO expected = new ReservationDTO();
		expected.setSelectId(999999999);
		int value = expected.getSelectId();
	    assertEquals(value, selectId);
	}
	@Test
	public void testGetOrderCode() {
		int orderCode = 123456789;
		ReservationDTO expected = new ReservationDTO();
		expected.setOrderCode(123456789);
		assertEquals(orderCode, expected.getOrderCode());
	}
	@Test
	public void testSetOrderCode() {
		int orderCode = 123456789;
		ReservationDTO expected = new ReservationDTO();
		expected.setOrderCode(123456789);
		int value = expected.getOrderCode();
		assertEquals(value, orderCode);
	}
}


