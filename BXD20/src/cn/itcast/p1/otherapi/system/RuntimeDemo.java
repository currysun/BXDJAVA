package cn.itcast.p1.otherapi.system;

import java.io.IOException;

public class RuntimeDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * Runtime:û�й��췽����˵�����಻�ܴ�������
		 * �ַ��ֻ��зǾ�̬�ķ�����˵�������ṩ��̬�ķ��ظ������ķ�����
		 * ����ֻ��һ����˵��Runtime��ʹ�õ������ģʽ��
		 */
		Runtime r=Runtime.getRuntime();
		r.exec("notepad.exe");
		
	}

}
