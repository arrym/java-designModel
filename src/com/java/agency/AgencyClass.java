package com.java.agency;

/**
 * 代理类
 * 
 * @author soul
 * 
 */
public class AgencyClass implements AgencyInterface {

	private RealClass realClass;

	@Override
	public void show() {
		if (realClass == null) {
			realClass = new RealClass();
		}
		realClass.show();
	}
}
