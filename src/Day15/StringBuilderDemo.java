package Day15;

public class StringBuilderDemo {

	public static void main(String[] args) {
		int[] arg= {5,4,3,2,1};
		String txt=intToStringOld(arg);
		String txt1=intToString(arg);
		System.out.println(txt);
		System.out.println(txt1);
	}

	public static String intToStringOld(int[] args) {
		String text="";
		for (int i = 0; i < args.length; i++) {
			text=text+args[i];
		}		
	 return text;
	}
	
	public static String intToString(int[] args) {
		StringBuilder text=new StringBuilder();
		for (int i = 0; i < args.length; i++) {
			text.append(args[i]) ;
		}		
	 return text.toString();
	}

}
