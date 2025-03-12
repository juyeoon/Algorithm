import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1부터 N까지 출력하는데 7과 11의 배수이면 "Wiwat!" 출력
// 7의 배수이면 "Hurra!" 출력
// 11의 배수이면 "Super!" 출력
// 전부 아니면 수 출력
public class B26767_Hurra {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N; i++) {
			if (i % 7 == 0 && i % 11 == 0) { // 7과 11의 배수
				sb.append("Wiwat!\n");
			} else if (i % 7 == 0) { // 7의 배수
				sb.append("Hurra!\n");
			} else if (i % 11 == 0) { // 11의 배수
				sb.append("Super!\n");
			} else {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}