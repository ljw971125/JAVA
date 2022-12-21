
public class Cookie {
    //클래스는 변수(속성)와 함수로 구성
	//속성은 데이터를 저장하는 역할
	String name;//이름을 저장할 공간
//생성자 함수
public Cookie() {}
//생성자 함수
public Cookie(String name) {
	this.name=name;
}
//함수는 기능적인 동작을 하는 역할
public void walk() {
	System.out.println(name+"쿠키 걷기");	
}
public void run() {
	System.out.println(name+"쿠키 달리기");
}

}