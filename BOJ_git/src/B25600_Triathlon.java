import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제에 명시된대로 단순 구현
public class B25600_Triathlon {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()); // 참가자의 수
		int max = Integer.MIN_VALUE; // 최고점
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); // 애드혹 문제 해결 점수
			int d = Integer.parseInt(st.nextToken()); // 다이나믹 프로그래밍 문제 해결 점수
			int g = Integer.parseInt(st.nextToken()); // 그리디 알고리즘 문제 해결 점수
			int score = a * (d + g); // 총 점수
			if (a == d + g) { // 조건에 부합하면 2배
				score *= 2;
			}
			max = Math.max(max, score); // 최고점 갱신
		}
		System.out.println(max); // 최고점 출력
		br.close();
	}
}