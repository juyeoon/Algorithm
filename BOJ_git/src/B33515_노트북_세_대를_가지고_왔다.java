import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/33515
// 주어진 두 시간의 최솟값보다 작거나 같아야 하므로 최댓값(정답)은 입력의 최솟값과 같음
public class B33515_노트북_세_대를_가지고_왔다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T1 = Integer.parseInt(st.nextToken()); // 시간 1
		int T2 = Integer.parseInt(st.nextToken()); // 시간 2
		System.out.println(Math.min(T1, T2)); // 최소 시간 출력
		br.close();
	}
}
