package com.java.agency;

/**
 * 被代理的类
 * 
 * @author soul
 * 
 */
public class RealClass implements AgencyInterface {

	@Override
	public void show() {
		System.out.println("大家好，我是被代理的对象！");
	}

}
