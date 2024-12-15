import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/23810
// N*5개 N줄 함수와 N*1개 N줄 함수 작성 후
// five - one - five - one - one 으로 출력
public class B23810_골뱅이_찍기_뒤집힌_ㅋ {
	public static int N;
	public static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		fullFive(); // @@@@@
		firstOne(); // @
		fullFive(); // @@@@@
		firstOne(); // @
		firstOne(); // @
		System.out.println(sb); // 출력
		br.close();
	}

	public static void firstOne() { // N*1개 N줄
		for (int i = N; i > 0; i--) {
			for (int j = 0; j < N; j++) {
				sb.append('@');
			}
			sb.append("\n");
		}
	}

	public static void fullFive() { // N*5개 N줄
		for (int i = 0; i < N; i++) {
			for (int j = N * 5; j > 0; j--) {
				sb.append('@');
			}
			sb.append("\n");
		}
	}
}