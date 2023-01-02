
public class Forpractice4 {

	public static void main(String[] args) {
		int odd=0;
		for(int i = 1; i<= 100; i++) {
			if(i%2==1)//i를 2로 나눈 나머지값이 1
				odd=odd+i;
		}
		System.out.println(odd);

	}

}
