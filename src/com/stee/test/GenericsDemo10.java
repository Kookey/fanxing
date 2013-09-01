package com.stee.test;

public class GenericsDemo10 {

	public static void main(String[] args) {
		Wendy<Integer> info = getInfo(30);
		System.out.println(info.getVar());
	}

	public static <T extends Number> Wendy<T> getInfo(T params) {
		Wendy<T> info = new Wendy<T>();
		info.setVar(params);
		return info;
	}
}

class Wendy<T extends Number> {
	public T var;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}
}