package jp.co.internous.gpscoffee.dto;

import static org.junit.Assert.*;

import org.junit.Test;

public class PremiumInfoDTOTest {
	
	@Test
	public void testGetId() {
		int id = 9999;
		PremiumInfoDTO expected = new PremiumInfoDTO();
		expected.setId(9999);
        assertEquals(id, expected.getId());
	}
	@Test
	public void testSetId() {
		int id = 9999;
		PremiumInfoDTO expected = new PremiumInfoDTO();
		expected.setId(9999);
		int value = expected.getId();
	    assertEquals(value, id);
	}
	@Test
	public void testGetPremiumId() {
		String premiumId = "test";
		PremiumInfoDTO expected = new PremiumInfoDTO();
		expected.setPremiumId("test");
		assertSame(premiumId, expected.getPremiumId());
        assertEquals(premiumId, expected.getPremiumId());
	}
	@Test
	public void testSetPremiumId() {
		String premiumId = "test";
		PremiumInfoDTO expected = new PremiumInfoDTO();
		expected.setPremiumId("test");
		String value = expected.getPremiumId();
		assertSame(value, premiumId);
	    assertEquals(value, premiumId);
	}
	@Test
	public void testGetPremiumPassWord() {
		String premiumPassWord = "test";
		PremiumInfoDTO expected = new PremiumInfoDTO();
		expected.setPremiumPassWord("test");
		assertSame(premiumPassWord, expected.getPremiumPassWord());
        assertEquals(premiumPassWord, expected.getPremiumPassWord());
	}
	@Test
	public void testSetPremiumPassWord() {
		String premiumPassWord = "test";
		PremiumInfoDTO expected = new PremiumInfoDTO();
		expected.setPremiumPassWord("test");
		String value = expected.getPremiumPassWord();
		assertSame(value, premiumPassWord);
	    assertEquals(value, premiumPassWord);
	}
	@Test
	public void testGetName() {
		String name = "山田太郎";
		PremiumInfoDTO expected = new PremiumInfoDTO();
		expected.setName("山田太郎");
		assertSame(name, expected.getName());
        assertEquals(name, expected.getName());
	}
	@Test
	public void testSetName() {
		String name = "山田太郎";
		PremiumInfoDTO expected = new PremiumInfoDTO();
		expected.setName("山田太郎");
		String value = expected.getName();
		assertSame(value, name);
	    assertEquals(value, name);
	}
	@Test
	public void testGetPhoneNumber() {
		String phoneNumber = "000-0000-1001";
		PremiumInfoDTO expected = new PremiumInfoDTO();
		expected.setPhoneNumber("000-0000-1001");
		assertSame(phoneNumber, expected.getPhoneNumber());
        assertEquals(phoneNumber, expected.getPhoneNumber());
	}
	@Test
	public void testSetPhoneNumber() {
		String phoneNumber = "000-0000-1001";
		PremiumInfoDTO expected = new PremiumInfoDTO();
		expected.setPhoneNumber("000-0000-1001");
		String value = expected.getPhoneNumber();
		assertSame(value, phoneNumber);
	    assertEquals(value, phoneNumber);
	}
	@Test
	public void testGetRegisterDate() {
		int registerDate = 9999999;
		PremiumInfoDTO expected = new PremiumInfoDTO();
		expected.setRegisterDate(9999999);
        assertEquals(registerDate, expected.getRegisterDate());
	}
	@Test
	public void testSetRegisterDate() {
		int registerDate = 9999999;
		PremiumInfoDTO expected = new PremiumInfoDTO();
		expected.setRegisterDate(9999999);
		int value = expected.getRegisterDate();
	    assertEquals(value, registerDate);
	}
	@Test
	public void testGetUpdateDate() {
		int updateDate = 9999999;
		PremiumInfoDTO expected = new PremiumInfoDTO();
		expected.setUpdateDate(9999999);
        assertEquals(updateDate, expected.getUpdateDate());
	}
	@Test
	public void testSetUpdateDate() {
		int updateDate = 9999999;
		PremiumInfoDTO expected = new PremiumInfoDTO();
		expected.setUpdateDate(9999999);
		int value = expected.getUpdateDate();
	    assertEquals(value, updateDate);
	}
	@Test
	public void testGetDeleteDate() {
		int deleteDate = 9999999;
		PremiumInfoDTO expected = new PremiumInfoDTO();
		expected.setDeleteDate(9999999);
        assertEquals(deleteDate, expected.getDeleteDate());
	}
	@Test
	public void testSetDeleteDate() {
		int deleteDate = 9999999;
		PremiumInfoDTO expected = new PremiumInfoDTO();
		expected.setDeleteDate(9999999);
		int value = expected.getDeleteDate();
	    assertEquals(value, deleteDate);
	}
}
