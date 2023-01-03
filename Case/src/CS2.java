import java.util.Scanner;

public class CS2 {

	public static void main(String[] args) {
		//연산할 두 수와 연산자를 입력받아 결과 출력
		//단 Calcurator 클래스를 이용하여 처리
		int su1=0,su2=0; //계산할 두숫자
		char op; //연산기호가 들어갈 변수
		Scanner scan = new Scanner(System.in);
		
		Calcurator cal = new Calcurator();
		float result = 0;
		
		su1=scan.nextInt(); //숫자를 입력할수 있게 해줌
		su2=scan.nextInt();
		String s=scan.next();//문자를 입력할수 있게 해줌
		op=(char)s.charAt(0);//스위치문으로 전달
		
		switch(op) {
		case '+'://+가 들어가면 <-케이스문을 실행
			result=cal.add(su1, su2);
			break;
		case'-'://-가 들어가면 <-케이스문을 실행
			result=cal.sub(su1, su2);
			break;
		case'*'://*가 들어가면 <-케이스문을 실행
			result=cal.mul(su1, su2);
			break;
		case'/':///가 들어가면 <-케이스문을 실행
			result=cal.div(su1, su2);
			break;
		}
		System.out.println("결과값: "+result);

	}

}
