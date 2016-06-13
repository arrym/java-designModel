package com.java.adapterForClass;

import org.junit.Test;

public class TestAdapter {
	@Test
	public void testAdapter() {
		Targetables targetables = new Adapter();
		targetables.method1();
		targetables.method2();
	}
}
