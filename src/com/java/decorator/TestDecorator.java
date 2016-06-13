package com.java.decorator;

import org.junit.Test;

public class TestDecorator {
	@Test
	public void testDecorator() {
		Sourceable sourceable = new Source();
		Sourceable obj = new Decorator(sourceable);

		obj.method();
	}
}
