package com.java.facade;

import org.junit.Test;

public class User {
	@Test
	public void test() {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}
}
