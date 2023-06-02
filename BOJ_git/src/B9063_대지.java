import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최소 넓이의 사각형은 가장 밖에 있는 좌표를 사각형의 변이 지나는 사각형
// 입력 받은 좌표의 X와 Y의 최댓값 최솟값을 구해 (최댓값-최솟값)들을 곱함
public class B9063_대지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()); // 좌표 개수
		int minX = Integer.MAX_VALUE; // X 최솟값
		int minY = Integer.MAX_VALUE; // Y 최솟값
		int maxX = Integer.MIN_VALUE; // X 최댓값
		int maxY = Integer.MIN_VALUE; // Y 최댓값
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()); // X 좌표
			int y = Integer.parseInt(st.nextToken()); // Y 좌표
			minX = Math.min(minX, x); // X 최솟값 구하기
			minY = Math.min(minY, y); // Y 최솟값 구하기
			maxX = Math.max(maxX, x); // X 최댓값 구하기
			maxY = Math.max(maxY, y); // Y 최댓값 구하기
		}
		System.out.println((maxX - minX) * (maxY - minY)); // 최소 넓이 출력
		br.readLine();
	}
}
