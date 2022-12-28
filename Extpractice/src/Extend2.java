class A {
	public A() {
		System.out.println("A클래스 입니다.");
	}
}
class AA extends A{
	public AA() {
		System.out.println("AA클래스 입니다.");
	}
}
public class Extend2 {

	public static void main(String[] args) {
		new AA();
		//자식을 먼저 호출 했더라도 부모가 먼저 호출된다.

	}

}
