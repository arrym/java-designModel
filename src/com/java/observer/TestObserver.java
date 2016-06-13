package com.java.observer;

import org.junit.Test;

public class TestObserver {
	@Test
	public void test() {
		Subject subject = new MySubject();
		subject.add(new Observer1());
		subject.add(new Observer2());
		subject.operation();
	}
}
