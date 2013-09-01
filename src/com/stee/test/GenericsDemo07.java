package com.stee.test;

import com.stee.dao.TestInteface;
import com.stee.daoImpl.TestImpl;


public class GenericsDemo07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestInteface<Integer> test = null;
		test = new TestImpl<Integer>(34);
		System.out.println("Êý×Ö:"+test.getVar());
	}
}
