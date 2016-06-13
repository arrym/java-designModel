package com.java.simpleFactory;

/**
 * 邮件实现接口
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public class MailSender implements Sender {
	// 实现发送信息的方法
	@Override
	public void send() {
		System.out.println("This is mailsender!");
	}

}
