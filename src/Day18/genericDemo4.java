package Day18;

import java.awt.datatransfer.StringSelection;

public class genericDemo4 {
	
	public static void main(String[] args) {
		Tool<String> tool=new Tool<String>();
		tool.show("curry");
		//tool.show(new Integer(4));
		tool.print("hahaha");
		
		Tool.method("abc");
		}
	
	
}
