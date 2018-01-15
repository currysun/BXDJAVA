package cn.itcast.p1.map.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 *
 */
public class MapTest {

	public static void main(String[] args) {
		/*
		 * Map ����ӳ���ϵʱ���������ȿ��ǡ�
		 * 
		 * �ڲ���е�Ӧ�ý�Ϊ���
		 * 
		 */

		String week =getWeek(0);
		System.out.println(week);
		
	}

	public static String getWeekByMap(String week) {
		Map<String, String> map= new HashMap<String,String>();
		
		map.put("����һ", "Monday");
		map.put("���ڶ�", "Tuesday");
		map.put("������", "Wednesday");
		map.put("������", "Thursday");
		map.put("������", "Friday");
		map.put("������", "Sunday");
		map.put("������", "Sunday");
		//map.put("������", ����List����set Student);
		
		return map.get(week);
	}
	
	
	
	private static String getWeek(int i) {
		if(i<1 || i>7) {
			throw new RuntimeException("���������������");
		}
		String[] weeks = {"","����һ","���ڶ�","������"};
		
		return weeks[i];
	}

}	
