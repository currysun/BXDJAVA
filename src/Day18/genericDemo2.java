package Day18;

import java.util.Iterator;
import java.util.TreeSet;

import Day17.Person;

public class genericDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> ts=new TreeSet<Person>();
		ts.add(new Person("curry",29));
		ts.add(new Person("thomphson",27));
		ts.add(new Person("green",28));
		
		Iterator<Person> it=ts.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
