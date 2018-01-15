package Day18;

import java.util.ArrayList;
import java.util.Iterator;

import Day17.Person;

/**
 * ���Ϳ��Զ����� �����޶�
 * ? extends E : ����E �������� E�� ��������
 * ? super   E:  ����E ��ĸ���� E�� ��������
 */
public class GenericAdvanceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Worker> al=new ArrayList<Worker>();
		al.add(new Worker("abc",30));
		al.add(new Worker("efg",33));
		
		ArrayList<Student> al2=new ArrayList<Student>();
		al2.add(new Student("curry",29));
		al2.add(new Student("durant",30));
	
		
		printCollection(al);
		printCollection(al2);
		printCollection1(al2);
	}

	
	//���͵��޶�-�߼�Ӧ�á�ֻ����һ���������ܴ�������
	private static void printCollection(ArrayList<? extends Person> al) {
		Iterator<? extends Person> it=al.iterator();
		
		while(it.hasNext()) {
			Person p= it.next();
			System.out.println(p.getName()+":"+p.getAge());
			//System.out.println(it.next().toString());
		}
	}

	private static void printCollection1(ArrayList<? super Student> al) {
		Iterator<? super Student> it=al.iterator();
		
		while(it.hasNext()) {
		System.out.println(it.next().toString());
		}
	}
}
