import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 100 x 100 배열을 사용하여 각 그림 위에 올라가 있는 종이의 수를 저장한 후 M보다 큰 그림의 개수를 계산
// 가리는 종이의 왼쪽 아래 모서리 좌표가 (x1, y1), 오른쪽 위 모서리 좌표가(x2, y2)일 때
// 종이의 범위는 [x1, x2](행), [y1, y2](열)
public class B1531_투명 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int painting[][] = new int[101][101]; // 그림 배열
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 가리는 종이 개수
		int M = Integer.parseInt(st.nextToken()); // 안보이게 되는 종이의 개수
		for (int k = 0; k < N; k++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			for (int i = x1; i <= x2; i++) { // 가리는 종이의 범위에 1씩 더하기
				for (int j = y1; j <= y2; j++) {
					painting[i][j]++;
				}
			}
		}
		int cnt = 0; // 안 보이는 그림의 개수
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				if (painting[i][j] > M) { // M보다 크면 안 보임
					cnt++;
				}
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
