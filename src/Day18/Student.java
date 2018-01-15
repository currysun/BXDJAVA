package Day18;

import Day17.Person;

public class Student extends Person implements Comparable<Person>{
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student : "+getName()+":"+getAge();
	}

	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Student(String name,int age) {
		this.name=name;
		this.age=age;
		//System.out.println(this.name+":"+this.age);
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(Person p) {
		//Student s=(Student)p;
		int temp=this.age-p.getAge();
		return temp==0?this.name.compareTo(p.getName()):temp;
	}

}
