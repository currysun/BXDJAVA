package cn.itcast.p1.otherapi.system;

import java.io.IOException;

public class RuntimeDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * Runtime:没有构造方法，说明该类不能创建对象。
		 * 又发现还有非静态的方法。说明该类提供静态的返回该类对象的方法。
		 * 而且只有一个，说明Runtime类使用单例设计模式。
		 */
		Runtime r=Runtime.getRuntime();
		r.exec("notepad.exe");
		
	}

}
