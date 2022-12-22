package forwhile;

public class For5 {

	public static void main(String[] args) {
		//100번을 반복한 1에서 100까지의 홀수와 짝수의 합을 각각 구하세요
		int odd=0;
		int even=0;
		for(int i=1; i<=100; i++) {
			if(i%2==1)
				odd=odd+i;
			else if (i%2==0)
				even=even+i;
		}
		System.out.println("홀수의 합은:"+odd);
		System.out.println("짝수의 합은:"+even);
	}

}
