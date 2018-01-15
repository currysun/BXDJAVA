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
		 * Map 在有映射关系时，可以优先考虑。
		 * 
		 * 在查表法中的应用较为多见
		 * 
		 */

		String week =getWeek(0);
		System.out.println(week);
		
	}

	public static String getWeekByMap(String week) {
		Map<String, String> map= new HashMap<String,String>();
		
		map.put("星期一", "Monday");
		map.put("星期二", "Tuesday");
		map.put("星期三", "Wednesday");
		map.put("星期四", "Thursday");
		map.put("星期五", "Friday");
		map.put("星期日", "Sunday");
		map.put("星期天", "Sunday");
		//map.put("基础班", 集合List或者set Student);
		
		return map.get(week);
	}
	
	
	
	private static String getWeek(int i) {
		if(i<1 || i>7) {
			throw new RuntimeException("输入的星期数有误！");
		}
		String[] weeks = {"","星期一","星期二","星期三"};
		
		return weeks[i];
	}

}	
