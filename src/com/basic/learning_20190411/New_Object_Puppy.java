package com.basic.learning_20190411;

//创建一个对象的例子,使用构造函数
//下面例子展示如何访问实例变量及调用成员方法
public class New_Object_Puppy {

	int puppyAge;

	public New_Object_Puppy(String name) {
		// 这个构造函数仅有一个参数 name
		System.out.println("小狗的名字是：" + name);
	}

	public void setAge(int age) {
		puppyAge = age;
	}

	public int getAge() {
		System.out.println("小狗的年龄为：" + puppyAge);
		return puppyAge;
	}

	public static void main(String[] args) {
		// 创建对象
		New_Object_Puppy myPuppy = new New_Object_Puppy("tommy");
		
		//通过方法来设定age
		myPuppy.setAge(2);
		
		//调用另一个方法来获取age
		myPuppy.getAge();
		
		//也可以像下面这样访问成员变量
		System.out.println("变量值："+myPuppy.puppyAge);
	}

}
