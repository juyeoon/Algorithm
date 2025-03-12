import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11312
// 큰 삼각형 한 변을 덮을 수 있는 작은 삼각형의 한 변의 수의 제곱 개
// = (A / B)^2
public class B11312_삼각_무늬_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long side = Integer.parseInt(st.nextToken()) / Integer.parseInt(st.nextToken()); // 한 변을 덮기 위한 작은 삼각형의 변의 개수
			sb.append(side * side).append("\n"); // 삼각형을 덮기 위한 작은 삼각형의 개수
		}
		System.out.println(sb); // 출력
		br.close();
	}
}