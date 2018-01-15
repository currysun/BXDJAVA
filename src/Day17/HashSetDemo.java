package Day17;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// set特点无序，不重复。
			
		HashSet hs=new HashSet();
		hs.add("haha");
		hs.add("hehehe");
		hs.add("xixi");
		hs.add("heiheiehei");
		hs.add("haha");
		Iterator it=hs.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
	}

}
