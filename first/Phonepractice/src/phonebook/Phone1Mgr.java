package phonebook;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Phone1Mgr {
	Phone1[] pb;//=new Phone1[100];
	private int size=100;
	//private int index=0;
	int index=0;
	
	public Phone1Mgr() {
		pb=new Phone1[100];//100개의 행렬을 생성
	}
	
	public Phone1Mgr(int size) {
	this.size=size;
	pb=new Phone1[size];
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
		System.out.println("9.프로그램 종료");
		System.out.println("-------------------");
		
		Scanner scan=new Scanner(System.in);
		return scan.nextInt();
	}
	
	//입력 // insert(String name, String hp, String memo);
	
	int insert(Phone1 Phone1) {
		pb[index]=new Phone1();
		pb[index].name=Phone1.name;
		pb[index].hp=Phone1.hp;
		pb[index].memo=Phone1.memo;
		index++;
		//try {}catch(Exception e) {return 0;}
		return 1;
	}
	
	//전체출력
	List<Phone1> selectAll() {
		List<Phone1> list=new ArrayList<Phone1>();
		
		for(int i=0;i<index;i++) {
		if(pb[i]!=null)	list.add(pb[i]);
		}
		
		return list;
	}
	
	//선택출력(필요한산 사항:핸드폰 번호-hp==search))
	Phone1 selectByhp(String hp) {
		int k=0;
		Phone1 Phone1=new Phone1();
		//if(isObject(hp)) {
			for(k=0;k<index;k++) {
				if(pb[k]!=null) {
					if(hp.equals(pb[k].hp)) {
						Phone1.name=pb[k].name;
						Phone1.hp=pb[k].hp;
						Phone1.memo=pb[k].memo;
						break;
					}
				}
			}
			if(k==index){
				//System.out.println("찾는 데이터가 없습니다.");
				Phone1=null;
			}
		//}
		
		return Phone1;
	}
	
	//선택수정
	int updateByhp(String hp,Phone1 Phone1) {
		int k=0;
		for(k=0;k<index;k++) {
			if(pb[k]!=null) {
				if(hp.equals(pb[k].hp)) {
					if(!Phone1.name.equals(""))
						pb[k].name=Phone1.name;
					if(!Phone1.hp.equals(""))
						pb[k].hp=Phone1.hp;
					if(!Phone1.memo.equals(""))
						pb[k].memo=Phone1.memo;
				
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
		return "Phone1Mgr [pb=" + Arrays.toString(pb) + ", size=" + size + ", index=" + index + "]";
	}
	
	//upgrade
	
	Phone1 insertInput() {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name=scan.next();
		
		System.out.println("전화번호를 입력하세요.");
		String hp=scan.next();
		
		System.out.println("메모를 입력하세요.");
		String memo=scan.next();
		
		return new Phone1(name, hp,memo);
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
	
	void allPrint(List<Phone1> list) {
		System.out.println("-------------------");
		System.out.println("번호 이름 전화번호 메모");
		System.out.println("-------------------");
		int i=1;
		for(Phone1 imsi:list) {
			System.out.printf("%d %s %s %s \n", 
					i++,imsi.name,imsi.hp,imsi.memo);	
		}
		System.out.println("-------------------");
	}
	
	UpdatePhone1 updateInput() {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("수정 전화번호를 입력하세요.");
		String search=scan.next();
		
		Phone1 Phone1=new Phone1();
		
		System.out.println
		("변경할 이름을 입력하세요.(변경사항 없으면 x를 입력하세요)");
		String name=scan.next();
		if(!name.equals("x")) Phone1.name=name;
		else Phone1.name="";
		
		System.out.println
		("변경할 전화번호를 입력하세요.(변경사항 없으면 x를 입력하세요)");
		String hp=scan.next();
		if(!hp.equals("x")) Phone1.hp=hp;
		else Phone1.hp="";
		
		System.out.println
		("변경할 메모를 입력하세요.(변경사항 없으면 x를 입력하세요)");
		String memo=scan.next();
		if(!memo.equals("x")) Phone1.memo=memo;
		else Phone1.memo="";
		
		return new UpdatePhone1(search,Phone1);
	}
	
	
	
	
}
