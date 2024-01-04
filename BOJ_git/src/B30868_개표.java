import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 5개 단위로 "++++" 하나가  생성되므로 "++++" 개수는 득표수/5
// "|"는 맨 마지막에 "++++"를 최대한 그리고 남은 득표수만큼 그리므로 개수는 득표수%5
public class B30868_개표 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 후보자 수
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 득표수
			int plus = N / 5; // "++++" 개수
			for (int i = 0; i < plus; i++) {
				sb.append("++++ ");
			}
			int stick = N % 5; // "|" 개수
			for (int i = 0; i < stick; i++) {
				sb.append("|");
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}