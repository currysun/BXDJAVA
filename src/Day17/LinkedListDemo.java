package Day17;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList link=new LinkedList();
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
		
		System.out.println(link);
		System.out.println(link.getFirst()); //��ȡ��һ��Ԫ�ز�ɾ��
		System.out.println(link.removeFirst());//��ȡ��һ��Ԫ�ز���ɾ��
		System.out.println(link);
		
		while(!link.isEmpty()) {
			System.out.println(link.removeFirst());
		}
		/*Iterator it=link.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		abc4
		abc3
		abc2
		abc1
		*/
	}
	
}