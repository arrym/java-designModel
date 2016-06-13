package com.java.command;

/**
 * 命令模式
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public class CommandImpl implements Command {
	private Receiver receiver;

	@Override
	public void exe() {
		receiver.action();
	}

	public CommandImpl(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
}
