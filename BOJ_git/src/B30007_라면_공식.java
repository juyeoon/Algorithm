import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제에 주어진 공식에 입력값 대입
public class B30007_라면_공식 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()); // 라면 끓이는 횟수
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken()); // 라면 계수
			int B = Integer.parseInt(st.nextToken()); // 기본 물의 양
			int X = Integer.parseInt(st.nextToken()); // 끓일 라면 수
			sb.append(A * (X - 1) + B).append("\n"); // 필요한 물의 양
		}
		System.out.println(sb); // 출력
		br.close();
	}
}