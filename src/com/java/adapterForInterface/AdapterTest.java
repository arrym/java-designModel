package com.java.adapterForInterface;

import org.junit.Test;

public class AdapterTest {
	@Test
	public void testAdapter() {
		Sourceable s1 = new SourceSub1();
		Sourceable s2 = new SourceSub2();

		s1.method1();
		// SourceSub1类中没有实现method2()，所以没有结果
		s1.method2();

		// SourceSub2类中没有实现method1()，所以没有结果
		s2.method1();
		s2.method2();
	}
}
