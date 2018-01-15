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
		// 1.添加
		//list.add(1,"abc9");
		
		//2.删除元素 返回的是被删除元素，并且删除该角标元素
/*		System.out.println("remove: "+list.remove(2));
		System.out.println(list);*/
		
		//3.修改元素 返回的角标元素，并且修改成指定元素
		//System.out.println("set: "+list.set(1, "abc8"));
	
		
		//4.获取元素
		System.out.println("get: "+list.get(0));
		System.out.println(list);
		
		//5.获取子列表
		System.out.println("sublist: "+list.subList(1, 3));
	}
	

}
