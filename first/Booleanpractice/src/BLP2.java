import java.util.Scanner;
//두 숫자를 비교해서 큰 숫자 출력
public class BLP2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s1 = scan.nextInt();
		int s2 = scan.nextInt();
		
		if (s1>=s2) {
			System.out.println(s1);
		}else {
			System.out.println(s2);
		}
		
	}

}
