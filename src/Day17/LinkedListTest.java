package Day17;

import java.util.ArrayList;
import java.util.List;

/*
 * 使用LinkedList 来模拟一个堆栈或者队列的数据结构
 * 
 * 堆栈：先进后出 First in Last Out  FILO
 * 
 * 队列：先进先出
 */
public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuiLieUtil dl=new DuiLieUtil();
		dl.addFirst("abc1");
		dl.addFirst("abc2");
		dl.addFirst("abc3");
		
		while(!dl.isNull()) 
		{
			System.out.println(dl.get());
		}
	}

}
