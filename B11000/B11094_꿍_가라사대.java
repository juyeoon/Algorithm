import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11094
// s.contains()로 "Simon says"로 시작하는지 확인하고 시작하면 s.replaceFirst()로 "Simon says"를 제거한 문장 출력
public class B11094_꿍_가라사대 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 명령 개수
		for (int i = 0; i < n; i++) {
			String s = br.readLine(); // 명령
			if (s.contains("Simon says")) { // "Simon says"로 시작하면
				sb.append(s.replaceFirst("Simon says", "")).append("\n"); // 뒤에 문장 출력 저장
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
