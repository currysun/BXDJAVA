package Day15;

/*
 * 01-常用对象API(String类-特点)
 * 02-常用对象API(String类-构造函数)
 */

public class StingConstructorDemo {

	public static void main(String[] args) {
			
		String s="abc"; // “abc”是一个存在字符串常量池中的一个对象。
		String s1=new String("abc"); // 这个字符串 创建在字符串常量池中 并且也创建在堆内存中。一共创建了2个对象。
		
		//常用的String 构造方法
		byte[] b= {97,68,69,70};
		String s2=new String(b); //把字节数组 转换为字符串。
		String s3=new String(b,1,2); //把字节数组的指定的部分 转换为字符串。
		System.out.println(s2);
		System.out.println(s3);
		
		char[] array= {'a','b','c','d','e'};
		String a=new String(array, 2, 3);//把字符数组的指定的部分 转换为字符串。
		System.out.println(a);
		
	}

}
