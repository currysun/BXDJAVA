package Day18;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import Day17.Person;


/**
 * һ���ڴ洢Ԫ��ʱ ʹ�����ޣ���Ϊ����ȡ�����ݶ��ǰ���������������ģ�������ְ�ȫ���⡣
 *
 */
public class GenericAdvanceDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(new Person("abc", 30));
		al.add(new Person("efg", 33));

		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(new Student("stu1", 29));
		al2.add(new Student("stu2", 30));

		ArrayList<Worker> al3 = new ArrayList<Worker>();
		al3.add(new Worker("durant", 30));
		al3.add(new Worker("curry", 33));
		
		ArrayList<String> al4=new ArrayList<String>();
		
		al4.add("abcdefg");
		//al.addAll(al4); �������Ͳ�ƥ��
		
		al.addAll(al2);
		
		System.out.println(al.size());
	}

	
	
	
	class MyCollection<E> {
		public void add(E e) {

		}

		public void addAll(MyCollection<? extends E> e) {

		}
	}

}
