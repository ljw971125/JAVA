package phonebook;
import java.io.IOException;
import java.util.Scanner;

public class Phone2Main {

	public static void main(String[] args) throws IOException {
		//공통으로 사용하는 클래스 및 변수를 선언하는 위치
				Phone1Mgr pm=new Phone1Mgr();
				pm.pb[0]=new Phone1("kim1","010-1111-1111","특이사항 없음");
				pm.pb[1]=new Phone1("kim2","010-1111-2222","특이사항 없음");
				pm.pb[2]=new Phone1("kim3","010-1111-3333","특이사항 없음");
				pm.pb[3]=new Phone1("kim4","010-1111-4444","특이사항 없음");
				pm.pb[4]=new Phone1("kim5","010-1111-5555","특이사항 없음");
				pm.index=5;
				
				Scanner scan=new Scanner(System.in);
				Phone1 Phone1=null;
				
				while(true) {
						
				switch(pm.menu()) {
				case 1://입력 처리 					
					pm.insert(pm.insertInput());
					break;
				case 2:
					System.out.println("찾을 전화번호를 입력하세요.");
					String search=scan.next();
					if(pm.isObject(search)) {
						Phone1=pm.selectByhp(search);
						System.out.println(Phone1);
					}
					break;
				case 3:
					pm.allPrint(pm.selectAll());
					break;
				case 4:
					UpdatePhone1 up=pm.updateInput();
					pm.updateByhp(up.search, up.Phone1);
					break;
				case 5: 
					//전화번호를 입력받아 데이터가 존재하면 null로 삭제하세요.
					System.out.println("삭제할 전화번호를 입력하세요.");
					search=scan.next();
					pm.deleteByhp(search);
					break;
				
				case 9: System.out.println("프로그램을 종료합니다.");
						System.exit(0);
						break;
				
				default: 
					System.out.println("다시 선택하세요.");
					break;
				}
				
				System.in.read();
				while(System.in.available()!=0) {
					System.in.read();
				}
				
				}//end while

	}

}
