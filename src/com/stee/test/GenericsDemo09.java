package com.stee.test;


public class GenericsDemo09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.getVar("×Ö·û´®"));
		System.out.println(demo.getVar(32343));
	}
}

class Demo{
	public <T> T getVar(T t){
		return t;
	}
}
