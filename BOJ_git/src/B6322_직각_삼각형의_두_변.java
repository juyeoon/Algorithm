import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B6322_직각_삼각형의_두_변 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		int tc = 0; // 테스트케이스
		while (!(s = br.readLine()).equals("0 0 0")) { // EOI
			sb.append("Triangle #").append(++tc).append("\n");
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken()); // 빗변이 아닌 변
			int b = Integer.parseInt(st.nextToken()); // 빗변이 아닌 변
			int c = Integer.parseInt(st.nextToken()); // 빗변
			boolean isPossible = false; // 가능 여부(true: 가능)
			double ans = 0; // 알 수 없는 변의 길이
			if (a == -1) { // a가 알 수 없으면
				ans = Math.sqrt(c * c - b * b); // a값 계산
				if (ans < c && ans + b > c) { // 빗변보다 짧고 삼각형 생성 조건이 만족하면
					isPossible = true; // 직각 삼각형 가능
					sb.append("a = ").append(String.format("%.3f", ans)); // 길이 출력 저장
				}
			} else if (b == -1) { // b가 알 수 없으면
				ans = Math.sqrt(c * c - a * a); // b값 계산
				if (ans < c && a + ans > c) { // 빗변보다 짧고 삼각형 생성 조건이 만족하면
					isPossible = true; // 직각 삼각형 가능
					sb.append("b = ").append(String.format("%.3f", ans)); // 길이 출력 저장
				}
			} else { // c가 알 수 없으면
				ans = Math.sqrt(a * a + b * b); // c값 계산
				if (a < ans && b < ans && a + b > ans) { // 빗변 아닌 변들보다 길고 삼각형 생성 조건이 만족하면
					isPossible = true; // 직각 삼각형 가능
					sb.append("c = ").append(String.format("%.3f", ans)); // 길이 출력 저장
				}
			}
			if (!isPossible) { // 불가능하면
				sb.append("Impossible.");
			}
			sb.append("\n\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}