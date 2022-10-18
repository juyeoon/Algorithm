import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 입력 받은 두 수를 더한 값을 출력
public class B9295_주사위 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			// 입력 받은 두 수를 더한 값을 출력 형식에 맞게 출력
			sb.append("Case ").append(tc).append(": ")
					.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}