import java.util.Scanner;
//코드의 간략과 더 효율적인 작업
public class BLP3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int s1,s2;
		if((s1=scan.nextInt())>=(s2=scan.nextInt())){
			System.out.println(s1);
		}else {
			System.out.println(s2);
		}
	}
}
