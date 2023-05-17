import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 받은 수를 한 번 더 출력하는 문제
public class B26574_Copier {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 입력 수 개수
		for (int i = 0; i < N; i++) {
			String s = br.readLine(); // 입력 수
			sb.append(s).append(" ").append(s).append("\n"); // 두 번 출력
		}
		System.out.println(sb); // 출력
		br.close();
	}
}