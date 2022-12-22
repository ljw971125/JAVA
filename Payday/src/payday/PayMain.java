package payday;

import java.io.IOException;
import java.util.Scanner;

//월급 계산
public class PayMain {

	public static void main(String[] args) throws IOException {
		//스캐너를 이용하여 근무연수를 입력받아 계산하시오.
		int sum=0;
		int child =0; //자녀수
		 //초봉 기본급
		System.out.println("근무 연수를 입력하세요");
		while(true){
			int pay = 1500000;
			Scanner scan = new Scanner(System.in); //근무(경력) 년수
			int year =scan.nextInt();
		if(year ==0) {//조건
			System.out.println("신입사원입니다.");
		}else if((1<=year) && (3>year)){
			pay = pay + 500000;
		}else if((3<=year) && (5>year)) {
			pay=pay+1000000;
		}else if((5<=year) && (10>year)) {
			pay=pay+1500000;
		}else {//위의 조건에 모두 충족하지 못할때
			pay =pay+3000000;
		}
		
		System.out.println("당신의 급여는"+ pay +"입니다.(종료:q)");
		char exit=(char)System.in.read();//종료시켜줌
		if(exit=='q') {
			System.out.println("프로그램을 종료합니다.");
			break;
			}//밖으로 빠져나감
		}
	}

	}
