package com.stee.daoImpl;

import com.stee.dao.TestInteface;

public class TestImpl<T> implements TestInteface<T> {

	private T var;
	public TestImpl(T var){
		this.setVar(var);
	}
	@Override
	public T getVar() {
		return var;
	}
	public void setVar(T var) {
		this.var = var;
	}

}
