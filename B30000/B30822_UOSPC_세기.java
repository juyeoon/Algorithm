import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/30822
// uospc에 동일한 문자가 없으니 입력 문자열의 uospc 알파벳 등장 횟수를 센 후 최솟값이 uospc의 최대 개수
public class B30822_UOSPC_세기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 문자열 길이
		char c[] = br.readLine().toCharArray(); // 입력 문자열
		int cnt[] = new int[5]; // uospc 알파벳 개수 저장
		for (int i = 0; i < n; i++) { // uospc 알파벳 개수 세기
			switch (c[i]) {
			case 'u':
				cnt[0]++;
				break;
			case 'o':
				cnt[1]++;
				break;
			case 's':
				cnt[2]++;
				break;
			case 'p':
				cnt[3]++;
				break;
			case 'c':
				cnt[4]++;
				break;
			}
		}
		int min = Integer.MAX_VALUE; // uospc 알파벳 개수 최솟값
		for (int i : cnt) { // 최솟값 구하기
			min = Math.min(min, i);
		}
		System.out.println(min); // 출력
		br.close();
	}
}
