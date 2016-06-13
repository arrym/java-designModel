package com.java.simpleFactory;

/**
 * 短信实现接口
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public class SmsSender implements Sender {
	// 实现发送信息的方法
	@Override
	public void send() {
		System.out.println("This is sms sender!");
	}

}
