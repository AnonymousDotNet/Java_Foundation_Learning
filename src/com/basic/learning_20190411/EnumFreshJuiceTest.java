package com.basic.learning_20190411;

/*
 * ö�ٴ���ʾ��
 * ͨ�׵���⣺���磬����Ϊ��֭�����һ�������������ƹ�֭ΪС�����б����󱭡������ζ����������˿͵���������ֳߴ���Ĺ�֭��
*/
public class EnumFreshJuiceTest {

	public static void main(String[] args) {
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
		System.out.println("����ö�ٵ��óɹ���");
	}

	public static class FreshJuice {
		enum FreshJuiceSize {
			SMALL, MEDIUM, LARGE
		}

		FreshJuiceSize size;
	}
}
