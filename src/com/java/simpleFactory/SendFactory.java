package com.java.simpleFactory;

/**
 * 发送信息的工厂类
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public class SendFactory {
	// 生产方法
	public Sender produce(String type) {
		// 判断生产哪一种类型的信息
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型！");
			return null;
		}
	}

}
