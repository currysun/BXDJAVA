package cn.itcast.p1.map.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;



/**
 *����ָ���Ǵ��뼯����ʲô˳��ȡ���ü���ҲӦ����ʲô˳�򡣱������� 7��3��1��5���뼯��hm����ȡ���ü���Ҳ��7��3��1��5
 *TreeSet �ص㰴��ָ��˳��ȡ���� �� ����˳���ǲ�һ�µģ��������֮Ϊ ����
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
