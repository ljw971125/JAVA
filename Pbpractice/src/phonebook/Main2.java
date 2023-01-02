package phonebook;

import java.awt.FileDialog;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;

public class Main2 {
final static int INPUT=1;

	public static void main(String[] args) throws IOException {
		//폰북에 입력되는 객체 데이터를 전달
		File file=new File("phonebook.txt");
		
		//공통으로 사용하는 클래스 및 변수를 선언하는 위치
				PhonebookMgr pm=new PhonebookMgr(file);
								
				Scanner scan=new Scanner(System.in);
				Phonebook phonebook=null;
				
				while(true) {
						
				switch(pm.menu()) {
				case INPUT://입력 처리 					
					pm.insert(pm.insertInput());
					break;
				case 2:
					System.out.println("찾을 전화번호를 입력하세요.");
					String search=scan.next();
					if(pm.isObject(search)) {
						phonebook=pm.selectByhp(search);
						System.out.println(phonebook);
					}
					break;
				case 3:
					pm.allPrint(pm.selectAll());
					break;
				case 4:
					UpdatePhonebook up=pm.updateInput();
					pm.updateByhp(up.search, up.phonebook);
					break;
				case 5: 
					//전화번호를 입력받아 데이터가 존재하면 null로 삭제하세요.
					System.out.println("삭제할 전화번호를 입력하세요.");
					search=scan.next();
					pm.deleteByhp(search);
					break;
				case 6:
					/*
					 //console입력형태
					System.out.println("파일명을 입력하세요.");
					String fname=scan.next();
					File load=new File(fname);
					pm.dataLoad(load);
					break;
					*/
					
					//윈도우 입력형태
					FileDialog fd
					=new FileDialog(new JFrame(),"파일열기",0);
					//fd.setDirectory("c:"); //기본경로 설정
					fd.setDirectory("C:\\Users\\admin\\eclipse-workspace\\ex20230102\\src\\phonebook");
					fd.setVisible(true); //윈도우에서 화면 보이게 하는 역할
					
					//System.out.println(fd.getFile());
					File load=new File(fd.getFile());
					pm.dataLoad(load);
					break;
					
				case 7:
					//메모리에 있는 데이터를 파일에 저장하기
					//첫번째 방법은 phonebook.txt형식을 저장
					//두번째 방법은 프로그램매니저에서 pb[100]객체를 클래스형태로 저장 
					
				case 9: 
					//종료되기 전 메모리에 있는 내용을 파일로 저장
					//메모리->File로 전달하는 과정
					//BufferedWriter -> FileWriter(OutputStreamWriter) -> File(OutputStream)
					//BufferedWriter
					
					//FileWriter
					
					//PrintWriter
					
					System.out.println("프로그램을 종료합니다.");
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
