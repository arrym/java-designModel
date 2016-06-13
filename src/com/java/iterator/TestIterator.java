package com.java.iterator;

import org.junit.Test;

/**
 * 测试类
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public class TestIterator {
	@Test
	public void test() {
		Collection collection = new MyCollection();
		Iterator iterator = new MyIterator(collection);

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
