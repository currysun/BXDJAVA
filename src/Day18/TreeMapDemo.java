package Day18;


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import Day17.ComparatorByName;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Student, String> tm=new TreeMap<Student,String>(new ComparatorByName());
		tm.put(new Student("Curry",30), "美国");	
		tm.put(new Student("Zaza",35), "格鲁吉亚");
		tm.put(new Student("Messi",29), "阿根廷");
		tm.put(new Student("Ronaldo",33), "葡萄牙");
		tm.put(new Student("Yao",40), "中国");
		//tm.put(new Student("Yao",40), "上海");
		
				
		Iterator<Map.Entry<Student, String>>  it=tm.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<Student, String> me=it.next();
			Student key=me.getKey();
			String value=me.getValue();
			
			System.out.println(key.getName()+":"+key.getAge()+"---"+value);
		}
	}

	
}
