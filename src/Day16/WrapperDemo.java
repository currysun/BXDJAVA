package Day16;

public class WrapperDemo {

	public static void main(String[] args) {
		/*
		 * 
		 * 基本数据类型包装类
		 * 为了方便操作基本数据类型值，将其包装成对象，在对象中定义了属性和行为丰富了该数据的操作。
		 * 用于描述该对象的类就称为基本数据类型对象包装类。
		 * byte		Byte
		 * short	Short
		 * int		Integer 提供了些方法能在 int 和String 类型之间互相转换。
		 * long		Long
		 * float	Float
		 * double	Double
		 * char		Character
		 * boolean	Boolean
		 * 
		 * 该包装主要用于基本数据类型与字符串类型之间的转换。
		 * 
		 * 基本类型--->字符串
		 * 		1.基本类型+""
		 * 		2.String类中的静态方法valueOf(基本数据类型)
		 * 
		 * 字符串--->基本数据类型
		 * 		1.使用包装类的静态方法parse基本类名("xxx类型的字符串")，比如
		 * 			Integer.parseInt("12345")
		 * 			Boolean.parseBoolean("true")
		 * 			只有char没有parse方法.
		 * 		2.如果字符串被Integer对象封装，使用intValue()方法来进行转换。
		 * 
		 * 		其他进制--->十进制串
		 * 		parseInt(其他进制的数值,该进制基数)
		 * 
		 * 		十进制--->其他进制
		 * 		toBinaryString
		 * 		toHexString
		 *		
		 *		Integer封装成对象后比较用compareTo
		 *
		 *		JDK1.5新特性
		 *		Integer kk=new Integer(44);
		 *		Integer kk=44; 自动装箱
		 */
		
		System.out.println(Integer.MAX_VALUE);
		
		//创建int 类型的对象
		
		int num=12;
		Integer i=new Integer(num);
		Integer kk=44;
		
		System.out.println(Integer.parseInt("123")+1);
		
		Integer j=new Integer("100");
		// 对象不能操作静态方法 Integer.parseInt(j);
		j.intValue();
		System.out.println(j.intValue());
		System.out.println("二进制 "+Integer.toBinaryString(num));
		System.out.println("16进制 "+Integer.toHexString(num));
		System.out.println(Integer.parseInt("110", 2));
	}

}
