package com.java.iterator;

/**
 * 集合接口的实现类
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public class MyCollection implements Collection {

	// 集合元素
	public String[] string = { "D", "C", "A", "B" };

	@Override
	public Iterator iterator() {
		// 返回集合迭代器
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		// 返回集合的元素
		return string[i];
	}

	@Override
	public int size() {
		// 返回集合长度
		return string.length;
	}
}
