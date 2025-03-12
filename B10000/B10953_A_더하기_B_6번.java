import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// split(",")로 A, B 구분하기
public class B10953_A_더하기_B_6번 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			String s[] = br.readLine().split(",");
			sb.append(Integer.parseInt(s[0]) + Integer.parseInt(s[1])).append("\n"); // A+B
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
