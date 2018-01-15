package cn.itcast.p1.map.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * ��ȡ���ַ�����ĳһ����ĸ���ֵĴ��� "fdgavcbsacdfs" Ҫ���ӡ����ǣ�a(2)b(1)....
 *
 * ӳ��Ĺ�ϵ ������������ı�� ���뵽�������顣 ӳ�������û��һ��������ı�ţ���ʱ�뵽Map������������ӳ���ϵ�ļ��ϡ�
 * ���ڽ���ķ������֣���ĸ�ʹ���֮�������ӳ��Ĺ�ϵ���������ֹ�ϵ�ܶࡣ �ܶ����Ҫ�洢���ܴ洢ӳ���ϵ���������ܴ洢ӳ���ϵ�ļ����������Map���ϡ�
 * ��ϵһ���������� û�У� �Ǿ���ʹ��Map���ϡ��ַ��ֿ��Ա�֤Ψһ�Եķ��߱���˳�� a b c������ ���Կ���ʹ��TreeMap����
 * 
 * �����������Ӧ�ô洢������ĸ�ʹ����Ķ�Ӧ��ϵ��
 *
 * 1.��Ϊ���������ַ����е���ĸ�������Ƚ��ַ�������ַ����顣 2.�������ַ����飬�����û���ظ���ÿһ��ֵ�Լ��ֱ����
 * һ��map�У�����Ӧ��ֵ+1����������ظ���ֵ��ô���Ǹü�������Ӧ��ֵ+1�� 3.��������֮�� ��map �ʹ洢�˸��ַ�����������ĸ������
 *
 */
public class MapTest2 {

	public static void main(String[] args) {
		// fdgavcbsacdfs
		String txt = "fdgavcbsacdfsfff";

		String cc = countChar(txt);
		
		System.out.println(cc);

		
	}

	public static String countChar(String txt) {
		char[] arrayChar = txt.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < arrayChar.length; i++) {

			// String key=String.valueOf(arrayChar[i]);
			int count = 1;
			Integer value = map.get(arrayChar[i]);
			if (value!= null) {
				count=value + 1;
			}
			map.put(arrayChar[i], count);

			/*
			 * if(!map.containsKey(key)) { map.put(key, 1);
			 * 
			 * }
			 * 
			 * else { map.put(key, ++value); System.out.println(value); }
			 */
		}
		return mapToString(map);
	}

	public static String mapToString(Map<Character, Integer> map) {
		StringBuilder sb=new StringBuilder();
		
		Iterator<?> it = map.keySet().iterator();

		while (it.hasNext()) {
			Character key = (Character) it.next();
			Integer value = map.get(key);
			sb.append(key + "(" + value + ")");
			//System.out.println(sb);

		}
		
		return sb.toString();
		
	}
}
