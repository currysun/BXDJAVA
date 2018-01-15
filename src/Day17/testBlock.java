package Day17;
/*
 *  静态代码块>main方法>构造代码块>构造方法。
	其中静态代码块只执行一次。构造代码块在每次创建对象是都会执行。
	如有继承关系，先执行超类，再执行子类。
 * 
 */
public class testBlock {

	public testBlock() {
		System.out.println("test 构造器");
	}

	{
		System.out.println("test 构造块");
	}

	static {
		System.out.println("test 静态构造块");
	}

	static class testB extends testBlock {
		public testB() {
			System.out.println("testB 构造器");
		}

		{
			System.out.println("testB 构造块");
		}

		static {
			System.out.println("testB 静态构造块");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		testB test1 =new testB();
		testB test2 =new testB();
		System.out.println("end");
	}

}
