package com.stee.test;


public class GenericsDemo08 {

	public static void main(String[] args) {
		Info<String> info = null;
		info = new InfoImpl("ºÃµÄµÄ");
		System.out.println(info.getVar());
	}
}

interface Info<T> {
	public T getVar();
}

class InfoImpl implements Info<String>{
	private String var;

	public InfoImpl(String var){
		this.setVar(var);
	}
	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}
	
}
