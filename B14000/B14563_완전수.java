import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14563
// 각 테스트케이스에 대해 진약수의 합을 구한 후 완전수인지, 부족수인지, 과잉수인지를 구함
// 진약수 구하는 방법: 2부터 sqrt(N)까지 나머지가 있는지 확인
// 주의 할 점: N==1일 때 sum은 0, N>=2일 때 sum에 1을 더해줘야함(1은 약수인지 확인하지 않기 때문)
public class B14563_완전수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(st.nextToken()); // 자연수 N
			int sum = 0; // 진약수의 합
			if (N != 1) { // 1 이상이면 약수 1을 더해줌
				sum += 1;
			}
			int end = (int) Math.sqrt(N); // 반복문 종료 조건
			for (int i = 2; i <= end; i++) {
				if (N % i == 0) { // 약수면
					sum += i;
					if (N / i != i) { // 중복되지 않는 약수면
						sum += N / i;
					}
				}
			}
			if (sum == N) { // 완전수
				sb.append("Perfect");
			} else if (sum < N) { // 부족수
				sb.append("Deficient");
			} else { // 과잉수
				sb.append("Abundant");
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
