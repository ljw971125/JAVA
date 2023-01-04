import java.io.IOException;

public class FW3 {
//변수의 상태 변화를 통한 제어문
	public static void main(String[] args) throws IOException {
		int state=1;
		while(state==1) {
			char op = (char)
					System.in.read();
			
			if(op=='q')
				state=0;
			System.out.println("hello");
		}
		System.out.println("반복문 밖");

	}

}
