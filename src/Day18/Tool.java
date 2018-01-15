package Day18;

/*public class Tool {
	
	private Object object;
	
	public Object getObject() {
		return object;
	}
	
	public void setObject(Object object) {
		this.object=object;
	}


}
*/

public class Tool<QQ>{
	private QQ q;

	public QQ getObject() {
		return q;
	}

	public void setObject(QQ obj) {
		this.q = obj;
	}
	
	public void show(QQ str) {
		System.out.println("show : "+str);
	}
	
	public void print(QQ str) {
		System.out.println("print : "+str);
	}
	
	
	/*
	 *方法上定义泛型
	 */
	public <W> void showa(W str) {
		System.out.println("show : "+str);
	}
	
	public static <V> void method(V str) {
		System.out.println("print : "+str);
	}
	
	
}