import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 반복문으로 더하기
public class B9085_더하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 숫자 개수
			st = new StringTokenizer(br.readLine());
			int sum = 0; // 합
			for (int i = 0; i < N; i++) {
				sum += Integer.parseInt(st.nextToken()); // 더하기
			}
			sb.append(sum).append("\n"); // sb에 추가
		}
		System.out.println(sb); // 출력
		br.close();
	}
}