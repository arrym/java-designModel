package com.java.simpleFactory;

import org.junit.Test;

/**
 * 测试类
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public class FactoryTest {
	public static void main(String[] args) {
		// 1.创建工厂对象
		SendFactory factory = new SendFactory();
		// 2.向上造型，生产信息
		Sender sender = factory.produce("sms");
		// 3.发送信息
		sender.send();
	}

	/**
	 * 测试具有静态方法的工厂类
	 */
	@Test
	public void testFactory() {
		Sender sender = null;
		sender = SendFactory_Static.produceSms();
		sender.send();
		// 利用多态，重新给sender赋值。
		sender = SendFactory_Static.produceMail();
		sender.send();
	}
}
