package com.stee.test;

import com.stee.fanxing.Info;


public class GenericsDemo05 {

	/**
	 * ���޷���,ֻ�ܽ���String ,Object
	 */
	public static void main(String[] args) {
		
		Info<String> info1 = new Info<String>();
		Info<Object> info2 = new Info<Object>();
		info1.setVar("fdfd");
		info2.setVar(30.1f);
		
		info(info1);
		info(info2);
		
		Info<Integer> info3 = new Info<Integer>();
		info3.setVar(212);
		//info(info3);//�������
		
	}
	
	public static void info(Info<? super String> param){
		System.out.println("����:"+param);
	}
}
