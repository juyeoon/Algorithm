import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 한 변의 길이가 A인 정삼각형을 완벽하게 덮을 수 있는 한 변의 길이가 B인 정삼각형의 최소 개수
// => (한 변의 길이 A를 완벽하게 덮을 수 있는 길이가 B 선분(B 정상각형의 변)의 개수)의 제곱
// 한 변의 길이 A를 완벽하게 덮을 수 있는 길이가 B 선분(B 정상각형의 변)의 개수
// => A / B + (나눈 나머지가 존재하면 1 아니면 0)
public class B11320_삼각_무늬_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken()); // 한 변의 길이 A
			int B = Integer.parseInt(st.nextToken()); // 한 변의 길이 B
			int num = A / B + (A % B == 0 ? 0 : 1); // (A 길이의 한 변)을 덮기 위해 사용된 (B 길이의 한 변)의 최소 개수
			sb.append(num * num).append("\n"); // 한 변의 길이가 A인 정삼각형을 완벽하게 덮을 수 있는 한 변의 길이가 B인 정삼각형의 최소 개수
		}
		System.out.println(sb); // 출력
		br.close();
	}
}