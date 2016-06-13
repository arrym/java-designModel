package com.java.template;

import org.junit.Test;

public class StrategyTest {
	@Test
	public void test() {
		String exp = "8+7";
		AbstractCalculator cal = new Plus();
		int result = cal.calculator(exp, "\\+");
		System.out.println(result);
	}
}
