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
		
		//使用了Collection中的Iterator()方法。调用集合中的迭代器方法，是为了获取接种的迭代器对象。
		//Iterator it=coll.iterator();
/*		while(it.hasNext()) {
		System.out.println(it.next());
		}*/
		
		//for循环结束后 临时变量iterator 就会从内存中消失，老外喜欢用这种写法节约内存。
		for (Iterator iterator = coll.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
			
		}
		
	}

}
