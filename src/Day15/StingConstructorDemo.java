package Day15;

/*
 * 01-���ö���API(String��-�ص�)
 * 02-���ö���API(String��-���캯��)
 */

public class StingConstructorDemo {

	public static void main(String[] args) {
			
		String s="abc"; // ��abc����һ�������ַ����������е�һ������
		String s1=new String("abc"); // ����ַ��� �������ַ����������� ����Ҳ�����ڶ��ڴ��С�һ��������2������
		
		//���õ�String ���췽��
		byte[] b= {97,68,69,70};
		String s2=new String(b); //���ֽ����� ת��Ϊ�ַ�����
		String s3=new String(b,1,2); //���ֽ������ָ���Ĳ��� ת��Ϊ�ַ�����
		System.out.println(s2);
		System.out.println(s3);
		
		char[] array= {'a','b','c','d','e'};
		String a=new String(array, 2, 3);//���ַ������ָ���Ĳ��� ת��Ϊ�ַ�����
		System.out.println(a);
		
	}

}
