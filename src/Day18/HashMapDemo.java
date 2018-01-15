package Day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 将学生对象和学生的归属地 通过键与值存储到map集合中。
		 * 
		 */
		
		HashMap<Student, String> hm=new HashMap<Student,String>();
		hm.put(new Student("curry",30), "美国");	
		hm.put(new Student("zaza",35), "格鲁吉亚");
		hm.put(new Student("Messi",30), "阿根廷");
		hm.put(new Student("Ronaldo",30), "葡萄牙");
		hm.put(new Student("Yao",40), "中国");
		hm.put(new Student("Yao",40), "上海");
		
		Set<Student> keySet=hm.keySet();
		
		Iterator<Student>  it=keySet.iterator();
		
		while(it.hasNext()) {
			Student key=it.next();
			String value=hm.get(key);
			System.out.println(key.getName()+":"+key.getAge()+"---"+value);
		}
		
		HashMap<String, String> h=new HashMap<String,String>();
		h.put("MVP", "curry");
		h.put("MVP", "durant");
		System.out.println(h.get("MVP"));
		
	}

}
