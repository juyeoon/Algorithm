import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// (전체 다리 수) = 1 * (다리가 잘린 닭의 수) + 2 * (다리가 2마리인 닭) 
// => (다리가 잘린 닭의 수) = (전체 다리 수) - 2 * (다리가 2마리인 닭) 
// => (다리가 잘린 닭의 수) = 
public class B11006_남욱이의_닭장 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 모든 닭 다리 수의 합
			int M = Integer.parseInt(st.nextToken()); // 닭의 다리의 수 합
			int U = 2 * M - N; // 다리가 잘린 닭의 수
			sb.append(U).append(" ").append(M - U).append("\n"); // 잘린 닭의 수 + " " + 다리가 다 있는 닭의 수
		}
		System.out.println(sb); // 출력
		br.close();
	}
}