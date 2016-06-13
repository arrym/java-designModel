package com.java.observer;

/**
 * 观察者接口实现类
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public class Observer1 implements Observer {
	// 覆盖接口中的所有抽象方法，否则就是抽象类
	@Override
	public void update() {
		System.out.println("oberver1 has received！");
	}
}
