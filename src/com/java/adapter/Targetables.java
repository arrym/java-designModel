package com.java.adapter;
/***
 * 目标接口
 * @author soul
 *
 */
public interface Targetables {

	//此方法与Source类中的method1()方法相同
	public abstract void method1();
	
	//此方法与Adapter类中的method1()方法相同
	public abstract void method2();
}
