package com.java.observer;

public interface Subject {
	// 增加观察者
	public abstract void add(Observer observer);

	// 删除观察者
	public abstract void del(Observer observer);

	// 通知所有的观察者
	public abstract void notifyObserver();

	// 自身的操作
	public abstract void operation();
}
