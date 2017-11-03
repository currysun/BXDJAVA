package Day15;

import java.util.Arrays;

public class StringMethodDemo {

	public static void main(String[] args) {
		/*
		 * 
		 * ������������˼���String��ķ������ࣺ
		 * ��abcd��
		 * 
		 * 
		 * 1.��ȡ
		 * 	1.1 ��ȡ�ַ����ĳ��� 
		 * 	�������� �����Σ�����ʲô��
		 * 	int		��
		 * 	length()
		 * 		
		 * 	1.2����λ�û�ȡ�ַ� 
		 * 	char    int
		 * 	charAt(int index)	
		 * 
		 * 	1.3�����ַ���ȡ�ַ�����һ�γ��ֵ�λ��
		 * 	int      char(String)
		 * 
		 *  indexOf(int ch)
		 *  indexOf(int ch,int fromIndex) ˳��ʼ��ָ��λ�ý���ch�Ĳ��ҳ���λ��
		 *	indexOf(String s)
		 *  indexOf(String s,int fromIndex) ˳��ʼ��ָ��λ�ý���ch�Ĳ��ҵ�һ�γ���λ�� 		
		 * 	
		 *  lastindexOf(int ch)	
		 *  lastindexOf(int ch,int fromIndex) ����ʼ��ָ��λ�ý���ch�Ĳ��ҳ���λ��
		 *	lastindexOf(String s)
		 *  lastindexOf(String s,int fromIndex) ����ʼ��ָ��λ�ý���ch�Ĳ��ҳ��ֵ�λ�� 		
		 *  
		 *  1.4 ��ȡ�ַ����е�һ�����ַ�����Ҳ���Ӵ�
		 *  subString(beginIndex,endIndex) ��ͷ����β
		 *  subString(beginIndex)
		 *  
		 *  
		 *  2.ת��
		 *  	2.1���ַ�������ַ�������(�ַ������и�)
		 *  		String[] split(String regex) ���ݸ���������ʽ��ƥ���ִ��ַ�����
		 *  	2.2���ַ�������ַ�����
		 *  		char[] ();
		 *  	2.3���ַ�������ֽ�����
		 *  		byte[] () getBytes()
		 *  	2.4���ַ����е���ĸת�ɴ�Сд
			 *  	toUpperCase()
			 *  	toLowerCase()
		 *  	2.5���ַ����е����ݽ����滻
		 *  		String replace(char oldchar��char newchar) �滻��ֵ�����޸� ���ܸı����StringBuffer��
		 *  		String replace(String olds��String news) 
		 *  	2.6ȥ���ַ������ߵĿո�
		 *  		trim();
		 * 		2.7�����ַ���
		 *  		String concat(String)
		 *  	2.8�ѷ��ַ�������ת��Ϊ�ַ���
		 *  		String valueof();
		 *  
		 *  3.�ж�
		 *  	3.1�����ַ��������Ƿ���ͬ
		 *  		equals(Object obj)
		 *  		equalsIgnoreCase()
		 *  	3.2��������ͷ����β
		 *  		contains()
		 *  		startswith()
		 *  		endswith()
		 *  	
		 *  4.�Ƚ�
		 *  	compareTo() ����ıȽ��ô˷������ַ���������Ƕ���"abc"
		 */
		String a="abcde";
		a.charAt(0);
		System.out.println(a.charAt(0));
		stringMethodDemo_4();
	}
	
	private static void stringMethodDemo_4() {
		System.out.println("abc".compareTo("aqc"));//a��a�ȱȣ�b��q�ٱȣ����ڵڶ�λb�Ѿ�С��q������ֱ�����b��q�Ĳ�ֵ������λ�����Ƚϡ�
		
	}

	private static void stringMethodDemo_3() {
		String s="ArrayDemo.java";
		System.out.println(s.startsWith("ArrayDemo"));
		System.out.println(s.contains(".java"));
		
	}

	public static void stringMethodDemo_2() {
		String s="����.����.����";//ȡ������
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
