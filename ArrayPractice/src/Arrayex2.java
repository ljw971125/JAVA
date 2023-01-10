
public class Arrayex2 {

	public static void main(String[] args) {
		String[] lang = new String[3]; //3개의 배열공간을 생성
		lang[0] = "JAVA";//첫번째 자리에 JAVA라는 글씨를 넣음
		lang[1] = "C#";
		lang[2] = "C";
		String[] script = new String[3];
		script[0]="JSP";
		script[1]="ASP.NET";
		script[2]="PHP";
		String[] dbms = {"Oracle","ms-sql","ms-sql"};
		
		for(int i = 0; i <= 2; i++) {
			System.out.println(lang[i]+"-"+script[i]+"-"+dbms);
		}

	}

}
