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
		 * 多态作用之一，方法定义形参时 选择大容量的类型，可以接受更多类型的数据。
		 * 在方法内需要使用接受到的大类型参数时，如需要使用本类的属性需要进行强转。
		 */
		
		/*
		 * 在实现类名Comparable加入泛型 ，由于compareTo 方法支持传入泛型，所以这样做可以更好的兼容compareTo 方法的传参类型
		 * Person p=(Person)o;
		 */	
		int temp=this.age-p.age;
		return temp==0?this.Name.compareTo(p.Name):temp;
	}



}
