import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 한 줄의 수를 비교하여 이긴 횟수를 저장 후 출력
public class B5523_경기_결과 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()); // 경기 횟수
		int A = 0; // A가 이긴 횟수
		int B = 0; // B가 이긴 횟수
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); // A의 점수
			int b = Integer.parseInt(st.nextToken()); // B의 점수
			if (a > b) { // A의 점수가 더 클 때
				A++;
			} else if (a < b) { // B의 점수가 더 클 때
				B++;
			}
		}
		System.out.println(A + " " + B); // 이긴 횟수 출력
		br.close();
	}
}