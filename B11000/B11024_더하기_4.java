import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 단순 합 구현
public class B11024_더하기_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			String s[] = br.readLine().split(" "); // 입력 수
			int sum = 0; // 합
			for (int i = 0; i < s.length; i++) {
				sum += Integer.parseInt(s[i]); // 합 갱신
			}
			sb.append(sum).append("\n"); // 합 출력
		}
		System.out.println(sb); // 출력
		br.readLine();
	}
}