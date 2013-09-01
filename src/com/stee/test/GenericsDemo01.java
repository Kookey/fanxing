package com.stee.test;

import com.stee.fanxing.Point;

public class GenericsDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point<String> point = new Point<String>();
		point.setVar("fanxing");
		System.out.println(point.getVar().length());
	}
}
