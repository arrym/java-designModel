package com.java.command;

import org.junit.Test;

public class TestCommand {
	@Test
	public void testCommand() {
		Receiver receiver = new Receiver();
		Command cmd = new CommandImpl(receiver);
		Invoker invoker = new Invoker(cmd);
		invoker.action();
	}

}
