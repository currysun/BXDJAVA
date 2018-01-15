package Day17;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add("curry1");
		ts.add("curry2");
		ts.add("curry3");
		ts.add("curry4");
		ts.add("curry4");
		System.out.println(ts);
		
		TreeSet ts2=new TreeSet(new ComparatorByName());
		ts2.add(new Person("curry",30));
		ts2.add(new Person("green",27));
		ts2.add(new Person("durant",30));
		ts2.add(new Person("thomphson",27));
		
		System.out.println(ts2);
		
		TreeSet ts3=new TreeSet();
		ts3.add(new Person("curry",30));
		ts3.add(new Person("green",27));
		ts3.add(new Person("durant",30));
		ts3.add(new Person("thomphson",27));
		ts3.add(new Person("curry",30));
		
		System.out.println(ts3);
	}

}
