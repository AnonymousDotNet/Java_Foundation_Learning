package com.basic.test_20190414;

public class Test {

	public static void main(String[] args) {
		Parent p = new Son(); // 3.父类的引用指向子类的对象
		Parent p1 = new Daughter(); // 3.父类的引用指向子类的对象
		System.out.println(p + ":" + "aa" + "；" + p1 + ":" + "bb");
	}

}
