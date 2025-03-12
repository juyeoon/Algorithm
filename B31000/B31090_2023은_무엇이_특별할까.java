import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// (입력 연도 + 1)이 입력 값의 끝 두 자리수로 나누어 떨어지면 조건을 만족("Good" 출력, 그 외의 경우 "Bye" 출력)
public class B31090_2023은_무엇이_특별할까 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 입력값(연도)
			int n = N % 100; // 입력 값의 끝 두 자리수
			sb.append((N + 1) % n == 0 ? "Good\n" : "Bye\n"); // 나누어 떨어지면 배수
		}
		System.out.println(sb); // 출력
		br.close();
	}
}