package Day15;

import java.util.Arrays;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/*
 * 1. ����һ���ַ������顣�����ֶ�˳����д�С���������
 * {"nba","abc","cba","zz","qq"}
 * 
 * 2. �����Ӵ����ַ����г��ֵĴ���
 * "nbacurrynbadurantnbagreennba"
 * 
 * 3. Ѱ��2���ַ�������ͬ������Ӵ�
 * 	"qwethabcdfjjy"
 * 	"xcvabcdmkl"
 */
public class StringTest {

	public static void main(String[] args) {
		//��ϰ1
	String[] array={"nba","abc","cba","zz","qq"};
	System.out.println(Arrays.toString(sortArray2(array)));
		
		//��ϰ2
	String nba="nbacurrynbadurantnbagreennba";
	int count=countString(nba,"nba");
	System.out.println(count);
	int count1=countString2(nba,"nba");
	System.out.println(count1);
	
		//��ϰ3
	String s1="qwethabcdfjjy";
	String s2="xcvabcdmkl";
	String maxS=getMaxSubString(s1,s2);
	System.out.println("max subString = "+maxS);
	
		//��ϰ4
	String strim="  stephen curry  ";
	trimString(strim);
	System.out.println(trimString(strim));
	}


	public static String trimString(String strim) {
		int beginIndex=0;
		int endIndex=strim.length()-1;
		char[] array=strim.toCharArray();
		while(array[beginIndex]==' ') {
			beginIndex++;
		}
		while(array[endIndex]==' ') {
			endIndex--;
		}
		return strim=strim.substring(beginIndex, endIndex+1);
	}


	public static String getMaxSubString(String s1, String s2) {
		String max=s1.length()>s2.length()?s1:s2;
		String min=max.equals(s1)?s2:s1;
		
		
		for (int i = 0; i < min.length(); i++) {
			for (int beginIndex = 0,endIndex=min.length()-i; endIndex != min.length()+1; beginIndex++,endIndex++) {
				String sub=min.substring(beginIndex, endIndex);
				if(max.contains(sub)) {
					return sub;
				}
			}
		}
		return null;
	}


	public static String[] sortArray(String[] args) {
		for (int i = 0; i < args.length-1; i++) {
			for (int j = 0; j < args.length-i-1; j++) {
				if(args[j].compareTo(args[j+1])>0) {
					String temp=args[j+1];
					args[j+1]=args[j];
					args[j]=temp;
				}
			}
		}
		return args;
		
	}

	public static String[] sortArray2(String[] args) {
		for (int i = 0; i < args.length-1; i++) {
			for (int j = 0; j < args.length-i-1; j++) {
				if(args[j].compareTo(args[j+1])<0) {
					String temp=args[j];
					args[j]=args[j+1];
					args[j+1]=temp;
				}
			}
		}
		return args;
	}
	public static int countString(String text,String key) {
	int count=0;
	int index=0;
	try {
		while((index=text.indexOf(key))!=-1) {
			count++;
			text=text.substring(index+key.length());
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
		return count;
	}
	
	public static int countString2(String nba, String key) {
		int count=0;
		int index=0;
		
		while((index=nba.indexOf(key, index))!=-1) {
			count++;
			index=index+key.length();
		}
		return count;
	}
	
}
