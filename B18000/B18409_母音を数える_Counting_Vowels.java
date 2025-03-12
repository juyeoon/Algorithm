import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 길이(N)만큼 돌면서 모음('a','e','i','o','u')가 있는지 확인
public class B18409_母音を数える_Counting_Vowels {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 문자열 길이
		String s = br.readLine(); // 문자열
		int cnt = 0; // 모음 개수
		for (int i = 0; i < N; i++) { // 모음 개수 세기
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				cnt++;
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}