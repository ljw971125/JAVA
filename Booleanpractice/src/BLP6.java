
import java.util.Scanner;

public class BLP6 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	while(true) {
		System.out.println("홀수 짝수 프로그램입니다.");
		System.out.println("숫자를 입력하세요.");
		
		int s1=scan.nextInt();
		if(s1%2==0) {
			System.out.println("입력한 수는 짝수입니다.");
		}else {
			System.out.println("입력한 수는 홀수입니다.");
		}
		
		
	}

}

}


