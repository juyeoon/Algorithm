import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/31472
// 원래의 정사각형 한 변의 길이를 a라고 두면 W = a/2 * a
// 따라서 a^2 = 2 * W
// 원래의 정사각형 둘레 = 4 * sqrt(2 * W)
public class B31472_갈래의_색종이_자르기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int W = Integer.parseInt(br.readLine()); // 정사각형 절반의 넓이
		System.out.println((int) Math.sqrt(2 * W) * 4); // 정사각형 둘레 출력
		br.close();
	}
}
