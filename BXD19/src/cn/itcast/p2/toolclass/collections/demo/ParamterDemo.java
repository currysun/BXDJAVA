package cn.itcast.p2.toolclass.collections.demo;

import java.util.Arrays;

public class ParamterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum= newAdd(10,5,2,9);
	}

	/*
	 * 函数的可变参数。其实就是一个数组，但是接受的是数组的元素。
	 * 自动将这些元素封装成数组。简化了调用者的书写。
	 * 
	 * 注意事项：可变参数类型必须定义在形参的结尾
	 */
	public static int newAdd(int a,int... arr) {
		System.out.println(Arrays.toString(arr));
		return 0;
	}
	
	

}
