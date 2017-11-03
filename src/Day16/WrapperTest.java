package Day16;

import java.util.Arrays;

/*
 *��һ���ַ����е���ֵ���д�С���������20 100 9 5 16 65
 * 
 */
public class WrapperTest {

	public static void main(String[] args) {
		String txt="20 100 9 5 16 65";
		//1 ���ַ���ת��Ϊ�ַ�������
		String[] array=toStringArray(txt);
		
		//2���ַ�������ת��Ϊint ��������
		int[] int_array=toIntArray(array);
		
		//3��int ���������������
		Arrays.sort(int_array);
		
		//4��int ��������תΪ�ַ���
		txt=int_array.toString();
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(int_array));
		System.out.println(Arrays.toString(txt));
		
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
