import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이차원 배열을 사용하여 모습을 저장한 수 출력할 때 조작ㄴ
public class B11586_지영_공주님의_마법_거울 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 모습 배열 저장
		char mirror[][] = new char[N][N];
		for (int i = 0; i < N; i++) { // input mirror (모습 저장)
			String s = br.readLine();
			for (int j = 0; j < N; j++) {
				mirror[i][j] = s.charAt(j);
			}
		}
		int K = Integer.parseInt(br.readLine()); // 심리 상태
		if (K == 1) { // 모습을 그대로 표현
			for (int i = 0; i < N; i++) { // 상 부터
				for (int j = 0; j < N; j++) { // 좌 부터
					sb.append(mirror[i][j]);
				}
				sb.append("\n");
			}
		} else if (K == 2) { // 좌/우 반전된 모습 표현
			for (int i = 0; i < N; i++) { // 상 부터
				for (int j = N - 1; j >= 0; j--) { // 우 부터
					sb.append(mirror[i][j]);
				}
				sb.append("\n");
			}
		} else { // 상/하 반전된 모습 표현
			for (int i = N - 1; i >= 0; i--) { // 하 부터
				for (int j = 0; j < N; j++) { // 좌 부터
					sb.append(mirror[i][j]);
				}
				sb.append("\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}