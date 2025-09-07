import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/9635
// 첫번째 문제의 색과 마지막 문제의 색이 금지된 색인지 확인 후 조건에 맞게 출력
public class B9635_Balloons_Colors {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 문제 수
			int X = Integer.parseInt(st.nextToken()); // 가장 쉬운 문제 금지 색
			int Y = Integer.parseInt(st.nextToken()); // 가장 어려운 문제 금지 색
			st = new StringTokenizer(br.readLine());
			int firstColor = Integer.parseInt(st.nextToken()); // 첫번째 문재 색
			int lastColor = -1; // 마지막 문제 색
			for (int i = 2; i <= N; i++) { // 마지막 문제 색 찾기
				lastColor = Integer.parseInt(st.nextToken());
			}
			boolean easyBad = (firstColor == X); // 가장 쉬운 문제가 금지된 색이 받았는지
			boolean hardBad = (lastColor == Y); // 가장 어려운 문제가 금지된 색을 받았는지
			if (easyBad && hardBad) {
				sb.append("BOTH");
			} else if (easyBad) {
				sb.append("EASY");
			} else if (hardBad) {
				sb.append("HARD");
			} else {
				sb.append("OKAY");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
