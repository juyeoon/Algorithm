import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/16546
// 1에서 N번까지 마라톤 참가자가 있고 N-1개의 결승선을 통과한 참가자의 번호가 주어졌을 때 통과하지 않은 한 번호를 찾는 문제
// boolean 배열로 각 번호의 참가자가 결승선을 통과했는지 여부를 저장 후 다른 값을 가지는 하나의 인덱스를 출력
public class B16546_Missing_Runners {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 마라톤 참가자 수
		boolean runner[] = new boolean[N + 1]; // 결승선 통과한 참가자 확인용 배열
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i < N; i++) { // 배열 값 넣기
			runner[Integer.parseInt(st.nextToken())] = true;
		}
		int ans = 1; // 확인할 배열 인덱스
		for (; ans <= N; ans++) {
			if (!runner[ans]) { // 통과하지 않았으면
				break;
			}
		}
		System.out.println(ans); // 출력
		br.close();
	}
}
