package Day17;

import java.util.ArrayList;
import java.util.List;

/*
 * ʹ��LinkedList ��ģ��һ����ջ���߶��е����ݽṹ
 * 
 * ��ջ���Ƚ���� First in Last Out  FILO
 * 
 * ���У��Ƚ��ȳ�
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
