package com.java.singleton;

/**
 * 饿汉式单例
 * 
 * @author soul
 * @version v1.0 2014-11-12
 * 
 */
public class Singleton_2 {
	// 属性私有
	private static Singleton_2 instance = new Singleton_2();

	// 构造私有
	private Singleton_2() {
	}

	// 公共获取对象的方法
	public static Singleton_2 getInstance() {
		return instance;
	}
}
