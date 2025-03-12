import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1541
// 더하기와 빼기만 있는 식에서 괄호를 사용해서 최솟값읆 만드는 방법은
// 빼기를 기준으로 덧셈만 있는 항들을 괄호로 묶어서 최댓값을 빼는 방법
// -를 기준으로 나누고 나눠진 덧셈식의 값을 구하고 첫 번째 덧셈식만 더하고 두 번째 덧셈식부터는 결과값에서 빼기
// (+++...)-(+++...)-....-(+++...)
public class B1541_잃어버린_괄호 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "-"); // 빼기를 기준으로 자르기
		int cntT = st.countTokens(); // 반복 개수
		int ans = 0; // 출력값
		for (int i = 0; i < cntT; i++) {
			int tmp = 0; // 괄호 안 덧셈 값
			StringTokenizer stplus = new StringTokenizer(st.nextToken(), "+"); // 더하기를 기준으로 자르기
			int cntP = stplus.countTokens(); // 항 개수
			for (int j = 0; j < cntP; j++) { // 덧셈 구하기
				tmp += Integer.parseInt(stplus.nextToken());
			}
			if (i == 0) { // 가장 첫번째 덧셈 덩어리는 정답에 더하기
				ans += tmp;
			} else { // 두번쨰 덧셈 덩어리부터는 정답에서 빼기
				ans -= tmp;
			}
		}
		System.out.println(ans); // 출력
		br.close();
	}
}
