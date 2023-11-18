import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// h(높이)와 w(폭)의 곱(넓이)가 가장 큰 값 출력
public class B28490_Area {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()); // 입력 라인 개수
		int max = 0; // 넓이 최댓값
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken()); // 높이
			int w = Integer.parseInt(st.nextToken()); // 폭
			max = Math.max(max, h * w); // 최댓값 갱신
		}
		System.out.println(max); // 출력
		br.close();
	}
}