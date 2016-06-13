package com.java.factory;

public class Test {
	public static void main(String[] args) {
		Provider provider = null;
		Sender sender = null;
		// 生产mail信息
		provider = new SendMailFactory();
		sender = provider.produce();
		sender.send();
		// 生产sms信息
		provider = new SendSmsFactory();
		sender = provider.produce();
		sender.send();
	}
}
