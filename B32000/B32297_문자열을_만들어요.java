import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/32297
// indexOf으로 문자열이 포함되어 있는지 확인
public class B32297_문자열을_만들어요 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine(); // 주어진 문자열
		int idx = S.indexOf("gori"); // "gori" 포함 여부
		System.out.println(idx != -1 ? "YES" : "NO"); // 출력
		br.close();
	}
}
