import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피카츄가 발음할 수 있는 음절을 지운 후 나머지가 있으면 NO, 없으면 YES
public class B14405_피카츄 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
//		첫 번째 시도 - replace로 문자열 지우기
//		실패 이유: 먼저 지워진 문자에 따라 뒤에 문자가 지워지는 문제 발생
//		ex) kpia => 다 사라짐
//		s = s.replace("pi", "");
//		s = s.replace("ka", "");
//		s = s.replace("chu", "");

//		두 번째 시도 - replaceAll로 문자열지우기
//		성공 이유: 모든 경우를 한번에 처리하기 때문에 의도한대로 돌아감
		s = s.replaceAll("pi|ka|chu", "");
		
		System.out.println(s.equals("") ? "YES" : "NO"); // 출력
		br.close();

	}
}