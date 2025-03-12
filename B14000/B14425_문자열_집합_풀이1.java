import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 풀이 1: 집합 S를 String 배열에 저장후 String.equals()로 문자열 비교
// 시간복잡도: O(N*M) 실제 시간: 4816ms
public class B14425_문자열_집합_풀이1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 집합 S의 문자열 개수
		int M = Integer.parseInt(s[1]); // 검사해야하는 문자열 개수
		String[] S = new String[N]; // 집합 S
		for (int i = 0; i < N; i++) { // S[] 채우기
			S[i] = br.readLine();
		}
		int cnt = 0; // 집합 S에 포함되어 있는 것 개수
		for (int i = 0; i < M; i++) { // 입력 문자열 검사
			String tmp = br.readLine(); // 입력 문자열
			for (int j = 0; j < N; j++) { // 집합 S 순회
				if (tmp.equals(S[j])) { // 같은 것이 있으면
					cnt++; // 카운트
					break;
				}
			}
		}
		System.out.println(cnt); // 카운트 출력
		br.close();
	}
}
