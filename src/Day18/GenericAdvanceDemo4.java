package Day18;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

import javax.print.attribute.standard.MediaSize.Other;
import javax.xml.transform.Templates;

import java.util.Comparator;
import java.util.Iterator;

import Day17.Person;

/**
 * һ���ڴ洢Ԫ��ʱ ʹ�����ޣ���Ϊ����ȡ�����ݶ��ǰ���������������ģ�������ְ�ȫ���⡣
 *
 */


/**
 * ��������ȡ��Ԫ��ʱ�������ޡ�
 *  ������ �ڴ�Ԫ��ʱʹ������ ? extend Person���ü��Ͽ��Դ�Person ��Student��Worker��
 *  ����ȡ���ü��ϵ�Ԫ��ʱ������ʱʹ�����ޣ�? super Student,����������ܸ�������ݣ�����Ƚ�����
 *  ����Person�༯�� �洢����Student������ݣ� �õ�����Person�ıȽ������Ǿ��õ�����Person��������Student�����ݡ�
 */
public class GenericAdvanceDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(new Person("abc", 30));
		al.add(new Person("efg", 33));

		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(new Student("stu1", 29));
		al2.add(new Student("stu7", 20));
		al2.add(new Student("stu2", 30));
		

		ArrayList<Worker> al3 = new ArrayList<Worker>();
		al3.add(new Worker("durant", 30));
		al3.add(new Worker("curry", 33));

		ArrayList<String> al4 = new ArrayList<String>();

		al4.add("abcdefg");
		// al.addAll(al4); �������Ͳ�ƥ��
		al.add(new Person("sunxu", 27));
		// al.addAll(al2);

		System.out.println(al.size());

		printCollection(al4);
	}
	
	public static void printCollection(Collection<?> al) {
		Iterator<?> iterator= al.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}


	
}
