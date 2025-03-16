import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/33571
// if문으로 문자마다의 구멍 개수를 정해놓고 반복문을 돌면서 계산
public class B33571_구멍 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 문자열
		int cnt = 0; // 구멍의 개수
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'B') { // 구멍 2개 문자
				cnt += 2;
			} else if (c == 'A' || c == 'a' || c == 'b' || c == 'D' || c == 'd' || c == 'e' || c == 'g' || c == 'O'
					|| c == 'o' || c == 'P' || c == 'p' || c == 'Q' || c == 'q' || c == 'R' || c == '@') { // 구멍 1개 문자
				cnt++;
			}
		}
		System.out.println(cnt); // 개수 출력
		br.close();
	}
}
