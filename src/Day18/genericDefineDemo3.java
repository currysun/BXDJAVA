package Day18;

public class genericDefineDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tool<Student> tool=new Tool<Student>();
		
		tool.setObject(new Student());
		
		//泛型的好处 在过滤对象是否 符合该类定义的泛型。-泛型类
		/*tool.setObject(new Worker());*/
		
		Student stu= (Student)tool.getObject();
	}

}
