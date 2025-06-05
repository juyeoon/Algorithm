import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/32068
// 왼쪽 보물을 찾은 시점의 단계 = 시작 위치와 왼쪽 보물 사이의 거리 * 2 + 1 단계
// 오른쪽 보물을 찾은 시점의 단계 = 시작 위치와 오른쪽 보물 사이의 거리 * 2 단계
// 둘 중에 더 적은 단계에 해당하는 보물을 가짐 
public class B32068_보물_찾기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(st.nextToken()); // 왼쪽 보물
			int R = Integer.parseInt(st.nextToken()); // 오른쪽 보물
			int S = Integer.parseInt(st.nextToken()); // 시작 위치
			int leftStep = Math.abs(L - S) * 2 + 1; // 왼쪽 보물을 찾는 단계
			int rightStep = Math.abs(R - S) * 2; // 오른쪽 보물을 찾는 단계
			sb.append(Math.min(leftStep, rightStep)).append("\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
