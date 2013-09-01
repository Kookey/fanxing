package com.stee.test;


public class GenericsDemo12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer ints[] = fun1(1,2,3,4,5);
		fun2(ints);
	}
	
	public static <T> T[] fun1(T ...params){//Ω” ’
		return params;
	}
	public static <T> void fun2(T param[]){
		for(T t:param){
			System.out.println(t);
		}
	}
}
