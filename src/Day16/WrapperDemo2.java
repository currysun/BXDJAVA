package Day16;
		/*
		JDK1.5������
		*		Integer kk=new Integer(44);
		*		Integer kk=44; �Զ�װ��
		*		kk=kk+5; �Զ����� (java �ڲ����˴��� int kk=kk.intValue())
		*/
public class WrapperDemo2 {

	public static void main(String[] args) {
	Integer a=new Integer(127);
	Integer b=new Integer(127);
	
	System.out.println(a==b);
	System.out.println(a.equals(b));
	
	Integer x=127; //�Զ�װ�������һ���ֽڣ�8λ��2��8�η������ڣ��򲻻Ὺ���µĿռ䣬����-128~127����ͬһƬ�ڴ�ռ䣬==�ȽϵĽ����true
	Integer y=127;
	
	System.out.println(x==y);
	System.out.println(x.equals(y));
	x=x+1; //�Զ����� int x=x.intValue()
	int cc=x.intValue();

	}

}
