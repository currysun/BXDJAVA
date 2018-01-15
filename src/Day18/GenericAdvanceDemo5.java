package Day18;

import java.lang.reflect.Array;
import java.util.TreeSet;

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
public class GenericAdvanceDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> al = new TreeSet<Person>(new CompareByName());
		al.add(new Person("abc", 30));
		al.add(new Person("efg", 33));

		TreeSet<Student> al2 = new TreeSet<Student>(new CompareByStuName());
		al2.add(new Student("stu1", 29));
		al2.add(new Student("stu7", 20));
		al2.add(new Student("stu2", 30));
		

		TreeSet<Worker> al3 = new TreeSet<Worker>();
		al3.add(new Worker("durant", 30));
		al3.add(new Worker("curry", 33));

		TreeSet<String> al4 = new TreeSet<String>();

		al4.add("abcdefg");
		// al.addAll(al4); �������Ͳ�ƥ��
		al.add(new Person("sunxu", 27));
		// al.addAll(al2);

		System.out.println(al.size());

		Iterator<Student> it = al2.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

static class CompareByName implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		int temp=o1.getName().compareTo(o2.getName());
		return temp==0?o1.getAge()-o2.getAge():temp;
		}

	}
}

class CompareByStuName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int temp=o1.getName().compareTo(o2.getName());
		return temp==0?o1.getAge()-o2.getAge():temp;
	}
	
	
}
