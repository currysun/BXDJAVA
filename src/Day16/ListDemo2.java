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
						 * //�ڵ����������У���Ҫʹ�ü��ϲ���Ԫ�أ��������������쳣�������в����ϣ������в������� 
						 * //����ʹ��Iterator���ӽӿڣ�ListIterator����ɵ����ж�Ԫ�ؽ��и��������
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
