package com.java.simpleFactory;

/**
 * 静态方法的工厂类，不许实例化
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public class SendFactory_Static {

	public static Sender produceMail() {
		return new MailSender();
	}

	public static Sender produceSms() {
		return new SmsSender();
	}
}
