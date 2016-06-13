package com.java.strategy;

import org.junit.Test;

public class Test1 {

	@Test
	public void test() {
		String exp = "4+8";
		ICalculator cal = new Plus();
		int result = cal.calculate(exp);
		System.out.println(result);

		String exp1 = "4*8";
		ICalculator cal1 = new Multiply();
		int result1 = cal1.calculate(exp1);
		System.out.println(result1);

	}
}
