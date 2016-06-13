package com.java.singleton;

import org.junit.Test;

/**
 * 测试类
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public class TestSingleton {
	/**
	 * 测试懒汉式单例
	 */
	@Test
	public void testSingleton01() {
		// 获取对象
		Singleton s1 = Singleton.getInstance();
		// 再获取一次
		Singleton s2 = Singleton.getInstance();
		// 是否只有一个对象？
		System.out.println(s1 == s2);
	}

	/**
	 * 内部类维护的单例
	 */
	@Test
	public void testSingleton02() {

		Singleton_1 s1 = Singleton_1.getInsttance();
		Singleton_1 s2 = Singleton_1.getInsttance();

		System.out.println(s1 == s2);
	}

}
