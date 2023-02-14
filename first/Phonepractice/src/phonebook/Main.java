package phonebook;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//공통으로 사용하는 클래스 및 변수를 선언하는 위치
		Scanner scan = new Scanner(System.in);
		PhoneBook[] pb = new PhoneBook[100];
		int index=0;
		String search="";
		int k=0;
		String name="";
		String hp="";
		String memo="";
	
		while(true) {
		//메뉴화면 출력-번호입력-조건문을 이용하여 명령 구분
		//1.입력
		//2.출력(선택출력, 전체출력)
		//3.수정(선택수정)
		//4.삭제(선택삭제)
		System.out.println("----------------------------");
		System.out.println("    전화번호부    ");
		System.out.println("----------------------------");
		System.out.println("1.전화번호부 입력");
		System.out.println("2.전화번호부 찾기");
		System.out.println("3.전화번호부 전체보기");
		System.out.println("4.전화번호부 수정");
		System.out.println("5.전화번호부 삭제");
		System.out.println("0.프로그램 종료");
		System.out.println("----------------------------");
		
		//System.out.println(System.in.read()-48);
		int select = System.in.read()-48;
		while(System.in.available()!=0) {//몇자가 있는지 확인하는 함수
			System.in.read();
		}
		
		
		 //대체코드
		 //Scanner scan= new Scanner(System.in);
		 //select = scan.nextInt();
		/*
		System.out.println("버퍼 수:"+System.in.available());
		System.out.println(System.in.read());
		System.out.println("버퍼 수:"+System.in.available());
		System.out.println(System.in.read());
		System.out.println("버퍼 수:"+System.in.available());
		System.out.println(System.in.read());
		System.out.println("버퍼 수:"+System.in.available());
		*/
		
		switch(select) {
		case 1: //입력 처리
			//Scanner scan= new Scanner(System.in);
			System.out.println("이름을 입력하세요.");
			 name = scan.next();
			System.out.println("전화번호를 입력하세요.");
		     hp = scan.next();
			System.out.println("메모를 입력하세요.");
			 memo = scan.next();
			pb[index++]=new PhoneBook(name, hp, memo);
			//System.out.println("1번선택");
		    break;
		case 2: 
			//찾기를 무엇으로 할 것인가?
			//중복이 가능한 찾기인가,중복되지 않는 찾기인가?
			//전화번호, 중복되지 않음
			//String search =scan.next();
			System.out.println("찾을 전화번호를 입력하세요.");
			 search=scan.next();
			 k=0;
			for(k=0; k<index;k++) {
				if(search.equals(pb[k].hp)) {
					System.out.println("이름:"+pb[k].name);
					System.out.println("전화번호:"+pb[k].hp);
					System.out.println("메모:"+pb[k].memo);
					break;
				}
				
			}
			if(k==index) {System.out.println("찾는 데이터가 없습니다.");
				}
			//System.out.println("2번선택");
		    break;
			
		case 3:
			for(int i=0; i<index; i++) {
				/*
				System.out.println("이름:"+pb[i].name);
				System.out.println("전화번호:"+pb[i].hp);
				System.out.println("메모:"+pb[i].memo);
				*/
				System.out.println("----------------");
				System.out.println("번호 이름 전화번호 메모");
				System.out.println("----------------");
				if(pb[i]!=null) {
				
				System.out.printf("%d %s %s %s \n",i+1,pb[i].name,pb[i].hp,pb[i].memo);
				//null로 삭제할 경우 null pointer Exception 발생
				//처리하는 방법, try catch구문, 조건문으로 객체 여부 확인
				}
				}
			System.out.println("----------------------");
			System.out.println("3번선택");
		    break;
		case 4: 
			System.out.println("수정할 전화번호를 입력하세요.");
			search=scan.next();
			search=scan.next();
			for(k=0; k< index ;k++) {
				if(search.equals(pb[k].hp)){
					System.out.println("변경할 이름을 입력하세요.(변경사항 없으면 엔터키를 입력하세요.");
					name = scan.next();
					if(!name.equals("")) pb[k].name=name;
					
					System.out.println("변경할 전화번호를 입력하세요.(변경사항 없으면 엔터키를 입력하세요.");
					hp = scan.next();
					if(!hp.equals("")) pb[k].hp=hp;
					
					System.out.println("변경할 이름을 입력하세요.(변경사항 없으면 엔터키를 입력하세요.");
					memo = scan.next();
					if(!memo.equals("")) pb[k].memo=memo;
					
					break;
				}
			}
			System.out.println("4번선택");
		    break;
		case 5: 
			System.out.println("삭제할 전화번호를 입력하세요.");
			search=scan.next();
			for(k=0; k< index ;k++){//전화번호를 입력받아 데이터가 존재하면 null로 삭제하세요.
				if(search.equals(pb[k].hp)) {
					pb[k]=null;//전체 출력시 if 문을 사용하여 null임을 확인
					/*null로 하지 않는 경우
					 * pb[k].name="";
					 * pb[k].hp="";
					 * pb[k].memo="";
					 * null 예외 에러가 발생하지 않아 전체 출력시 if문이 필요없게 됨.
					 */
					System.out.println("전화번호를 삭제했습니다.");
					break;
				}
		}
		if(k==index) {
			System.out.println("삭제할 데이터가 없습니다.");
		}
					case 0: System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;
		default: 
			System.out.println("다시 선택하세요.");
		    break;
		}
		
		System.in.read();
		while(System.in.available()!=0){
			System.in.read();
		}
		}

	}

}
