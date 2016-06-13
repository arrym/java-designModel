package com.java.adapterForObject;

import org.junit.Test;

public class TestAdapter {
	@Test
	public void testAdapter() {
		Source source = new Source();
		Targetables targetables = new Adapter(source);
		targetables.method1();
		targetables.method2();
	}
}
