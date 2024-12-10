import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/32929
// UOS의 길이인 3으로 나눈 나머지가 0이면 S, 1이면 U, 2이면 O 출력
public class B32929_UOS_문자열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 입력 수
		String s[] = { "S", "U", "O" }; // 나머지 값에 해당하는 문자
		System.out.println(s[N % 3]); // 3으로 나눈 나머지 값에 해당하는 문자 출력
		br.close();
	}
}
