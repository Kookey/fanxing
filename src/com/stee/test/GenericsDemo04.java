package com.stee.test;

import com.stee.fanxing.Info;


public class GenericsDemo04 {

	/**
	 * 受限泛型，只能接收Number和Number的子类
	 */
	public static void main(String[] args) {
		
		Info<Integer> info1 = new Info<Integer>();
		Info<Float> info2 = new Info<Float>();
		info1.setVar(10);
		info2.setVar(30.1f);
		
		info(info1);
		info(info2);
		
		Info<String> info3 = new Info<String>();
		info3.setVar("fdsfdsf");
		//info(info3);//编译出错
	}
	
	public static void info(Info<? extends Number> param){
		System.out.println("内容:"+param);
	}
}
