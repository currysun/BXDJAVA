package cn.itcast.p1.otherapi.system;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {
	
	private static final String LINE_SEPARATOR=System.getProperty("line.separator");
	
	public static void main(String[] args) {
		/*
		 * System类不能实例化，它的方法都是静态的.
		 * 
		 * 
		 *常见方法：
		 *1.currentTimeMillis()
		 */
			
		
/*		long l1=1513151756192l;
		System.out.println(l1/1000/60/60/24);//1513151712363
		//code..
		long runtime;
		long l2=System.currentTimeMillis();
		System.out.println(runtime=l2-l1);*/
		
		//Winodows 换行只认\r\n, Linux 换行只认\n。跨平台性，先获取本地平台的信息。
		System.out.println("hello-\r\n world");
		System.out.println("hello-"+LINE_SEPARATOR+" curry");
		
		//给系统设置系统信息。
		System.setProperty("myclasspath", "c:\\path");
		//demo_1();
	}

	public static void demo_1() {
		// TODO Auto-generated method stub
		
		Properties prop= System.getProperties();
		
		Set<String> nameSet=prop.stringPropertyNames();
		

		
		for(String name :nameSet) {
			String value=prop.getProperty(name);
			System.out.println(name+": "+value);
			
		}
		
		
		
	}

}
