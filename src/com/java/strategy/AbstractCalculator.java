package com.java.strategy;

/**
 * 辅助类
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public abstract class AbstractCalculator {

	public int[] split(String exp, String opt) {

		String[] array = exp.split(opt);
		int[] arrayInt = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);

		return arrayInt;
	}
}
