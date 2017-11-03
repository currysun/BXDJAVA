package Day15;

/*
 * StringBuffer 是字符串缓冲区，这是一种存储数据的容器。
 * 
 * 特点：1.长度可变
 * 	    2.支持多种数据类型
 * 		3.最终转成字符串使用
 * 
 * 方法	1.添加
 * 		append(data);
 * 		insert(index,data)
 * 		2.删除
 * 		delete() 包头不包尾
 * 		delete(index,char)
 * 		3.查找 
 * 		char charAt(index)
 * 		int indexof(char)
 * 		int lastindexof(char)
 * 		4.修改
 * 		replace(start,end,string)包头不包尾
 * 		void setCharAt(index,char)根据角标替换指定字符
 * 
 * 		CURD
 * 		setLength
 * 		reverse
 */
public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		sb.append("abc").append(true).append(123);
		System.out.println(sb); //abctrue123 这是一个字符串
		StringBuffer a=sb.insert(2, ':').insert(4, ':');
		
		a.delete(1, 3);
		a.replace(0, 2, "curry");
		a.setCharAt(5, '?');
		//a.setLength(15);
		a.reverse();
		System.out.println(a);
		//清空缓存区
		a.delete(0,a.length());
		System.out.println(a);
	}

}
