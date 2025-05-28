import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2630
// 분할 정복으로 해결 => 
// 1. 문제를 반복적으로 동일한 패턴으로 쪼갤 수 있음
// 2. 조건이 충족되면 더 이상 나누지 않음
// 3. 각 분할의 결과를 합쳐 최종 정답을 구성
public class B2630_색종이_만들기 {
	public static int[][] paper; // 전체 색종이 구성
	public static int whiteCnt, blueCnt; // 하얀색, 파란색 색종이 수

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 전체 색종이 크기
		whiteCnt = 0;
		blueCnt = 0;
		paper = new int[N][N];
		for (int i = 0; i < N; i++) { // paper[][] 채우기
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		divAndConquer(0, 0, N); // 분할 정복 수행
		System.out.println(whiteCnt); // 흰색 개수
		System.out.println(blueCnt); // 파란색 개수
		br.close();
	}

	// 분할 정복으로 색종이가 같은 색인지 확인하고 아니면 분할하여 다시 확인
	public static void divAndConquer(int x, int y, int size) {
		// 1. 종료 조건
		if (isSameColor(x, y, size)) { // 주어진 구역이 같은 색으로 되어 있는지 확인
			if (paper[x][y] == 0) { // 흰색
				whiteCnt++;
			} else { // 파란새
				blueCnt++;
			}
			return;
		}
		// 2. 분할
		int half = size / 2;
		// 3. 재귀 호출
		divAndConquer(x, y, half);
		divAndConquer(x, y + half, half);
		divAndConquer(x + half, y, half);
		divAndConquer(x + half, y + half, half);
	}

	// 같은 색상인지 확인
	public static boolean isSameColor(int x, int y, int size) {
		int first = paper[x][y]; // 처음 색상
		int xEnd = x + size;
		int yEnd = y + size;
		for (int i = x; i < xEnd; i++) {
			for (int j = y; j < yEnd; j++) {
				if (paper[i][j] != first) { // 색상이 같지 않음
					return false;
				}
			}
		}
		return true; // 색상이 같음 않음
	}
}
