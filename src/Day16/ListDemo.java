package Day16;

import java.util.List;
import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList<>();
		show(list);
		
	}

	public static void show(List list) {
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		// 1.���
		//list.add(1,"abc9");
		
		//2.ɾ��Ԫ�� ���ص��Ǳ�ɾ��Ԫ�أ�����ɾ���ýǱ�Ԫ��
/*		System.out.println("remove: "+list.remove(2));
		System.out.println(list);*/
		
		//3.�޸�Ԫ�� ���صĽǱ�Ԫ�أ������޸ĳ�ָ��Ԫ��
		//System.out.println("set: "+list.set(1, "abc8"));
	
		
		//4.��ȡԪ��
		System.out.println("get: "+list.get(0));
		System.out.println(list);
		
		//5.��ȡ���б�
		System.out.println("sublist: "+list.subList(1, 3));
	}
	

}
