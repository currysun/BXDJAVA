package Day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ��ѧ�������ѧ���Ĺ����� ͨ������ֵ�洢��map�����С�
		 * 
		 */
		
		HashMap<Student, String> hm=new HashMap<Student,String>();
		hm.put(new Student("curry",30), "����");	
		hm.put(new Student("zaza",35), "��³����");
		hm.put(new Student("Messi",30), "����͢");
		hm.put(new Student("Ronaldo",30), "������");
		hm.put(new Student("Yao",40), "�й�");
		hm.put(new Student("Yao",40), "�Ϻ�");
		
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
