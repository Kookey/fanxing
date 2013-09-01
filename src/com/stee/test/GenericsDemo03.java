package com.stee.test;

import com.stee.fanxing.Info;

public class GenericsDemo03 {
	/**
	 * Í¨Åä·û:Info<?>
	 * @param args
	 */
	public static void main(String[] args) {
		Info<String> info = new Info<String>();
		info.setVar("if");
		infoTest(info);
		Info<Integer> intInfo = new Info<Integer>();
		intInfo.setVar(30);
		infoTest(intInfo);
	}
	
	public static void infoTest(Info<?> param){
		System.out.println("ÄÚÈÝ"+param);
	}
}
