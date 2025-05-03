import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/29720
// 남은 문제 최댓값  = (풀어야 할 문제 수) - (하루에 풀어야 할 문제 수  * (최대 일 수 - 1) + 마지막 날에 한 문제만 푸는 경우)
// 남은 문제 최솟값  = (풀어야 할 문제 수) - (하루에 풀어야 할 문제 수  * (최대 일 수 - 1) + 마지막 날에 최대로 문제를 푸는 경우)
public class B29720_그래서_님_푼_문제_수가 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 풀어야 할 문제 수
		int M = Integer.parseInt(st.nextToken()); // 하루에 풀어야 할 문제 수
		int K = Integer.parseInt(st.nextToken()); // 최대 일 수
		int max = N - (M * (K - 1) + 1); // 남은 문제 최댓값
		int min = N - (M * K); // 남은 문제 최솟값
		if (min < 0) { // 최솟값이 음수면 0 처리
			min = 0;
		}
		System.out.println(min + " " + max); // 출력
		br.close();
	}
}
