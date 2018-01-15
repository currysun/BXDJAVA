package Day17;

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class DuiLieUtil {

	private LinkedList link;
	
	public DuiLieUtil() {
		link=new LinkedList();
	}
	
	public void addFirst(Object obj) {
		link.addLast(obj);
	}
	
	public Object get() {
		return link.removeFirst();
	}
	
	public boolean isNull() {
		return link.isEmpty();
	}
	
	
	

}
