package Day15;

public class StringObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("abc");
		String s2=s1.intern();
		System.out.println(s2);
		//intern();
	}

}
