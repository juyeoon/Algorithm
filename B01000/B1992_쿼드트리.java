import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1992
// 영상의 구조를 재귀적으로 4등분으로 나누어 압축
// 모든 픽셀이 같은 값인지 확인하고, 같다면 해당 값 출력
// 다르다면 괄호 ()로 감싸서 왼쪽 위, 오른쪽 위, 왼쪽 아래, 오른쪽 아래 순으로 결과 연결
public class B1992_쿼드트리 {
	public static char[][] video; // 영상 구조

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 처음 영상 크기
		video = new char[N][N]; // 영상 구조
		for (int i = 0; i < N; i++) { // video[][] 채우기
			video[i] = br.readLine().toCharArray();
		}
		System.out.println(dc(0, 0, N)); // 압축 결과 출력
		br.close();
	}

	public static String dc(int x, int y, int size) { // 쿼드 트리 구조로 압축
		if (isSameColor(x, y, size)) { // 주어진 구역이 모두 같은 숫자면(재귀 종료 조건)
			return String.valueOf(video[x][y]); // 숫자 반환
		}
		int newSize = size / 2; // 분할 정복용 크기
		String leftTop = dc(x, y, newSize); // 왼쪽 위
		String rightTop = dc(x, y + newSize, newSize); // 오른쪽 위
		String leftBottom = dc(x + newSize, y, newSize); // 왼쪽 아래
		String rightBottom = dc(x + newSize, y + newSize, newSize); // 오른쪽 아래
		return "(" + leftTop + rightTop + leftBottom + rightBottom + ")"; // 분할한 값 합치기
	}

	public static boolean isSameColor(int x, int y, int size) { // 주어진 구역이 같은 색(숫자)인지 확인
		char first = video[x][y]; // 처음 값
		int xEnd = x + size;
		int yEnd = y + size;
		for (int i = x; i < xEnd; i++) {
			for (int j = y; j < yEnd; j++) {
				if (video[i][j] != first) { // 값이 다르면
					return false;
				}
			}
		}
		return true; // 값이 모두 같으면
	}
}
