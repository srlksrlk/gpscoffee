package jp.co.internous.gpscoffee.dto;

import static org.junit.Assert.*;

import org.junit.Test;

public class StoreListDTOTest {
	
	@Test
	public void testGetShopId() {
		int shopId = 23;
		StoreListDTO expected = new StoreListDTO();
		expected.setShopId(23);
		assertSame(shopId, expected.getShopId());
        assertEquals(shopId, expected.getShopId());
	}
	@Test
	public void testSetShopId() {
		int shopId = 23;
		StoreListDTO expected = new StoreListDTO();
		expected.setShopId(23);
		int value = expected.getShopId();
		assertSame(value, shopId);
	    assertEquals(value, shopId);
	}
	@Test
	public void testGetShopName() {
		String shopName = "有楽町駅前店";
		StoreListDTO expected = new StoreListDTO();
		expected.setShopName("有楽町駅前店");
		assertSame(shopName, expected.getShopName());
        assertEquals(shopName, expected.getShopName());
	}
	@Test
	public void testSetShopName() {
		String shopName = "有楽町駅前店";
		StoreListDTO expected = new StoreListDTO();
		expected.setShopName("有楽町駅前店");
		String value = expected.getShopName();
		assertSame(value, shopName);
	    assertEquals(value, shopName);
	}
	@Test
	public void testGetZipcode() {
		String zipcode = "100-0005";
		StoreListDTO expected = new StoreListDTO();
		expected.setZipcode("100-0005");
		assertSame(zipcode, expected.getZipcode());
        assertEquals(zipcode, expected.getZipcode());
	}
	@Test
	public void testSetZipcode() {
		String zipcode = "100-0005";
		StoreListDTO expected = new StoreListDTO();
		expected.setZipcode("100-0005");
		String value = expected.getZipcode();
		assertSame(value, zipcode);
	    assertEquals(value, zipcode);
	}
	@Test
	public void testGetShopAddress() {
		String shopAddress = "東京都千代田区丸の内3-6-11";
		StoreListDTO expected = new StoreListDTO();
		expected.setShopAddress("東京都千代田区丸の内3-6-11");
		assertSame(shopAddress, expected.getShopAddress());
        assertEquals(shopAddress, expected.getShopAddress());
	}
	@Test
	public void testSetShopAddress() {
		String shopAddress = "東京都千代田区丸の内3-6-11";
		StoreListDTO expected = new StoreListDTO();
		expected.setShopAddress("東京都千代田区丸の内3-6-11");
		String value = expected.getShopAddress();
		assertSame(value, shopAddress);
	    assertEquals(value, shopAddress);
	}
	@Test
	public void testGetShopNumber() {
		String shopNumber = "000-0000-0001";
		StoreListDTO expected = new StoreListDTO();
		expected.setShopNumber("000-0000-0001");
		assertSame(shopNumber, expected.getShopNumber());
        assertEquals(shopNumber, expected.getShopNumber());
	}
	@Test
	public void testSetShopNumber() {
		String shopNumber = "000-0000-0001";
		StoreListDTO expected = new StoreListDTO();
		expected.setShopNumber("000-0000-0001");
		String value = expected.getShopNumber();
		assertSame(value, shopNumber);
	    assertEquals(value, shopNumber);
	}
	@Test
	public void testGetAdministratorId() {
		String administratorId = "test";
		StoreListDTO expected = new StoreListDTO();
		expected.setAdministratorId("test");
		assertSame(administratorId, expected.getAdministratorId());
        assertEquals(administratorId, expected.getAdministratorId());
	}
	@Test
	public void testSetAdministratorId() {
		String administratorId = "test";
		StoreListDTO expected = new StoreListDTO();
		expected.setAdministratorId("test");
		String value = expected.getAdministratorId();
		assertSame(value, administratorId);
	    assertEquals(value, administratorId);
	}
	@Test
	public void testGetAdministratorPass() {
		String administratorPass = "tiyoda";
		StoreListDTO expected = new StoreListDTO();
		expected.setAdministratorPass("tiyoda");
		assertSame(administratorPass, expected.getAdministratorPass());
        assertEquals(administratorPass, expected.getAdministratorPass());
	}
	@Test
	public void testSetAdministratorPass() {
		String administratorPass = "tiyoda";
		StoreListDTO expected = new StoreListDTO();
		expected.setAdministratorPass("tiyoda");
		String value = expected.getAdministratorPass();
		assertSame(value, administratorPass);
	    assertEquals(value, administratorPass);
	}
	@Test
	public void testGetAdministratorName() {
		String administratorName = "千代田一郎";
		StoreListDTO expected = new StoreListDTO();
		expected.setAdministratorName("千代田一郎");
		assertSame(administratorName, expected.getAdministratorName());
        assertEquals(administratorName, expected.getAdministratorName());
	}
	@Test
	public void testSetAdministratorName() {
		String administratorName = "千代田一郎";
		StoreListDTO expected = new StoreListDTO();
		expected.setAdministratorName("千代田一郎");
		String value = expected.getAdministratorName();
		assertSame(value, administratorName);
	    assertEquals(value, administratorName);
	}
}
