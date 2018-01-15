package Day16;

import java.util.Arrays;

/*
 *对一个字符串中的数值进行从小到大的排序20 100 9 5 16 65
 * 
 */
public class WrapperTest {

	public static void main(String[] args) {
		String txt="20 100 9 5 16 65";
		//1 将字符串转换为字符串数组
		String[] array=toStringArray(txt);
		
		//2将字符串数组转换为int 类型数组
		int[] int_array=toIntArray(array);
		
		//3将int 类型数组进行排序
		Arrays.sort(int_array);
		
		//4将int 类型数组转为字符串
		String text=intToStringArray(int_array);
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(int_array));
		//System.out.println((text));
		
	}

	public static String intToStringArray(int[] int_array) {
		StringBuilder text=new StringBuilder();
		for (int i = 0; i < int_array.length; i++) {	
			if(i!=int_array.length-1) 
			{
				text.append(int_array[i]+" ");	
			}
			else if(i==int_array.length-1)
			{
				text.append(int_array[i]);	
			}
			
		}
		return text.toString();
	}

	public static int[] toIntArray(String[] array) {
		int[] int_array=new int[array.length];
		for (int i = 0; i < int_array.length; i++) {
			int_array[i] =Integer.parseInt(array[i]);
		}
		return int_array;
	}

	public static String[] toStringArray(String txt) {
		return txt.split(" ");
	}

}
