package Day18;

public class genericDefineDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tool<Student> tool=new Tool<Student>();
		
		tool.setObject(new Student());
		
		//���͵ĺô� �ڹ��˶����Ƿ� ���ϸ��ඨ��ķ��͡�-������
		/*tool.setObject(new Worker());*/
		
		Student stu= (Student)tool.getObject();
	}

}
