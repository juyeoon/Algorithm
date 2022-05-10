import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 공약수로 계속해서 나눠가는 방식으로 구함
public class B1934_최소공배수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken()); // 수 A
			int B = Integer.parseInt(st.nextToken()); // 수 B
			boolean end1 = false; // A와 B를 공약수로 그만 나누기 위해 사용 (true: 그만 나눔)
			int temp = 1; // 공약수들의 곱
			while (!end1) { // A와 B를 공약수로 나눔
				int min = Math.min(A, B); // A와 B의 공약수는 A와 B 두 수 중 최소값 이하임
				boolean end2 = true; // end1을 설정하기 위한 조건(true: 아래 반복문(for문)에서 걸리지 않고 내려감)
				for (int i = min; i >= 2; i--) { // 공약수를 찾고 A와 B를 공약수로 나누는 것을 반복
					if (A % i == 0 && B % i == 0) { // i가 공약수이면
						temp *= i; // temp에 i를 곱함
						A /= i; // A를 i로 나눔
						B /= i; // B를 i로 나눔
						end2 = false; // 공약수를 찾음
						break;
					}
				}
				if (end2) { // 공약수를 못 찾으면 나누기 작업 끝(end1을 true로)
					end1 = true;
				}
			}
			sb.append(temp * A * B).append("\n"); // 공약수들의 곱 * A * B = 최소공배수
		}
		System.out.println(sb);
		br.close();
	}
}
