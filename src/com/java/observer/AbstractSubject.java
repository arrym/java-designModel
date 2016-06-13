package com.java.observer;

import java.util.Enumeration;
import java.util.Vector;

/***
 * 实现接口，抽象类实现接口时可以有选择的覆盖接口的方法 实现类实现接口时，必须覆盖接口中全部的抽象方法
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public abstract class AbstractSubject implements Subject {

	private Vector<Observer> vector = new Vector<>();

	@Override
	public void add(Observer observer) {
		vector.add(observer);
	}

	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}

	@Override
	public void notifyObserver() {
		Enumeration<Observer> enumo = vector.elements();
		while (enumo.hasMoreElements()) {
			enumo.nextElement().update();
		}
	}

}
