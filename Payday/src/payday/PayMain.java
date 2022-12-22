package payday;

import java.util.Scanner;

//월급 계산
public class PayMain {

	public static void main(String[] args) {
		//스캐너를 이용하여 근무연수를 입력받아 계산하시오.
		Scanner scan = new Scanner(System.in); //근무(경력) 년수
		int year =scan.nextInt();
		int child =0; //자녀수
		int pay = 1500000; //초봉 기본급

		if(year ==0) {//조건
			System.out.println("신입사원입니다.");
		}else if(year==1) {
			pay = pay + 200000;
			System.out.println("경력 1년 입니다.");
		}else if(year==2) {
			pay=pay+400000;
		}else if(year==3) {
			pay=pay+600000;
		}else if(year==4) {
			pay=pay+800000;
		}else {//위의 조건에 모두 충족하지 못할때
			pay =pay+1500000;
		}
		System.out.println("당신의 급여는"+ pay +"입니다.");

	}

}
