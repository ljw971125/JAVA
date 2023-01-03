
public class FW1 {

	public static void main(String[] args) {
		int dan = 2;
		int r = 0;
		
		while(dan<=9) {//그다음 이거 반복
			int i = 1;
			while(i<10) {//이거 먼저 9번 반복
				r=dan*i;
				System.out.println(dan+"*"+i+"="+r);
				i++;
			}
			dan++;
		}

	}

}
