
public class Arrayex3 {

	public static void main(String[] args) {
		String[] label  = {"이름", "전화번호", "나이"};//배열들을 추가
		String[] name = {"김하나", "이두나", "박세나"};
		String[] tel = {"010-1111-1111", "010-2222-2222","010-3333-3333"};
		int[] age= {22,25,30};
		
		for(int i=0; i<3; i++) {
			System.out.print(label[i]+" "+name[i]+" "+tel[i]);//위에서 추가한 배열을 나열
	}
		/*
		System.out.println();
	for(int i=0; i<3; i++) {
		System.out.println(label[i]+" "+name[i]+" "+tel[i]);//줄을 바꿔서 보기 편하게 추출
	}
	*/
		}

	}


