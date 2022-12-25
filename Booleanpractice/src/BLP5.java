import java.util.Scanner;

public class BLP5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s1=scan.nextInt();//입력 받는 기능
		
		if(s1>0 && s1<10) {//s1이 0과10 사이 숫자이면 만족 아니면 불만족
			System.out.println("만족");
		}else {
			System.out.println("불만족");
		}
		

	}

}
