import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이전 값을 저장한 후 현재 값과 비교하여 이전 값이 더 크면 비내림차순이 아님
public class B14910_오르막 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = st.countTokens(); // 정수 개수
		boolean good = true; // 비내림차순 여부(true: 비내림차순)
		int pv = Integer.parseInt(st.nextToken()); // 이전 값
		for (int i = 1; i < N; i++) {
			int A = Integer.parseInt(st.nextToken()); // 현재 값
			if (pv > A) { // 이전 값이 현재 값보다 크면
				good = false; // 비내림차순이 아님
				break; // 반복문 탈출
			}
			pv = A; // 이전 값 갱신
		}
		System.out.println(good ? "Good" : "Bad"); // 출력
		br.close();
	}
}
