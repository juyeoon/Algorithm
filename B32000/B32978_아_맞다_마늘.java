import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/32978
// 모든 재료를 Set에 저장
// 사용한 재료를 Set에서 제거
// Set에 남은 1개의 재료가 빠뜨린 재료이므로 출력
public class B32978_아_맞다_마늘 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()); // 모든 재료
		Set<String> set = new HashSet<>();
		for (int i = 0; i < N; i++) {
			set.add(st.nextToken());
		}
		st = new StringTokenizer(br.readLine()); // 사용한 재료
		for (int i = 0; i < N - 1; i++) {
			set.remove(st.nextToken());
		}
		for (String missing : set) { // 남아 있는 재료가 빠진 재료
			System.out.println(missing);
			break;
		}
		br.close();
	}
}
