package cn.itcast.p1.otherapi.date;

import java.util.Date;


public class DateDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		long time=System.currentTimeMillis();
		//System.out.println(time);//1514278898972
		
		Date date=new Date(); //将当前的日期和时间封装成Date 对象
		System.out.println(date);
		
		Date date2=new Date(1514278898972l); //将指定毫秒值封装成Date 对象。
		System.out.println(date2);
	}
	
	/**
	 * 日期对象和毫秒值之间的转换
	 *
	 *毫秒值-->日期对象：
	 *1.通过Date对象的构造方法完成 new Date(timeMillis);
	 *2.通过setTime方法设置。
	 *
	 *为什么要把毫秒值转成毫秒值。
	 *因为可以通过Date对象的方法对该日期中的各个字段（年月日等）进行操作。
	 *
	 *
	 *日期对象-->毫秒值
	 *2.getTime方法
	 */
	
	
}
