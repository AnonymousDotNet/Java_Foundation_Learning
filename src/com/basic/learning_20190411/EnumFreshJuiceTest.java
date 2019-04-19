package com.basic.learning_20190411;

/*
 * 枚举代码示例
 * 通俗的理解：例如，我们为果汁店设计一个程序，它将限制果汁为小杯、中杯、大杯。这就意味着它不允许顾客点除了这三种尺寸外的果汁。
*/
public class EnumFreshJuiceTest {

	public static void main(String[] args) {
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
		System.out.println("测试枚举调用成功！");
	}

	public static class FreshJuice {
		enum FreshJuiceSize {
			SMALL, MEDIUM, LARGE
		}

		FreshJuiceSize size;
	}
}
