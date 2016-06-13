package com.java.singleton;

/**
 * 懒汉式单例模式
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public class Singleton {

	// 实例静态私有，null防止引用，延迟加载
	private static Singleton instance = null;

	// 构造私有
	private Singleton() {
	}

	// 公共静态的获取对象方法
	public static Singleton getInstance() {
		// 如果引用为空，则实例化一个对象
		if (instance == null) {
			// 使用同步代码块，避免线程安全问题，多层判断减少同步代码块的访问，降低性能的损耗
			synchronized (Class.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		// 然后返回对象
		return instance;
	}

	// 如果对象用于序列化，可以保证对象在序列化前后保持一致
	public Object readResolve() {
		return instance;
	}
}
