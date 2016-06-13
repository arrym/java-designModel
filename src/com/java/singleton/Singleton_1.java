package com.java.singleton;

/**
 * 通过内部类来实现单例
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public class Singleton_1 {
	// 构造私有化
	private Singleton_1() {
	}

	// 此处通过一个内部类来维护单例
	private static class SingletonFactory {
		private static Singleton_1 instance = new Singleton_1();
	}

	// 获取实例
	public static Singleton_1 getInsttance() {
		return SingletonFactory.instance;
	}

	// 序列化方法
	public Object readResolve() {
		return getInsttance();
	}
}