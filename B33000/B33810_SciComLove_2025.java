import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/33810
// 문자 하나씩 비교하면서 같은지 확인 후 같지 않으면 출력
public class B33810_SciComLove_2025 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char s[] = br.readLine().toCharArray(); // 입력 문자열
		String sci = "SciComLove"; // 기준 문자열
		int cnt = 0; // 틀린 문자 개수
		for (int i = 0; i < s.length; i++) {
			if (s[i] != sci.charAt(i)) { // 문자가 틀리면
				cnt++; // 카운트
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
