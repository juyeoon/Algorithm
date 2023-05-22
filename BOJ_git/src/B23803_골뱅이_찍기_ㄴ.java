import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 받은 수(N)에 따라서 기둥과 바닥을 반복문으로 출력
public class B23803_골뱅이_찍기_ㄴ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 입력 받은 수
		for (int i = 0; i < N * 4; i++) { // 기둥
			for (int j = 0; j < N; j++) {
				sb.append("@");
			}
			sb.append("\n");
		}
		for (int i = 0; i < N; i++) { // 바닥
			for (int j = 0; j < N * 5; j++) {
				sb.append("@");
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}