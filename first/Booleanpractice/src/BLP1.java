import java.util.Scanner;

public class BLP1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//스캔을 위한 코드
		int s = scan.nextInt();
		if(s>100) {
			System.out.println("입력한 수는 100보다 큽니다.");
		}
	}
}
