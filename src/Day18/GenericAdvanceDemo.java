package Day18;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericAdvanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("curry");
		al.add("durant");
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(30);
		al2.add(35);
		
		printCollection(al);
		printCollection(al2);
	}

	private static void printCollection(ArrayList<?> al) {
		Iterator<?> it=al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

}
