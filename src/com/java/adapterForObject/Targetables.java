package com.java.adapterForObject;

/***
 * 目标接口
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public interface Targetables {

	// 此方法与Source类中的method1()方法相同
	public abstract void method1();

	// 此方法与Adapter类中的method1()方法相同
	public abstract void method2();
}
