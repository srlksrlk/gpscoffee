package jp.co.internous.gpscoffee.dto;

import static org.junit.Assert.*;
import org.junit.Test;

public class HistoryDTOTest {
	@Test
	public void testGetShopId() {
		int shopId = 23;
		HistoryDTO expected = new HistoryDTO();
		expected.setShopId(23);
		assertSame(shopId, expected.getShopId());
        assertEquals(shopId, expected.getShopId());
	}
	@Test
	public void testSetShopId() {
		int shopId = 23;
		HistoryDTO expected = new HistoryDTO();
		expected.setShopId(23);
		int value = expected.getShopId();
		assertSame(value, shopId);
	    assertEquals(value, shopId);
	}
	@Test
	public void testGetInquiry() {
		int inquiry = 1000000;
		HistoryDTO expected = new HistoryDTO();
		expected.setInquiry(1000000);
        assertEquals(inquiry, expected.getInquiry());
	}
	@Test
	public void testSetInquiry() {
		int inquiry = 1000000;
		HistoryDTO expected = new HistoryDTO();
		expected.setInquiry(1000000);
		int value = expected.getInquiry();
	    assertEquals(value, inquiry);
	}
	@Test
	public void testGetPremiumId() {
		String premiumId = "test";
		HistoryDTO expected = new HistoryDTO();
		expected.setPremiumId("test");
		assertSame(premiumId, expected.getPremiumId());
        assertEquals(premiumId, expected.getPremiumId());
	}
	@Test
	public void testSetPremiumId() {
		String premiumId = "test";
		HistoryDTO expected = new HistoryDTO();
		expected.setPremiumId("test");
		String value = expected.getPremiumId();
		assertSame(value, premiumId);
	    assertEquals(value, premiumId);
	}
	@Test
	public void testGetBeanName() {
		String beanName = "ブラジル・サンマリノ";
		HistoryDTO expected = new HistoryDTO();
		expected.setBeanName("ブラジル・サンマリノ");
		assertSame(beanName, expected.getBeanName());
        assertEquals(beanName, expected.getBeanName());
	}
	@Test
	public void testSetBeanName() {
		String beanName = "ブラジル・サンマリノ";
		HistoryDTO expected = new HistoryDTO();
		expected.setBeanName("ブラジル・サンマリノ");
		String value = expected.getBeanName();
		assertSame(value, beanName);
	    assertEquals(value, beanName);
	}
	@Test
	public void testGetBeanRoast() {
		int beanRoast = 30;
		HistoryDTO expected = new HistoryDTO();
		expected.setBeanRoast(30);
		assertSame(beanRoast, expected.getBeanRoast());
        assertEquals(beanRoast, expected.getBeanRoast());
	}
	@Test
	public void testSetBeanRoast() {
		int beanRoast = 30;
		HistoryDTO expected = new HistoryDTO();
		expected.setBeanRoast(30);
		int value = expected.getBeanRoast();
		assertSame(value, beanRoast);
	    assertEquals(value, beanRoast);
	}
	@Test
	public void testGetBeanGrind() {
		int beanGrind = 5;
		HistoryDTO expected = new HistoryDTO();
		expected.setBeanGrind(5);
		assertSame(beanGrind, expected.getBeanGrind());
        assertEquals(beanGrind, expected.getBeanGrind());
	}
	@Test
	public void testSetBeanGrind() {
		int beanGrind = 5;
		HistoryDTO expected = new HistoryDTO();
		expected.setBeanGrind(5);
		int value = expected.getBeanGrind();
		assertSame(value, beanGrind);
	    assertEquals(value, beanGrind);
	}
	@Test
	public void testGetGram() {
		int gram = 100000;
		HistoryDTO expected = new HistoryDTO();
		expected.setGram(100000);
        assertEquals(gram, expected.getGram());
	}
	@Test
	public void testSetGram() {
		int gram = 100000;
		HistoryDTO expected = new HistoryDTO();
		expected.setGram(100000);
		int value = expected.getGram();
	    assertEquals(value, gram);
	}
	@Test
	public void testGetTotalAmount() {
		int totalAmount = 99999;
		HistoryDTO expected = new HistoryDTO();
		expected.setTotalAmount(99999);
        assertEquals(totalAmount, expected.getTotalAmount());
	}
	@Test
	public void testSetTotalAmount() {
		int totalAmount = 99999;
		HistoryDTO expected = new HistoryDTO();
		expected.setTotalAmount(99999);
		int value = expected.getTotalAmount();
	    assertEquals(value, totalAmount);
	}
	@Test
	public void testGetDeliveryTime() {
		String deliveryTime = "2015-05-12 17:30:00";
		HistoryDTO expected = new HistoryDTO();
		expected.setDeliveryTime("2015-05-12 17:30:00");
		assertSame(deliveryTime, expected.getDeliveryTime());
        assertEquals(deliveryTime, expected.getDeliveryTime());
	}
	@Test
	public void testSetDeliveryTime() {
		String deliveryTime = "2015-05-12 17:30:00";
		HistoryDTO expected = new HistoryDTO();
		expected.setDeliveryTime("2015-05-12 17:30:00");
		String value = expected.getDeliveryTime();
		assertSame(value, deliveryTime);
	    assertEquals(value, deliveryTime);
	}
}
