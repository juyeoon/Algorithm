import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34306
// 마일을 피트로 단위 변환 후 나누기 (1마일 = 5280피트)
public class B34306_M_Climb_Road {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int W = Integer.parseInt(br.readLine()); // 도로의 길이를 마일 단위로 나타내는 정수
		int N = Integer.parseInt(br.readLine()); // 물총 사이의 간격을 피트 단위로 나타내는 정수
		System.out.println(5280 * W / N); // 출력
		br.close();
	}
}
