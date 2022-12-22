
public class Array {
	String name;//표시할 정보를 기입
	String tel;
	int age;
	
	void setData(String name,String tel,int age) {
		this.name=name;//다른 클래스에서 쓸수 있도록 생성자화
		this.tel=tel;
		this.age=age;
	}
	
	public void info() {
		System.out.println(name+" "+tel+" "+age);
	}

}
