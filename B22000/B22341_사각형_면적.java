import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/22341
// 처음 종이는 N x N 크기
// 각 점(X, Y)에 대해, 종이 안에 있는 경우만 처리
// 해당 점을 기준으로 가로 또는 세로로 자르되, 더 넓은 면적이 남는 쪽을 선택
// 면적이 같다면 가로로 자른다 (문제 조건)
// 남은 종이의 크기를 계속 업데이트하며 마지막 면적을 출력
public class B22341_사각형_면적 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 처음 종이 크기 (N,N)
		int C = Integer.parseInt(st.nextToken()); // 좌표 개수
		int fullX = N; // 자르고 남은 종이의 끝 X 좌표
		int fullY = N; // 자르고 남은 종이의 끝 Y 좌표
		for (int i = 0; i < C; i++) { // 자르기
			st = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(st.nextToken()); // 자를 X 좌표
			int Y = Integer.parseInt(st.nextToken()); // 자를 Y 좌표
			if (X >= fullX || Y >= fullY) { // 좌표 제한 확인
				continue;
			}
			int verticalCut = Y * fullX; // 세로로 자른 종이의 크기
			int horizontalCut = X * fullY; // 가로로 자른 종이의 크기
			if (verticalCut > horizontalCut) { // 세로로 자른 게 더 크면 세로로 자르기
				fullY = Y;
			} else { // 그 외의 경우 가로로 자르기
				fullX = X;
			}
		}
		System.out.println(fullX * fullY); // 출력
		br.close();
	}
}
