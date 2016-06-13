package com.java.iterator;

/**
 * 迭代模式
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public interface Iterator {
	// 上一个
	public abstract Object previous();

	// 下一个
	public abstract Object next();

	// 是否有下一个
	public abstract boolean hasNext();

	// 第一个
	public Object first();
}
