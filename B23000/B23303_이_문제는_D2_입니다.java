import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// "d2" 포함 여부와 "D2" 포함 여부를 따로 저장한 후 or 연산이 참이면 "D2" 출력
public class B23303_이_문제는_D2_입니다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 입력 문자열
		boolean d2 = s.contains("d2"); // "d2" 포함 여부
		boolean D2 = s.contains("D2"); // "D2" 포함 여부
		System.out.println(d2 | D2 ? "D2" : "unrated"); // 둘 중 하나라도 포함되어 있으면 "D2" 출력
		br.close();
	}
}