package Day17;
/*
 *  ��̬�����>main����>��������>���췽����
	���о�̬�����ִֻ��һ�Ρ�����������ÿ�δ��������Ƕ���ִ�С�
	���м̳й�ϵ����ִ�г��࣬��ִ�����ࡣ
 * 
 */
public class testBlock {

	public testBlock() {
		System.out.println("test ������");
	}

	{
		System.out.println("test �����");
	}

	static {
		System.out.println("test ��̬�����");
	}

	static class testB extends testBlock {
		public testB() {
			System.out.println("testB ������");
		}

		{
			System.out.println("testB �����");
		}

		static {
			System.out.println("testB ��̬�����");
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
