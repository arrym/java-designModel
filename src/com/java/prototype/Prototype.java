package com.java.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型类，实现Cloneable接口即可
 * 
 * @author soul
 * @version v1.0 2014-11-12
 * 
 */
public class Prototype implements Cloneable, Serializable {

	private String string;
	private SerializableObject object;

	// 覆盖Object类的clone()方法
	// 浅复制
	@Override
	public Object clone() {
		Prototype prototype = null;
		try {
			// 调用父类的clone()方法
			prototype = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
		return prototype;
	}

	// 深复制
	public Object deepClone() throws Exception {
		// 写入当前对象的二进制流
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				byteArrayOutputStream);
		objectOutputStream.writeObject(this);
		// 读取当前对象的二进制流
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
				byteArrayOutputStream.toByteArray());
		ObjectInputStream inputStream = new ObjectInputStream(
				byteArrayInputStream);

		return inputStream.readObject();
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public SerializableObject getObject() {
		return object;
	}

	public void setObject(SerializableObject Object) {
		this.object = Object;
	}
}

/**
 * SerializableObject类Serializable接口可以序列化
 * 
 * @author soul
 * @version v1.0 2014-11-12
 * 
 */
class SerializableObject implements Serializable {

	private static final long serialVersionUID = 1L;
}