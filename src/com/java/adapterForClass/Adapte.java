package com.java.adapterForClass;
/**
 * 适配类
 * @author soul
 * @version v1.0
 * 2014-11-12
 */
public class Adapte extends Source implements Targetables{

	@Override
	public void method2() {
		System.out.println("This is method2()");
	}
	
}
