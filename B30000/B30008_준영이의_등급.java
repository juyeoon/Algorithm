import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 각 과목의 백분율 = 준영의 등수 * 100 / 학생 수
// 백분율의 범위로 조건 분기
public class B30008_준영이의_등급 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); // 학생 수
		int K = Integer.parseInt(st.nextToken()); // 과목의 수
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < K; i++) { // 과목 수만큼 반복
			int P = Integer.parseInt(st.nextToken()) * 100 / N; // 해당 과목의 백분율
			if (0 <= P && P <= 4) { // 1등급
				sb.append("1 ");
			} else if (4 < P && P <= 11) { // 2등급
				sb.append("2 ");
			} else if (11 < P && P <= 23) { // 3등급
				sb.append("3 ");
			} else if (23 < P && P <= 40) { // 4등급
				sb.append("4 ");
			} else if (40 < P && P <= 60) { // 5등급
				sb.append("5 ");
			} else if (60 < P && P <= 77) { // 6등급
				sb.append("6 ");
			} else if (77 < P && P <= 89) { // 7등급
				sb.append("7 ");
			} else if (89 < P && P <= 96) { // 8등급
				sb.append("8 ");
			} else { // 9등급
				sb.append("9 ");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}