package Day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		List<Person> aL=new ArrayList<Person>();
		aL.add(new Person("curry",30)); //add()�������յ���Object ���Ͷ��󣬽���Person��aL�ü��ϴ洢����Object����
		aL.add(new Person("thompson",25));
		aL.add(new Person("durant",30));
		aL.add(new Person("green",27));
		
		Class<?> clazz1=Person.class;
		Class<?> clazz2=Class.forName("Day17.Person");
		Person person=new Person();
		Class<?> clazz3=person.getClass();
		
		Collections.sort(aL);
		Iterator<Person> it=aL.iterator();
		while(it.hasNext()) 
		{
			//���ϴ��Զ��������Ҫǿת��
			//��Ҫʹ�ã�Person��it.next���� ͬʱ���� System.out.println(((Person)it.next()).getName()+"::"+((Person) it.next()).getAge());
			Person p= it.next();
			System.out.println(p.getName()+"::"+p.getAge());
		}
	}

}
