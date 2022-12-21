package Study;
//메인 밑준비
public class Sungjuk {
int kor;
int eng;
int math;
String name;
String id;

public Sungjuk(int kor, int eng, int math, String name, String id) {
	this.kor=kor;
	this.eng=eng;
	this.math=math;
	this.name=name;
	this.id=id;
	}
public void info() {
	System.out.println("국어:"+kor);
	System.out.println("영어:"+eng);
	System.out.println("수학:"+math);
	System.out.println("이름:"+name);
	System.out.println("학번:"+id);
	System.out.println("합계:"+(kor+eng+math));
}
}
