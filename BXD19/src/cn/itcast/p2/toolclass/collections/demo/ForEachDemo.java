package cn.itcast.p2.toolclass.collections.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Foreach ��ǿ��forֻ�ܱ��� �������ϻ����顣���ܱ���map������ת�ɵ�����set�Ϳ��Ա����ˡ�
		 * ��ʽ��for(���� ���� : Collection����)
		 * ����д��
		 * 
		 * ��ͳfor �� ��ǿfor ������
		 * 
		 * ��ͳfor ������ɶ����ִ�кܶ�Σ����Զ������ѭ���Ĵ�����������
		 * 
		 * ��ǿfor ��һ�ּ���ʽ���������б�������Ŀ�ꡣ��Ŀ��Ҫô������ Ҫô��Collection��
		 * 
		 * ��������ı�������������ǻ�ȡ�����е�Ԫ�أ�����ʹ�ø߼�for��
		 * ���Ҫ��������ĽǱ���в�������ʹ�ô�ͳfor��
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
