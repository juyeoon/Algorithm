import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 터널 안 차량 수 = 터널 안에 있던 차량 수 + 들어가는 차량 수 - 나가는 차량 수
// 터널 안에 있던 차량 수 + 들어가는 차량 수 < 나가는 차량 수 => 터널 안 차량 수가 0보다 작음
// 매 분 (최대 터널 안 차량 수) 갱신
public class B5612_터널의_입구와_출구 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine()); // 조사 시간
		int Sj = Integer.parseInt(br.readLine()); // 조사 시작 시 터널 안 차량 수
		int maxSj = Sj; // 최대 터널 안 차량 수
		boolean zero = false; // 터널 안 차량수가 0보다 작은지 아닌지 확인(true: 작음)
		for (int tc = 0; tc < n; tc++) {
			st = new StringTokenizer(br.readLine());
			int in = Integer.parseInt(st.nextToken()); // 들어가는 차량 수
			int out = Integer.parseInt(st.nextToken()); // 나가는 차량 수
			if (in + Sj < out) { // 터널 안에 있던 차량 수 + 들어가는 차량 수 < 나가는 차량 수 => 터널 안 차량 수가 0보다 작음
				zero = true;
				break; // 반복문 탈출
			}
			Sj = in + Sj - out; // 터널 안 차량 수 갱신
			maxSj = Math.max(maxSj, Sj); // 최대 터널 안 차량 수 갱신
		}
		System.out.println(zero ? "0" : maxSj); // 출력
		br.readLine();
	}
}