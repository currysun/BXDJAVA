package cn.itcast.p2.toolclass.collections.demo;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �ص㣺 List asList ������ת���ɼ���
		 * 
		 * �ô�������ʹ�ü��ϵķ������������е�Ԫ�ء�
		 * ע�⣺����ĳ����ǹ̶��ģ����϶����������ɾ�����ǲ���ʹ�õá�
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
		 * ��������е�Ԫ���������������ͣ���ô��ת�ɼ��Ϻ󣬸ü����д洢��Ԫ���������Ԫ�ء�
		 * 
		 * ��������е�Ԫ���ǻ����������ͣ�name��ת�ɼ��Ϻ󣬸ü�����������ΪԪ�ش洢�ڸü����С�
		 * 
		 */
		
		int[] arr= {30,35,23};
		
		List<int[]> list=Arrays.asList(arr);
		
		System.out.println(list);
	}

}
