package Day16;
		/*
		JDK1.5新特性
		*		Integer kk=new Integer(44);
		*		Integer kk=44; 自动装箱
		*		kk=kk+5; 自动拆箱 (java 内部做了处理 int kk=kk.intValue())
		*/
public class WrapperDemo2 {

	public static void main(String[] args) {
	Integer a=new Integer(127);
	Integer b=new Integer(127);
	
	System.out.println(a==b);
	System.out.println(a.equals(b));
	
	Integer x=127; //自动装箱如果是一个字节（8位，2的8次方）以内，则不会开辟新的空间，所以-128~127属于同一片内存空间，==比较的结果是true
	Integer y=127;
	
	System.out.println(x==y);
	System.out.println(x.equals(y));
	x=x+1; //自动拆箱 int x=x.intValue()
	int cc=x.intValue();

	}

}
