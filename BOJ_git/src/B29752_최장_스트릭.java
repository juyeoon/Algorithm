import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/29752
// 0이 나올 때까지 현재 스트릭을 카운팅 하다가 0이 나오면 그때의 최댓값 확인하여 갱신하고 현재 스트릭을 0으로 리셋
// 반복문이 끝나고도 최댓값을 한 번 확인하여 갱신 필요. 마지막 현재 스트릭은 최장 스트릭에 적용이 안 됐기 때문
public class B29752_최장_스트릭 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // N일
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ans = 0; // 최장 스트릭
		int tmp = 0; // 현재 스트릭
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(st.nextToken()); // 푼 문제 개수
			if (x == 0) { // 푼 문제가 0이면
				ans = Math.max(ans, tmp); // 최댓값 갱신
				tmp = 0; // 현재 스트릭 리셋
			} else { // 푼 문제가 있으면
				tmp++; // 현재 스트릭 카운트
			}
		}
		ans = Math.max(ans, tmp); // 반복문이 끝나고 한 번 더 최댓값 갱신
		System.out.println(ans); // 출력
		br.close();
	}
}
