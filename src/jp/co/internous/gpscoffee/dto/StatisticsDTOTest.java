package jp.co.internous.gpscoffee.dto;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatisticsDTOTest {
	@Test
	public void testGetProfit() {
		double profit = 1.2345;
		StatisticsDTO expected = new StatisticsDTO();
		expected.setProfit(1.2345);
		assertEquals(profit, expected.getProfit(), profit);
		//assertEquals(new Double(expected.getProfit()), new Double(profit));
	}
	@Test
	public void testSetProfit() {
		double profit = 1.2345;
		StatisticsDTO expected = new StatisticsDTO();
		expected.setProfit(1.2345);
		double value = expected.getProfit();
		assertEquals(value, profit, profit);
	}
}

