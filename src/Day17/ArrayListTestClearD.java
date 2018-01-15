package Day17;

/*
 * Çå³ýArrayList ÖØ¸´ÔªËØ
 */
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListTestClearD {

	public static void main(String[] args) {
		//SingleDemo();
		ArrayList al=new ArrayList();
		al.add(new Person("curry",30));
		al.add(new Person("green",27));
		al.add(new Person("curry",30));
		al.add(new Person("green",27));
		al.add(new Person("durant",30));
		al.add(new Person("thomphson",27));
		al.add(new Person("igordalia",33));
		System.out.println(al);
		al=removeDuplicateElement(al);
		
	}

	/**
	 * 
	 */
	private static void SingleDemo() {
		ArrayList al=new ArrayList();
		al.add("curry");
		al.add("durant");
		al.add("green");
		al.add("curry");
		al.add("green");
		al.add("curry");
		
		System.out.println(al);
		al=removeDuplicateElement(al);
		System.out.println(al);
	}
	
	public static ArrayList removeDuplicateElement(ArrayList al) {
		ArrayList temp=new ArrayList();
		
		Iterator it=al.iterator();
		
		while(it.hasNext()) {
			Object object=it.next();
			if(!temp.contains(object))
			{
				temp.add(object);
			}
		}
			
		return temp;
		
	
	}
}
