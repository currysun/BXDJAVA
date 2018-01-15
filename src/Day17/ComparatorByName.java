package Day17;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorByName implements Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Person p1=(Person)o1;
		Person p2=(Person)o2;
		
		int temp=p1.getName().compareTo(p2.getName());
		return temp==0?p1.getAge()-p2.getAge():temp;
	}

}
