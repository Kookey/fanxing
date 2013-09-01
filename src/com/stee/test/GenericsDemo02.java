package com.stee.test;

import com.stee.fanxing.NotePad;

public class GenericsDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NotePad<String,Integer> notePad = null;
		notePad = new NotePad<String, Integer>();
		notePad.setKey("zhangsan");
		notePad.setValue(33);
		System.out.println("ĞÕÃû:"+notePad.getKey()+";ÄêÁä"+notePad.getValue());
	}
}
