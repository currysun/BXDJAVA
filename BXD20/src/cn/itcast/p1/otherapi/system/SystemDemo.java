package cn.itcast.p1.otherapi.system;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {
	
	private static final String LINE_SEPARATOR=System.getProperty("line.separator");
	
	public static void main(String[] args) {
		/*
		 * System�಻��ʵ���������ķ������Ǿ�̬��.
		 * 
		 * 
		 *����������
		 *1.currentTimeMillis()
		 */
			
		
/*		long l1=1513151756192l;
		System.out.println(l1/1000/60/60/24);//1513151712363
		//code..
		long runtime;
		long l2=System.currentTimeMillis();
		System.out.println(runtime=l2-l1);*/
		
		//Winodows ����ֻ��\r\n, Linux ����ֻ��\n����ƽ̨�ԣ��Ȼ�ȡ����ƽ̨����Ϣ��
		System.out.println("hello-\r\n world");
		System.out.println("hello-"+LINE_SEPARATOR+" curry");
		
		//��ϵͳ����ϵͳ��Ϣ��
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
