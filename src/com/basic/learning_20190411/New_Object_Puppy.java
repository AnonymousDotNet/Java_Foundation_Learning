package com.basic.learning_20190411;

//����һ�����������,ʹ�ù��캯��
//��������չʾ��η���ʵ�����������ó�Ա����
public class New_Object_Puppy {

	int puppyAge;

	public New_Object_Puppy(String name) {
		// ������캯������һ������ name
		System.out.println("С���������ǣ�" + name);
	}

	public void setAge(int age) {
		puppyAge = age;
	}

	public int getAge() {
		System.out.println("С��������Ϊ��" + puppyAge);
		return puppyAge;
	}

	public static void main(String[] args) {
		// ��������
		New_Object_Puppy myPuppy = new New_Object_Puppy("tommy");
		
		//ͨ���������趨age
		myPuppy.setAge(2);
		
		//������һ����������ȡage
		myPuppy.getAge();
		
		//Ҳ�����������������ʳ�Ա����
		System.out.println("����ֵ��"+myPuppy.puppyAge);
	}

}
