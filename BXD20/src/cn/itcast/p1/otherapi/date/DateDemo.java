package cn.itcast.p1.otherapi.date;

import java.util.Date;


public class DateDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		long time=System.currentTimeMillis();
		//System.out.println(time);//1514278898972
		
		Date date=new Date(); //����ǰ�����ں�ʱ���װ��Date ����
		System.out.println(date);
		
		Date date2=new Date(1514278898972l); //��ָ������ֵ��װ��Date ����
		System.out.println(date2);
	}
	
	/**
	 * ���ڶ���ͺ���ֵ֮���ת��
	 *
	 *����ֵ-->���ڶ���
	 *1.ͨ��Date����Ĺ��췽����� new Date(timeMillis);
	 *2.ͨ��setTime�������á�
	 *
	 *ΪʲôҪ�Ѻ���ֵת�ɺ���ֵ��
	 *��Ϊ����ͨ��Date����ķ����Ը������еĸ����ֶΣ������յȣ����в�����
	 *
	 *
	 *���ڶ���-->����ֵ
	 *2.getTime����
	 */
	
	
}
