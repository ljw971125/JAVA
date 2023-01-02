package phonebook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PhonebookMgr {
	Phonebook[] pb;//=new Phonebook[100];
	private int size=100;
	//private int index=0;
	int index=0;
	
	public PhonebookMgr() {
		pb=new Phonebook[size];
	}
	
	public PhonebookMgr(int size) {
	this.size=size;
	pb=new Phonebook[size];
	}
	
	public PhonebookMgr(File file){
		//pb=new Phonebook[size]; //공통적인 부분은 밖으로 빼고 else삭제 가능
		if(file.exists()) {
			pb=new Phonebook[size];
			
			//파일이 존재하면 파일의 내용을 읽어 
			//데이터 객체에 값을 입력하여 객체생성
			//File->FileReader->BufferedReader->문자파싱->객체 생성
			try {
			BufferedReader br
			=new BufferedReader(new FileReader(file));
			
			String imsi="";
			while((imsi=br.readLine())!=null){
				String[] p=imsi.split(" ");
				//위의 데이터를 입력하여 객체를 만들어져야함
				pb[index++]=new Phonebook(p[0], p[1], p[2]);
			}
			
			}catch(Exception e) {}
			finally {}
			
			
		}else {
			//빈 객체 100개를 만듦
			pb=new Phonebook[size];
		}
	}

	public int getSize() {
		return size;
	}
	//메뉴
	int menu() {
		System.out.println("------------------");
		System.out.println("     전화번호부      ");
		System.out.println("------------------");
		System.out.println("1.전화번호부 입력");
		System.out.println("2.전화번호부 찾기");
		System.out.println("3.전화번호부 전체보기");
		System.out.println("4.전화번호부 수정");
		System.out.println("5.전화번호부 삭제");
		System.out.println("6.전화번호부 불러오기");
		System.out.println("9.프로그램 종료");
		System.out.println("-------------------");
		
		Scanner scan=new Scanner(System.in);
		return scan.nextInt();
	}
	
	//입력 // insert(String name, String hp, String memo);
	
	int insert(Phonebook phonebook) {
		pb[index]=new Phonebook();
		pb[index].name=phonebook.name;
		pb[index].hp=phonebook.hp;
		pb[index].memo=phonebook.memo;
		index++;
		//try {}catch(Exception e) {return 0;}
		return 1;
	}
	
	//전체출력
	List<Phonebook> selectAll() {
		List<Phonebook> list=new ArrayList<Phonebook>();
		
		for(int i=0;i<index;i++) {
		if(pb[i]!=null)	list.add(pb[i]);
		}
		
		return list;
	}
	
	//선택출력(필요한산 사항:핸드폰 번호-hp==search))
	Phonebook selectByhp(String hp) {
		int k=0;
		Phonebook phonebook=new Phonebook();
		//if(isObject(hp)) {
			for(k=0;k<index;k++) {
				if(pb[k]!=null) {
					if(hp.equals(pb[k].hp)) {
						phonebook.name=pb[k].name;
						phonebook.hp=pb[k].hp;
						phonebook.memo=pb[k].memo;
						break;
					}
				}
			}
			if(k==index){
				//System.out.println("찾는 데이터가 없습니다.");
				phonebook=null;
			}
		//}
		
		return phonebook;
	}
	
	//선택수정
	int updateByhp(String hp,Phonebook phonebook) {
		int k=0;
		for(k=0;k<index;k++) {
			if(pb[k]!=null) {
				if(hp.equals(pb[k].hp)) {
					if(!phonebook.name.equals(""))
						pb[k].name=phonebook.name;
					if(!phonebook.hp.equals(""))
						pb[k].hp=phonebook.hp;
					if(!phonebook.memo.equals(""))
						pb[k].memo=phonebook.memo;
				
					return 1;
				}
			}
		}
		if(k==index){
			return 0;
		}
		
		return 0;
		
	}
	//선택삭제
	int deleteByhp(String hp) {
		int k=0;
		for(k=0;k<index;k++) {
			if(pb[k]!=null) {
				if(hp.equals(pb[k].hp)) {
					pb[k]=null;
					return 1;
				}
			}
		}
		if(k==index){
			return 0;
		}
		return 0;
	}
	
	void print() {
		for(int i=0;i<index;i++) {
			System.out.println(pb[i].toString());				
			}
	}

	@Override
	public String toString() {
		return "PhonebookMgr [pb=" + Arrays.toString(pb) + ", size=" + size + ", index=" + index + "]";
	}
	
	//upgrade
	
	Phonebook insertInput() {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name=scan.next();
		
		System.out.println("전화번호를 입력하세요.");
		String hp=scan.next();
		
		System.out.println("메모를 입력하세요.");
		String memo=scan.next();
		
		return new Phonebook(name, hp,memo);
	}
	
	
	boolean isObject(String hp) {
		int i=0;
		for(i=0;i<index;i++) {
			if(pb[i].hp!=null) {
				if(hp.equals(pb[i].hp)) return true;
			}
		}
		
		if(i==index) {
			return false;
		}
		return false;
		
	}
	
	void allPrint(List<Phonebook> list) {
		System.out.println("-------------------");
		System.out.println("번호 이름 전화번호 메모");
		System.out.println("-------------------");
		int i=1;
		for(Phonebook imsi:list) {
			System.out.printf("%d %s %s %s \n", 
					i++,imsi.name,imsi.hp,imsi.memo);	
		}
		System.out.println("-------------------");
	}
	
	UpdatePhonebook updateInput() {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("수정 전화번호를 입력하세요.");
		String search=scan.next();
		
		Phonebook phonebook=new Phonebook();
		
		System.out.println
		("변경할 이름을 입력하세요.(변경사항 없으면 x를 입력하세요)");
		String name=scan.next();
		if(!name.equals("x")) phonebook.name=name;
		else phonebook.name="";
		
		System.out.println
		("변경할 전화번호를 입력하세요.(변경사항 없으면 x를 입력하세요)");
		String hp=scan.next();
		if(!hp.equals("x")) phonebook.hp=hp;
		else phonebook.hp="";
		
		System.out.println
		("변경할 메모를 입력하세요.(변경사항 없으면 x를 입력하세요)");
		String memo=scan.next();
		if(!memo.equals("x")) phonebook.memo=memo;
		else phonebook.memo="";
		
		return new UpdatePhonebook(search,phonebook);
	}

	public void dataLoad(File file) {
		
				if(file.exists()) {
					pb=new Phonebook[size]; //공통적인 부분은 밖으로 빼고 else삭제 가능
					index=0;
					//파일이 존재하면 파일의 내용을 읽어 
					//데이터 객체에 값을 입력하여 객체생성
					//File->FileReader->BufferedReader->문자파싱->객체 생성
					try {
					BufferedReader br
					=new BufferedReader(new FileReader(file));
					
					String imsi="";
					while((imsi=br.readLine())!=null){
						String[] p=imsi.split(" ");
						//위의 데이터를 입력하여 객체를 만들어져야함
						pb[index++]=new Phonebook(p[0], p[1], p[2]);
					}
					
					}catch(Exception e) {}
					finally {}
					
					
				}
		
	}
	
	
	
	
}
