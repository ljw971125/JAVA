
public class Calculator {
	public float result;
	
	public static 
    int add(int x,int y) {
		int result=x+y;
		return result;
	}
	int sub(int x, int y) {
		result=x-y;
		return x-y;
	}
	
	int mux(int x, int y) {
		result=x*y;
		return x*y;
	}
	float div(int x,int y) {
		result=(float)x/y;
		return (float)x/y;//소수가 나올수 있기때문에 float
	}
	
	void lastResult() {
		System.out.println("마지막 연산값:"+result);
	}
	float opcal(int x, char op, int y) {
		
		//컴퓨터가 연산자 구분, 결과값을 저장할 변수
		//구분은 조건문이 필요
		//결과는 변수가 필요
		if(op=='+') {
			result=x+y;
			return add(x,y);
	}else if(op=='-') {
		result=x-y;
		return x-y;
	}else if(op=='*') {
		result=x*y;
		return x*y;
	}else if(op=='/') {
		result=(float)x/y;
		return (float)x/y;
	}else {
		return 0;
	}
	
	}

}
