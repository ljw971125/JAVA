package ex20221221;

public class CalMain {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		int result = cal.add(10, 20);//직접
		System.out.println(result);//변수
		System.out.println(cal.add(10, 10));//함수
		System.out.println(20);
		System.out.println
		("결과:"+cal.add(10,10));
		
		System.out.println(5/2);//정수만 출력
		System.out.println(5.0f/2);//실수 출력
		
		//만든 계산기의 함수를 테스트
		System.out.println(cal.add(5, 2));
		System.out.println(cal.sub(5, 2));
		System.out.println(cal.mux(5, 2));
		System.out.println(cal.div(9, 2));
		System.out.println(cal.opcal(10, '+', 10));
		System.out.println(cal.opcal(5, '-', 3));
		System.out.println(cal.opcal(10, '*', 10));
		System.out.println(cal.opcal(5, '/', 2));
		cal.lastResult();
		}

}
