import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// if-else문으로 점수에 따라 다른 출력
public class B11367_Report_Card_Time {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 호빗 수
		for (int tc = 0; tc < N; tc++) {
			String s[] = br.readLine().split(" ");
			sb.append(s[0]).append(" "); // 이름 출력 저장
			int score = Integer.parseInt(s[1]); // 점수
			if (97 <= score && score <= 100) {
				sb.append("A+");
			} else if (90 <= score && score < 97) {
				sb.append("A");
			} else if (87 <= score && score < 90) {
				sb.append("B+");
			} else if (80 <= score && score < 87) {
				sb.append("B");
			} else if (77 <= score && score < 80) {
				sb.append("C+");
			} else if (70 <= score && score < 77) {
				sb.append("C");
			} else if (67 <= score && score < 70) {
				sb.append("D+");
			} else if (60 <= score && score < 67) {
				sb.append("D");
			} else {
				sb.append("F");
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}