package com.java.iterator;

/**
 * 迭代器的实现类
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public class MyIterator implements Iterator {
	// 持有集合引用
	private Collection collection;
	//
	private int pos = -1;

	@Override
	public Object previous() {
		// 判断
		if (pos > 0) {
			pos--;
		}
		return collection.get(pos);
	}

	@Override
	public Object next() {

		if (pos < collection.size() - 1) {
			pos++;
		}
		return collection.get(pos);
	}

	@Override
	public boolean hasNext() {
		if (pos < collection.size() - 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object first() {
		pos = 0;
		return collection.get(pos);
	}

	public MyIterator(Collection collection) {
		this.collection = collection;
	}
}
