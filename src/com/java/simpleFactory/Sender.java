package com.java.simpleFactory;

/**
 * 邮件和短信的统一接口
 * 
 * @author soul
 * @version v1.0 2014-11-12
 */
public interface Sender {
	// 邮件和短信都可以发送信息，所以向上抽取为接口
	public abstract void send();
}
