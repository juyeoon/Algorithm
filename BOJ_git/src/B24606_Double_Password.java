import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/24606
// 첫 번째와 두 번째 비밀번호가 같은 위치는 그 숫자를 입력해야 하므로 경우의 수가 1
// 같지 않은 위치는 첫 번째 비밀번호와 두 번째 비밀번호가 모두 들어갈 수 있으므로 경우의 수가 2
// 비밀번호의 자리 수는 4개이므로 전체 경우의 수는 (2 ^ 같지 않은 위치 수)
public class B24606_Double_Password {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char s1[] = br.readLine().toCharArray(); // 첫 번째 비밀번호
		char s2[] = br.readLine().toCharArray(); // 두 번째 비밀번호
		int cnt = 0; // 동일한 자리 수 개수
		for (int i = 0; i < 4; i++) { // cnt 세기
			if (s1[i] == s2[i]) {
				cnt++;
			}
		}
		System.out.println((int) Math.pow(2, 4 - cnt)); // 출력
		br.close();
	}
}
