package Signup;

import java.util.Scanner;

public class SignupPractice {

	public static void main(String[] args) {
		Member[] m = new Member[100]; //배열 공간 100개를 만든다
		int index=0; //
		Scanner scan = new Scanner(System.in);
		String command = scan.next();
		
		if(command.equals("회원가입")){ //회원가입을 입력하면
			System.out.println("id, password email순으로 데이터를 입력하세요."+"(예) hong 1234 a@a.net");
			String id=scan.next();
			String password=scan.next();
			String email=scan.next();
			
			m[index++]=new Member(id, password, email);
			System.out.println("회원정보확인");
			m[index-1].info();
		
		
		
		}
	}

}
