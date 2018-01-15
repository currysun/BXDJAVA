package Day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> aL=new ArrayList<Person>();
		aL.add(new Person("curry",30)); //add()方法接收的是Object 类型对象，接收Person后，aL该集合存储的是Object对象。
		aL.add(new Person("thompson",25));
		aL.add(new Person("durant",30));
		aL.add(new Person("green",27));
		
		Collections.sort(aL);
		Iterator<Person> it=aL.iterator();
		while(it.hasNext()) 
		{
			//集合存自定义对象需要强转。
			//不要使用（Person）it.next（） 同时操作 System.out.println(((Person)it.next()).getName()+"::"+((Person) it.next()).getAge());
			Person p= it.next();
			System.out.println(p.getName()+"::"+p.getAge());
		}
	}

}
