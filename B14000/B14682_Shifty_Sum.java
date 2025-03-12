import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/14682
// N이 12고 k가 3이면 12 + 120 + 1200 + 12000의 값을 구하는 문제
// 해당 식을 변형하면 12 * (1111) = N * (1이 k+1개)
public class B14682_Shifty_Sum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // N
		int k = Integer.parseInt(br.readLine()); // k
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= k; i++) { // (1이 k+1개)인 수 구하기
			sb.append("1");
		}
		int M = Integer.parseInt(sb.toString()); // 정수형으로 변경
		System.out.println(N * M); // 출력
		br.close();
	}
}
