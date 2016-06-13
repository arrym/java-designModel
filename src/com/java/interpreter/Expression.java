package com.java.interpreter;

import javax.naming.Context;

public interface Expression {

	public abstract void interpret(Context context);
}
