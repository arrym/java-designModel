package com.java.adapterForObject;

/**
 * 适配类，将Source对象的功能扩展到Targetable类里
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public class Adapter implements Targetables {

	private Source source;

	public Adapter(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method2() {
		System.out.println("This is Targetable method");
	}

	@Override
	public void method1() {
		source.method1();
	}

}
