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
		//1.添加元素add
		coll.add("curry 30");
		coll.add(100);
		coll.add(true);
		col2.add(false);
		col2.add(100);
		coll.addAll(col2);
		System.out.println("c1: "+coll);
		System.out.println("c2: "+col2);
		
		/*
		 * 2.删除元素remove,removeAll 两个集合中相同的元素一并删除，如元素100 所示
		 * 	retainAll保留指定集合中相同元素，删除其不同元素
		 */
		
		//coll.remove("curry 30");
		//coll.removeAll(col2);
		coll.retainAll(col2);
		
		//3.清楚元素clear
		//coll.clear();
		
		
		//4.判断元素
		boolean result=coll.contains(100);
		
		//5.获取元素
		int num=coll.size();
		
		System.out.println(coll);
		System.out.println(result);
		System.out.println(num);
		
	}

}
