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
 * 一般在存储元素时 使用上限，因为这样取出数据都是按照上限类型运算的，不会出现安全问题。
 *
 */


/**
 * 在容器中取出元素时，用下限。
 *  想象下 在存元素时使用上限 ? extend Person，该集合可以存Person ，Student，Worker。
 *  而在取出该集合的元素时并操作时使用下限，? super Student,可以让其接受更多的数据，比如比较器。
 *  比如Person类集合 存储的是Student类的数据， 用到的是Person的比较器，那就用到的是Person类来接受Student的数据。
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
		// al.addAll(al4); 错误类型不匹配
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
