package cn.itcast.p2.toolclass.collections.demo;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsDemo {
	
	public static void main(String[] args) {
		
		/*
		 * Collections 是集合框架的工具类。
		 * 里的方法都是静态的。
		 * 比较对象的无非两种方法，一是用Comparable，而是用Comparator。
		 * 
		 */
		demo_1();
		
	}
	
	public static void demo_1() {
		
		List<String> list=new ArrayList<String>();
		
		list.add("abcde");
		list.add("cba");
		list.add("aa");
		list.add("zzz");
		list.add("cba");
		list.add("nbaa");
		
		
		//对list集合进行制定顺序的排序。
		
		Iterator<String> it=list.iterator();
		Collections.sort(list);
		System.out.println(list);
		mySort(list);
		System.out.println(list);
	}
	
	public static <T extends Comparable<? super T>> void mySort(List<T> list) {
	
		for (int i = 0; i < list.size()-1; i++) {
			
			for (int j = 0; j < list.size()-1-i; i++) {
				
				if(list.get(j).compareTo(list.get(j+1))>0) {
					/*T temp=list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);*/
					Collections.swap(list, j, j+1);
				}
			}
		}
	}
}
