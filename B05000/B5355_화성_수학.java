import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 연산자에 맞게 계산하기
public class B5355_화성_수학 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			double n = Double.parseDouble(st.nextToken());
			int cnt = st.countTokens(); // 처음 값
			for (int j = 0; j < cnt; j++) {
				char c = st.nextToken().charAt(0); // 연산자
				if (c == '@') {
					n *= 3;
				} else if (c == '%') {
					n += 5;
				} else if (c == '#') {
					n -= 7;
				}
			}
			sb.append(String.format("%.2f", n)).append("\n"); // 계산 결과 반올림
		}
		System.out.println(sb); // 출력
		br.close();
	}
}