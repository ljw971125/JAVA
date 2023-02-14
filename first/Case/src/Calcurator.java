
public class Calcurator {
	//멤버 변수는 필요없음
	//기능 add(), sub(), mux(), div()
	//두 수 입력받아 결과를 리턴하는 함수를 작성하세요.
	int add(int x, int y) {
		return x+y;
	}
	int sub(int x, int y) {
		return x-y;
	}
	int mul(int x, int y) {
		return x*y;
	}
	float div(int x, int y) {
		return (float)x/y;//나눗셈을 할땐 소수점이 나올수도 있기때문에 float함수를 사용
	}

}
