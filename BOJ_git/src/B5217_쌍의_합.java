import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1부터 (n / 2 - 1)[i]까지 반복하여 i와 (n - i)를 출력
// n이 홀수인 경우 (n / 2)와 (n - n / 2)도 출력
public class B5217_쌍의_합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int n = Integer.parseInt(br.readLine()); // 입력 수
			sb.append("Pairs for ").append(n).append(": ");
			if (n > 2) { // n이 2보다 큰 경우에만 쌍 존재
				for (int i = 1; i < n / 2; i++) { // 1부터 (n / 2 - 1)[i]까지 반복하여 i와 (n - i)를 출력
					sb.append(i).append(" ").append(n - i).append(", ");
				}
				if (n % 2 != 0) { // n이 홀수인 경우 (n / 2)와 (n - n / 2)도 출력
					sb.append(n / 2).append(" ").append(n - (n / 2)).append(", ");
				}
				sb.setLength(sb.length() - 2); // 마지막 ", " 제거
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.readLine();
	}
}