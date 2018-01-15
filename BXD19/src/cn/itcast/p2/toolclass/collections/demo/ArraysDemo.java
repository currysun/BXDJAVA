package cn.itcast.p2.toolclass.collections.demo;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 重点： List asList 将数组转换成集合
		 * 
		 * 好处：可以使用集合的方法操作数组中的元素。
		 * 注意：数组的长度是固定的，集合对于数组的增删方法是不能使用得。
		 */
		
		demo_1();
	}

	public static void demo_1() {
		String[] arr= {"curry","durant","green"};
		List<String> list=Arrays.asList(arr);
		int index=list.lastIndexOf("durant");
		System.out.println(index);
	}
	
	public static void demo_2() {
		/*
		 * 如果数组中的元素是引用数据类型，那么在转成集合后，该集合中存储的元素是数组的元素。
		 * 
		 * 如果数组中的元素是基本数据类型，name在转成集合后，该集合中以数组为元素存储在该集合中。
		 * 
		 */
		
		int[] arr= {30,35,23};
		
		List<int[]> list=Arrays.asList(arr);
		
		System.out.println(list);
	}

}
