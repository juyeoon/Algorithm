import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/28323
// 이웃한 자연수의 합이 홀수가 되려면 홀짝 or 짝홀 순서여야 함
// => 주어진 자연수 수열을 확인해가면서 홀홀 or 짝짝이 되는 자연수는 선택하지 않으면서 카운트
public class B28323_불안정한_수열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 자연수 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int last = Integer.parseInt(st.nextToken()); // 마지막으로 선택한 자연수
		int cnt = 1; // 선택한 자연수 개수
		boolean lastIsEven = (last % 2 == 0); // 마지막으로 선택한 자연수의 홀짝
		for (int i = 1; i < N; i++) {
			int now = Integer.parseInt(st.nextToken()); // 확인할 자연수
			if (lastIsEven == (now % 2 == 0)) { // 홀홀 or 짝짝이면 선택하지 않음
				continue;
			} else { // 현재 자연수를 선택
				cnt++;
				last = now;
				lastIsEven = (last % 2 == 0);
			}
		}
		System.out.println(cnt); // 개수 출력
		br.close();
	}
}
