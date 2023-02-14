
//인터페이스=구현되지 않은 함수의 집합
import java.awt.Frame;
class MWin{
	
}
//final=이 클래스가 마지막이다(상속x)
//extends=확장 implements=(완성되지 않은 클래스를)구현
final class MyWin extends Frame{//MyWin에 상속(Frame->MyWin)
	//상속은 하나의 클래스에서 한번만 할 수 있음
	//MyWin의 조상은 Object(MyWin<Frame<Object)
	public MyWin() {
		//내부에서 이 함수를 가져옴
		setBounds(100, 100, 200, 200);//창의 크기
		setVisible(true);//보이게 해주는 명령어
	}
	
	
}

public class Extend1 {

	public static void main(String[] args) {
		new MyWin();
		/*
		Frame f = new Frame();
		f.setBounds(100, 100, 200, 200);
		f.setVisible(true);
*/
	}

}
