package com.stee.test;

public class GenericsDemo11 {

	/**
	 * ʹ�÷���ͳһ����Ĳ�������
	 */
	public static void main(String[] args) {
		Demo4<String> demo1 = new Demo4<String>();
		demo1.setVar("Hello");
		Demo4<String> demo2 = new Demo4<String>();
		demo2.setVar("��ķ");
		add(demo1,demo2);
	}
	
	public static <T> void add(Demo4<T> demo1,Demo4<T> demo2){
		System.out.println(demo1+";"+demo2);
	}
}
class Demo4<T>{
	
	private T var;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}
	@Override
	public String toString() {
		return var.toString();
	}
}
