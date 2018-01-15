package Day15;

/*
 * StringBuffer ���ַ���������������һ�ִ洢���ݵ�������
 * 
 * �ص㣺1.���ȿɱ�
 * 	    2.֧�ֶ�����������
 * 		3.����ת���ַ���ʹ��
 * 
 * ����	1.���
 * 		append(data);
 * 		insert(index,data)
 * 		2.ɾ��
 * 		delete() ��ͷ����β
 * 		delete(index,char)
 * 		3.���� 
 * 		char charAt(index)
 * 		int indexof(char)
 * 		int lastindexof(char)
 * 		4.�޸�
 * 		replace(start,end,string)��ͷ����β
 * 		void setCharAt(index,char)���ݽǱ��滻ָ���ַ�
 * 
 * 		CURD
 * 		setLength
 * 		reverse
 */
public class StringBufferDemo {

	public static void main(String[] args) {
		
		String txt="abcdefg";
		
		StringBuffer sb=new StringBuffer();
		sb.append("abc").append(true).append(123);
		System.out.println(sb); //abctrue123 ����һ���ַ���
		StringBuffer a=sb.insert(2, ':').insert(4, ':');
		
		//a.delete(1, 3);
		//a.replace(0, 2, "curry");
		//a.setCharAt(5, '?');
		//a.setLength(15);
		//a.reverse();
		System.out.println(a);
		//��ջ�����
		a.delete(0,a.length());
		System.out.println(a);
		
		//testReplace(txt);
		System.out.println(testReplace(txt));
	}

	public static String testReplace(String txt) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder(txt);
		//char[] charArray=txt.toCharArray();
		for(int index=0,count=0;index<txt.length()+count;index++) 
		{
			if(index%2==1) {
				sb.insert(index, ':');
				count++;
			}
			
		}
		return sb.toString();
	}

}
