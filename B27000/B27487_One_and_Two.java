import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/27487
// 1과 2로 이루어진 수열이 있을 때 a_1*a_2*...*a_k = a_(k+1) * a_(k+2) * ... * a_n이 같게 하는 k의 최소를 구하는 문제
// 곱셈에 1은 영향이 없기 때문에 전체 수열의 2의 개수를 구하고 
// 2의 개수가 홀수면 어떤 k든 성립할 수 없음
// 2의 개수가 짝수면 다시 전체 수열을 순회하면서 2가 나오면 카운트하여 카운트와 2의 개수를 2로 나눈 값과 같아진 값이 k의 최솟값
public class B27487_One_and_Two {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 항 개수
			StringTokenizer st = new StringTokenizer(br.readLine());
			boolean a[] = new boolean[N + 1]; // true: 2, false: 1
			int twoCnt = 0; // 2의 개수
			for (int i = 1; i <= N; i++) { // 2의 개수 세기
				if (Integer.parseInt(st.nextToken()) == 2) {
					a[i] = true;
					twoCnt++;
				}
			}
			if (twoCnt % 2 == 1) { // 2가 홀수개면 불가능
				sb.append("-1\n");
			} else { // 2가 짝수개면
				// 전체 수열을 순회하면서 2가 나오면 카운트하여
				// 카운트와 2의 개수를 2로 나눈 값과 같아진 값이 k의 최솟값
				twoCnt /= 2;
				int idx = 0;
				if (twoCnt == 0) {
					idx = 1;
				}
				while (twoCnt > 0) {
					if (a[++idx]) {
						twoCnt--;
					}
				}

				sb.append(idx).append("\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
