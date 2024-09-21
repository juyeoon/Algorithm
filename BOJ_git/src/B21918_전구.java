import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 명령어 번호에 맞게 명령어 단순 구현
public class B21918_전구 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 전구의 개수
		int M = Integer.parseInt(st.nextToken()); // 명령어의 개수
		st = new StringTokenizer(br.readLine());
		int light[] = new int[N + 1]; // 전구의 상태
		for (int i = 1; i <= N; i++) { // 현재 전구 상태를 저장
			light[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < M; i++) { // 명령어
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); // 명령어 번호
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if (a == 1) { // 1번 명령어
				light[b] = c;
			} else if (a == 2) { // 2번 명령어
				for (int j = b; j <= c; j++) {
					light[j] = light[j] == 0 ? 1 : 0;
				}
			} else if (a == 3) { // 3번 명령어
				for (int j = b; j <= c; j++) {
					light[j] = 0;
				}
			} else { // 4번 명령어
				for (int j = b; j <= c; j++) {
					light[j] = 1;
				}
			}
		}
		for (int i = 1; i <= N; i++) { // 전구 상태 출력 저장
			sb.append(light[i]).append(" ");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}