import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/16728
// 피타고라스 정리를 이용해서 원점에서의 거리를 구한 후 거리에 따른 점수를 합하여 출력
public class B16728_Chaarshanbegaan_at_Cafebazaar {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 다트 개수
		int score = 0; // 누적 점수
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Math.abs(Integer.parseInt(st.nextToken())); // x 좌표
			int y = Math.abs(Integer.parseInt(st.nextToken())); // y 좌표
			double d = Math.sqrt(x * x + y * y); // 원점에서의 거리
			// 거리에 따른 다트 점수
			if (d <= 10) {
				score += 10;
			} else if (d <= 30) {
				score += 9;
			} else if (d <= 50) {
				score += 8;
			} else if (d <= 70) {
				score += 7;
			} else if (d <= 90) {
				score += 6;
			} else if (d <= 110) {
				score += 5;
			} else if (d <= 130) {
				score += 4;
			} else if (d <= 150) {
				score += 3;
			} else if (d <= 170) {
				score += 2;
			} else if (d <= 190) {
				score += 1;
			} else {
				score += 0;
			}
		}
		System.out.println(score); // 점수 출력
		br.close();
	}
}
