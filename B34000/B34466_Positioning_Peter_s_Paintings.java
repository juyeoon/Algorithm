import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/34466
// 두 개의 직사각형 그림을 겹치지 않게 배치할 수 있는 가장 작은 직사각형의 둘레를 구하는 문제
// 배치는 가로로 나란히 두는 경우, 세로로 나란히 두는 경우 두 개
// 각 경우마다 전체 벽의 가로, 세로 길이를 구한 뒤, 둘레 = 2 * (가로 + 세로)를 계산
// 두 경우의 둘레 중 더 작은 값을 출력
public class B34466_Positioning_Peter_s_Paintings {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken()); // 첫 번째 그림 가로
		long B = Long.parseLong(st.nextToken()); // 첫 번째 그림 세로
		long X = Long.parseLong(st.nextToken()); // 두 번째 그림 가로
		long Y = Long.parseLong(st.nextToken()); // 두 번째 그림 세로
		long horizontal = 2 * ((A + X) + Math.max(B, Y)); // 가로 배치
		long vertical = 2 * ((B + Y) + Math.max(A, X)); // 세로 배치
		System.out.println(Math.min(horizontal, vertical)); // 출력
		br.close();
	}
}
