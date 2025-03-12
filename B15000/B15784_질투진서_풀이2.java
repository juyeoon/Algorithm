import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 풀이 2: 진서의 자리를 (a,b)라고 했을 때, (a,0)~(a,N), (0,b)~(N,b) 확인
public class B15784_질투진서_풀이2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // N행 N열
		int a = Integer.parseInt(st.nextToken()); // 진서 자리(a, b)
		int b = Integer.parseInt(st.nextToken());
		int[][] chair = new int[N + 1][N + 1]; // 매력 지수 배열
		for (int i = 1; i <= N; i++) { // chair[][] 채우기
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				chair[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		boolean angry = false; // 더 잘생긴 사람 존재 여부(true: 존재)
		for (int i = 1; i <= N; i++) { // (a,i), (i,b) 동시 확인
			if (chair[a][i] > chair[a][b] || chair[i][b] > chair[a][b]) { // 매력지수가 더 높은 사람이 있으면
				angry = true;
				break; // 더 이상 확인 안 함
			}
		}
		System.out.println(angry ? "ANGRY" : "HAPPY"); // 출력
		br.close();
	}
}