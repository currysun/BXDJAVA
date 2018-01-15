package cn.itcast.p1.map.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 获取该字符串中某一个字母出现的次数 "fdgavcbsacdfs" 要求打印结果是：a(2)b(1)....
 *
 * 映射的关系 两方若是有序的编号 ，想到的是数组。 映射的两方没有一方是有序的编号，这时想到Map，它是容器中映射关系的集合。
 * 对于结果的分析发现，字母和次数之间存在着映射的关系。而且这种关系很多。 很多就需要存储，能存储映射关系的容器：能存储映射关系的集合有数组和Map集合。
 * 关系一方有序编号吗？ 没有！ 那就是使用Map集合。又发现可以保证唯一性的房具备着顺序 a b c。。。 所以可以使用TreeMap集合
 * 
 * 这个集合最终应该存储的是字母和次数的对应关系。
 *
 * 1.因为操作的是字符串中的字母，所以先将字符串变成字符数组。 2.遍历该字符数组，如果键没有重复则将每一个值以键分别存入
 * 一个map中，所对应的值+1。如果键有重复的值怎么覆盖该键，所对应的值+1。 3.结束遍历之后 该map 就存储了该字符串的所有字母次数。
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
