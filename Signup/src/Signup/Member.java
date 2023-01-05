package Signup;

public class Member {
	String id;
	String password;
	String email;
	
	//기본생성자
	public Member() {
	}
	//인자가 있는 생성자
	public Member(String id, String password, String email) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
	}
	
	public void info() {
		System.out.println(id+" "+password+" "+email);
		
	}

}//인자가 있는 생성자

