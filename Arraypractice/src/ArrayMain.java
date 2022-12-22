
public class ArrayMain {

	public static void main(String[] args) {
		Array[] p=new Array[3];//Array클래스에서 가져온 배열 생성
		for(int i=0; i<3; i++)
			p[i]=new Array();//지정한 개수의 넣을 수 있는 공간 생성
		p[0].setData("김하나","010-1111-1111",22);
		p[1].setData("이두나","010-2222-2222",24);
		p[2].setData("박세나","010-3333-3333",25);
		//Array클래스에서 만든 setData틀에 정보를 쓴다
		System.out.println("이름      전화번호    나이");
		//결과값 틀에 위치를 맞추기 위해 띄어?쓰기로 맞춤
		for(int i=0; i<3; i++) {
			p[i].info();
			//Array클래스에서 print틀 가져옴
		}
		

	}

}
