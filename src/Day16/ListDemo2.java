package Day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");

		/*
		 * Iterator it=list.iterator(); while(it.hasNext()) { Object
		 * obj=it.next();	//java.util.ConcurrentModificationException
						 * //在迭代器过程中，不要使用集合操作元素，否则会产生并发异常。迭代中不集合，集合中不迭代。 
						 * //可以使用Iterator的子接口，ListIterator来完成迭代中对元素进行更多操作。
		 *  if(obj.equals("abc2")) 
			 *  { 
			 *  	list.add("abc8");
			 * 	} 
			 * 	else 
			 * 	{ 
			 * 		System.out.println("next: "+obj); 
			 * 	} 
		 * } System.out.println(list);
		 */

		ListIterator it = list.listIterator();
		while (it.hasNext()) 
		{
			Object obj=it.next();
			if(obj.equals("abc2")) {
				it.add("abc9");
			}
			else 
				  	{ 
						System.out.println("next: "+obj); 
				  	} 
			 
		} 
		System.out.println(list);
		
		while (it.hasPrevious()) 
		{
			Object obj=it.previous();
			if(obj.equals("abc2")) {
				it.add("abc9");
			}
			else 
				  	{ 
						System.out.println("previous: "+obj); 
				  	} 
			 
		} 
		System.out.println(list);
	}

}
