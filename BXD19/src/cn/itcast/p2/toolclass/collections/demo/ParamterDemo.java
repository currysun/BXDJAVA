package cn.itcast.p2.toolclass.collections.demo;

import java.util.Arrays;

public class ParamterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum= newAdd(10,5,2,9);
	}

	/*
	 * �����Ŀɱ��������ʵ����һ�����飬���ǽ��ܵ��������Ԫ�ء�
	 * �Զ�����ЩԪ�ط�װ�����顣���˵����ߵ���д��
	 * 
	 * ע������ɱ�������ͱ��붨�����βεĽ�β
	 */
	public static int newAdd(int a,int... arr) {
		System.out.println(Arrays.toString(arr));
		return 0;
	}
	
	

}
