package Day16;

public class WrapperDemo {

	public static void main(String[] args) {
		/*
		 * 
		 * �����������Ͱ�װ��
		 * Ϊ�˷������������������ֵ�������װ�ɶ����ڶ����ж��������Ժ���Ϊ�ḻ�˸����ݵĲ�����
		 * ���������ö������ͳ�Ϊ�����������Ͷ����װ�ࡣ
		 * byte		Byte
		 * short	Short
		 * int		Integer �ṩ��Щ�������� int ��String ����֮�以��ת����
		 * long		Long
		 * float	Float
		 * double	Double
		 * char		Character
		 * boolean	Boolean
		 * 
		 * �ð�װ��Ҫ���ڻ��������������ַ�������֮���ת����
		 * 
		 * ��������--->�ַ���
		 * 		1.��������+""
		 * 		2.String���еľ�̬����valueOf(������������)
		 * 
		 * �ַ���--->������������
		 * 		1.ʹ�ð�װ��ľ�̬����parse��������("xxx���͵��ַ���")������
		 * 			Integer.parseInt("12345")
		 * 			Boolean.parseBoolean("true")
		 * 			ֻ��charû��parse����.
		 * 		2.����ַ�����Integer�����װ��ʹ��intValue()����������ת����
		 * 
		 * 		��������--->ʮ���ƴ�
		 * 		parseInt(�������Ƶ���ֵ,�ý��ƻ���)
		 * 
		 * 		ʮ����--->��������
		 * 		toBinaryString
		 * 		toHexString
		 *		
		 *		Integer��װ�ɶ����Ƚ���compareTo
		 *
		 *		JDK1.5������
		 *		Integer kk=new Integer(44);
		 *		Integer kk=44; �Զ�װ��
		 */
		
		System.out.println(Integer.MAX_VALUE);
		
		//����int ���͵Ķ���
		
		int num=12;
		Integer i=new Integer(num);
		Integer kk=44;
		
		System.out.println(Integer.parseInt("123")+1);
		
		Integer j=new Integer("100");
		// �����ܲ�����̬���� Integer.parseInt(j);
		j.intValue();
		System.out.println(j.intValue());
		System.out.println("������ "+Integer.toBinaryString(num));
		System.out.println("16���� "+Integer.toHexString(num));
		System.out.println(Integer.parseInt("110", 2));
	}

}
