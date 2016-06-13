package com.java.observer;

/**
 * 实现类
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public class MySubject extends AbstractSubject {
	// 覆盖Subject接口的operation()方法
	@Override
	public void operation() {
		System.out.println("update self!");
		notifyObserver();
	}
}
