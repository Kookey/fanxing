package com.stee.test;

public class GenericsDemo13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test6<MapDemo<Integer,String>> test1 = null;
		MapDemo<Integer,String> map = null;
		map = new MapDemo<Integer, String>(3,"HelloWorld");
		test1 = new Test6<MapDemo<Integer,String>>(map);
		System.out.println(test1.getInfo().getKey()+";"+test1.getInfo().getVal());
	}
}
class MapDemo<K,V>{
	private K key;
	private V val;
	
	public MapDemo(K key,V val){
		this.setKey(key);
		this.setVal(val);
	}
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getVal() {
		return val;
	}
	public void setVal(V val) {
		this.val = val;
	}
}
class Test6<S>{
	private S info;

	public Test6(S info){
		this.setInfo(info);
	}
	public S getInfo() {
		return info;
	}

	public void setInfo(S info) {
		this.info = info;
	}
}