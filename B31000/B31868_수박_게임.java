import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/31868
// 수박 하나를 만들기 위한 체리 개수 = 2 ^ (수박을 만들기 위한 단계 - 1)
// 만들 수 있는 수박 개수 = (전체 체리 개수) / (수박 하나를 만들기 위한 체리 개수)
public class B31868_수박_게임 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 수박을 만들기 위한 단계
		int K = Integer.parseInt(st.nextToken()); // 체리 개수
		int wm = (int) Math.pow(2, N - 1); // 수박 하나를 만들기 위한 체리 개수
		System.out.println(K / wm); // 만들 수 있는 수박 개수
		br.close();
	}
}
