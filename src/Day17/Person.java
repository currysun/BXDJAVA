package Day17;



public class Person implements Comparable<Person> {
	private String Name;
	private int age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {

		this.Name = name;
		this.age = age;
	}

	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return(Name+" "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}


	public int compareTo(Person p) {
		/*
		 * ��̬����֮һ�����������β�ʱ ѡ������������ͣ����Խ��ܸ������͵����ݡ�
		 * �ڷ�������Ҫʹ�ý��ܵ��Ĵ����Ͳ���ʱ������Ҫʹ�ñ����������Ҫ����ǿת��
		 */
		
		/*
		 * ��ʵ������Comparable���뷺�� ������compareTo ����֧�ִ��뷺�ͣ��������������Ը��õļ���compareTo �����Ĵ�������
		 * Person p=(Person)o;
		 */	
		int temp=this.age-p.age;
		return temp==0?this.Name.compareTo(p.Name):temp;
	}



}
