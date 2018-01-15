package cn.itcast.p1.map.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;



/**
 *有序指的是存入集合是什么顺序，取出该集合也应该是什么顺序。比如下面 7，3，1，5存入集合hm，那取出该集合也是7，3，1，5
 *TreeSet 特点按照指定顺序取出来 和 存入顺序是不一致的，所以这称之为 无序。
 */
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new LinkedHashMap<Integer,String>();
		hm.put(7, "zhouqi");
		hm.put( 3 , "zhangsan");
		hm.put(1, "qianyi");
		hm.put(5, "wangwu");
		
		Iterator<Map.Entry<Integer, String>> it=hm.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<Integer, String> me=it.next();
			Integer key=me.getKey();
			String  value=me.getValue();
			System.out.println(key+":"+value);
		}
	}

}
