package Day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection coll=new ArrayList();
		
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		
		//ʹ����Collection�е�Iterator()���������ü����еĵ�������������Ϊ�˻�ȡ���ֵĵ���������
		//Iterator it=coll.iterator();
/*		while(it.hasNext()) {
		System.out.println(it.next());
		}*/
		
		//forѭ�������� ��ʱ����iterator �ͻ���ڴ�����ʧ������ϲ��������д����Լ�ڴ档
		for (Iterator iterator = coll.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
			
		}
		
	}

}
