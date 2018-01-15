package cn.itcast.p2.toolclass.collections.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 集合转成数组？
		 * 
		 * 使用Collection接口中的toArray()方法。
		 * 
		 * 集合转成数组：可以对集合中的元素操作的方法进行限定。不允许对其进行增删。
		 * 
		 */
		
		List<String> list=new ArrayList<>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");

		String[] arr=list.toArray(new String[1]); // 当定义的长度小于集合的size，那么该方法会创建一个同类型并和集合相同size的数组。
		String[] arr2=list.toArray(new String[list.size()]);// 所以最好长度指定为集合的size。
		String[] arr5=list.toArray(new String[5]);// 当定义的长度大于集合的size，那么该方法会使用指定的数组存储集合中的元素，多余的位置默认为null。
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr5));
	}

}
