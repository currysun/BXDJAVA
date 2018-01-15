package cn.itcast.p2.toolclass.collections.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Foreach 加强型for只能遍历 单例集合或数组。不能遍历map，但是转成单例的set就可以遍历了。
		 * 格式：for(类型 变量 : Collection集合)
		 * 简化书写。
		 * 
		 * 传统for 和 增强for 的区别？
		 * 
		 * 传统for 可以完成对语句执行很多次，可以定义控制循环的次数和条件。
		 * 
		 * 增强for 是一种简化形式，它必须有被遍历的目标。该目标要么是数组 要么是Collection。
		 * 
		 * 对于数组的遍历，如果仅仅是获取数组中的元素，可以使用高级for。
		 * 如果要对于数组的角标进行操作建议使用传统for。
		 */
		
		List<String> list =new ArrayList<String>();
		list.add("curry");
		list.add("curry1");
		list.add("curry2");
		
		Map<Integer, String> map=new HashMap<Integer,String>();
		map.put(30, "curry");
		map.put(35, "durant");
		map.put(23, "green");
		map.put(11, "thomphson");
		
		for(Integer key: map.keySet()) {
			String value=map.get(key);
			System.out.println(key+": :"+value);
		}
		
		for(String s :list) {
			System.out.println(s);
		}
	}

}
