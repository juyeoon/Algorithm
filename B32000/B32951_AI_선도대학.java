import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/32951
// 몇 년이 지났는지 => 2024 - 현재 연도
public class B32951_AI_선도대학 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 현재 연도
		System.out.println(N - 2024); // 출력
		br.close();
	}
}
