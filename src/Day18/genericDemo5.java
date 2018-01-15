package Day18;

public class genericDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * InterImp1 in=new InterImp1(); in.show("abcd");
		 */

		InterImp12<Integer> in2 = new InterImp12<Integer>();
		in2.show(10);
	}

}

// 泛型接口，将泛型定义在接口上。
interface Inter<T> {

	public void show(T t);

}

/*class InterImp1 implements Inter<String> {

	public void show(String str) {

	}*/

class InterImp12<Q> implements Inter<Q>{
	public void show(Q q) {
		System.out.println("show : "+q);	
	}
}	
	

