package com.java.facade;

/**
 * 外观模式
 * 
 * @author soul
 * 
 */
public class Computer {

	private CPU cpu;
	private Memory memory;
	private Disk disk;

	public Computer() {
		super();
		this.cpu = new CPU();
		this.memory = new Memory();
		this.disk = new Disk();
	}

	public void startup() {
		System.out.println("start the computer!");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("start computer finished!");
	}

	public void shutdown() {

		System.out.println("begin to close computer!");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("computer closed!");
	}
}
