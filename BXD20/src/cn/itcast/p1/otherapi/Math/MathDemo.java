package cn.itcast.p1.otherapi.Math;

import java.util.Random;

public class MathDemo {

	public static void main(String[] args) {
		
		/*
		 *ceil 返回大于参数的最大整数
		 *floor 返回小于参数的最小整数 
		 *round 返回四舍五入 
		 *pow(a,b) a^b a的b次方
		 *random() 返回0.0~1.0 之间的任意数 
		 */
		
		
		double d1=12.56;
		double d2=12.56;
		double d3=12.56;
		
		
		/*System.out.println(Math.ceil(d1));
		System.out.println(Math.floor(d2));
		System.out.println(Math.round(d3));
		System.out.println(Math.pow(5, 3));*/
	
		Random r=new Random();
		
		for(int i=0;i<10;i++) {
			//double d=Math.ceil(Math.random());
			//double d=(int)(Math.random()*6+1);
			
			int d=r.nextInt(6)+1;
			System.out.println(d);
		}
	}

}
