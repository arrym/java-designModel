package com.java.iterator;

/**
 * Collection接口
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public interface Collection {
	// 集合的迭代器
	public abstract Iterator iterator();

	// 获取对象
	public abstract Object get(int i);

	// 获取集合长度
	public abstract int size();

}
