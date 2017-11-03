package Day15;

import java.util.Arrays;

public class StringMethodDemo {

	public static void main(String[] args) {
		/*
		 * 
		 * 按照面向对象的思想对String类的方法分类：
		 * “abcd”
		 * 
		 * 
		 * 1.获取
		 * 	1.1 获取字符串的长度 
		 * 	返回类型 ，传参（根据什么）
		 * 	int		无
		 * 	length()
		 * 		
		 * 	1.2根据位置获取字符 
		 * 	char    int
		 * 	charAt(int index)	
		 * 
		 * 	1.3根据字符获取字符串第一次出现的位置
		 * 	int      char(String)
		 * 
		 *  indexOf(int ch)
		 *  indexOf(int ch,int fromIndex) 顺序开始从指定位置进行ch的查找出现位置
		 *	indexOf(String s)
		 *  indexOf(String s,int fromIndex) 顺序开始从指定位置进行ch的查找第一次出现位置 		
		 * 	
		 *  lastindexOf(int ch)	
		 *  lastindexOf(int ch,int fromIndex) 倒序开始从指定位置进行ch的查找出现位置
		 *	lastindexOf(String s)
		 *  lastindexOf(String s,int fromIndex) 倒序开始从指定位置进行ch的查找出现的位置 		
		 *  
		 *  1.4 获取字符串中的一部分字符串。也叫子串
		 *  subString(beginIndex,endIndex) 包头不包尾
		 *  subString(beginIndex)
		 *  
		 *  
		 *  2.转换
		 *  	2.1将字符串变成字符串数组(字符串的切割)
		 *  		String[] split(String regex) 根据给定正则表达式的匹配拆分此字符串。
		 *  	2.2将字符串变成字符数组
		 *  		char[] ();
		 *  	2.3将字符串变成字节数组
		 *  		byte[] () getBytes()
		 *  	2.4将字符串中的字母转成大小写
			 *  	toUpperCase()
			 *  	toLowerCase()
		 *  	2.5将字符串中的内容进行替换
		 *  		String replace(char oldchar，char newchar) 替换完值不能修改 。能改变的在StringBuffer里
		 *  		String replace(String olds，String news) 
		 *  	2.6去除字符串两边的空格
		 *  		trim();
		 * 		2.7连接字符串
		 *  		String concat(String)
		 *  	2.8把非字符串类型转换为字符串
		 *  		String valueof();
		 *  
		 *  3.判断
		 *  	3.1两个字符串内容是否相同
		 *  		equals(Object obj)
		 *  		equalsIgnoreCase()
		 *  	3.2包含，开头，结尾
		 *  		contains()
		 *  		startswith()
		 *  		endswith()
		 *  	
		 *  4.比较
		 *  	compareTo() 对象的比较用此方法。字符串本身就是对象"abc"
		 */
		String a="abcde";
		a.charAt(0);
		System.out.println(a.charAt(0));
		stringMethodDemo_4();
	}
	
	private static void stringMethodDemo_4() {
		System.out.println("abc".compareTo("aqc"));//a与a先比，b与q再比，由于第二位b已经小于q，所以直接输出b与q的差值。第三位不做比较。
		
	}

	private static void stringMethodDemo_3() {
		String s="ArrayDemo.java";
		System.out.println(s.startsWith("ArrayDemo"));
		System.out.println(s.contains(".java"));
		
	}

	public static void stringMethodDemo_2() {
		String s="张三.李四.王五";//取出人名
		String[] array=s.split("\\.");
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		String s1="abc";
		String s2="kk";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(String.valueOf(4)+1);
		System.out.println(""+4+1);

	}

}
