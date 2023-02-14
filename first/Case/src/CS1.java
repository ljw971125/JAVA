
public class CS1 {

	public static void main(String[] args) {
		char sel='3';//입력값
		switch(sel) {//sel값에 숫자를 입력햇을때 case문의 결과값이 출력
		case '1': System.out.println("1출력"); break;
		case '2': System.out.println("2출력"); break;
		case '3': System.out.println("3출력"); break;
		case '4': System.out.println("4출력"); break;
		default : System.out.println("1~4의 입력이 아닙니다."); break;
		}
		if(sel=='1') System.out.println("1출력");//만약 입력값이 1이면 1출력
		else if(sel=='2')System.out.println("2출력");//입력값이 2이면 2출력
		else System.out.println("1~4의 입력이 아닙니다.");//아무것도 해당하지 않을경우 출력

	}

}
