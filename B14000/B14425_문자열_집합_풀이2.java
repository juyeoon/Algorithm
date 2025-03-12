import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 풀이 2: 집합 S를 Set에 저장후 Set.contains()로 문자열 비교
// 시간복잡도: O(N+M) 실제 시간: 324ms
public class B14425_문자열_집합_풀이2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 집합 S의 문자열 개수
		int M = Integer.parseInt(s[1]); // 검사해야하는 문자열 개수
		Set<String> set = new HashSet<>(); // 집합 S
		for (int i = 0; i < N; i++) { // set 채우기
			set.add(br.readLine());
		}
		int cnt = 0; // 집합 S에 포함되어 있는 것 개수
		for (int i = 0; i < M; i++) { // 입력 문자열 검사
			if (set.contains(br.readLine())) { // set에 같은 것이 있으면
				cnt++; // 카운트
			}
		}
		System.out.println(cnt); // 카운트 출력
		br.close();
	}
}
