package com.java.observer;

/**
 * 实现类
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public class Observer2 implements Observer {
	@Override
	public void update() {
		System.out.println("observer2 has received!");
	}
}
