package cn.itcast.p2.toolclass.collections.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ����ת�����飿
		 * 
		 * ʹ��Collection�ӿ��е�toArray()������
		 * 
		 * ����ת�����飺���ԶԼ����е�Ԫ�ز����ķ��������޶�����������������ɾ��
		 * 
		 */
		
		List<String> list=new ArrayList<>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");

		String[] arr=list.toArray(new String[1]); // ������ĳ���С�ڼ��ϵ�size����ô�÷����ᴴ��һ��ͬ���Ͳ��ͼ�����ͬsize�����顣
		String[] arr2=list.toArray(new String[list.size()]);// ������ó���ָ��Ϊ���ϵ�size��
		String[] arr5=list.toArray(new String[5]);// ������ĳ��ȴ��ڼ��ϵ�size����ô�÷�����ʹ��ָ��������洢�����е�Ԫ�أ������λ��Ĭ��Ϊnull��
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr5));
	}

}
