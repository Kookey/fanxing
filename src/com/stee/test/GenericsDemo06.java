package com.stee.test;

import com.stee.fanxing.Info;
import com.stee.fanxing.Point;

public class GenericsDemo06 {

	/**
	 * Java泛型无法向上转型
	 */
	public static void main(String[] args) {
		Info<String> info1 = new Info<String>();
		Info<Object> info2 = null;
		//info2 = info1;出错
	}
}
