import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// S의 개수와 A의 개수가 각각 2개씩 사용되므로 N과 M을 2로 나눈 후
// 무조건 S 두 개, A 두 개가 사용되어야 하므로 N과 M을 2로 나눈 것 중에 최소인 값을 출력
public class B23825_SASA_모형을_만들어보자 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // S의 개수
		int M = Integer.parseInt(s[1]); // N의 개수
		System.out.println(Math.min(N / 2, M / 2)); // 최대로 만들 수 있는 SASA의 개수
		br.close();
	}
}