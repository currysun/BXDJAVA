package Day16;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection coll=new ArrayList();
		Collection col2=new ArrayList();
		show(coll, col2);
	}
	public static void show(Collection coll,Collection col2) {
		//1.���Ԫ��add
		coll.add("curry 30");
		coll.add(100);
		coll.add(true);
		col2.add(false);
		col2.add(100);
		coll.addAll(col2);
		System.out.println("c1: "+coll);
		System.out.println("c2: "+col2);
		
		/*
		 * 2.ɾ��Ԫ��remove,removeAll ������������ͬ��Ԫ��һ��ɾ������Ԫ��100 ��ʾ
		 * 	retainAll����ָ����������ͬԪ�أ�ɾ���䲻ͬԪ��
		 */
		
		//coll.remove("curry 30");
		//coll.removeAll(col2);
		coll.retainAll(col2);
		
		//3.���Ԫ��clear
		//coll.clear();
		
		
		//4.�ж�Ԫ��
		boolean result=coll.contains(100);
		
		//5.��ȡԪ��
		int num=coll.size();
		
		System.out.println(coll);
		System.out.println(result);
		System.out.println(num);
		
	}

}
