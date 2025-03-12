import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 입력에 현재 공 위치가 있으면 공 위치를 다른 입력으로 변경
public class B1547_공 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()); // 위치 변경 횟수
		int ball = 1; // 공의 현재 위치
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			// 입력 중 하나와 같으면 다른 입력으로 변경
			if (a == ball) {
				ball = b;
			} else if (b == ball) {
				ball = a;
			}
		}
		System.out.println(ball); // 현재 위치 출력
		br.close();
	}
}