import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34543
// 조건에 맞게 if문 작성 후 점수 출력. 단, 점수 계산 후 음수면 0으로 출력
public class B34543_와우산_스탬프_투어 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 등산객이 방문한 명소의 개수
		int W = Integer.parseInt(br.readLine()); // 등산객의 총 걸음 수
		int score = N * 10; // 명소 한 곳당 10점의 기본 점수
		// 방문한 명소의 개수가 3개 이상이면, 추가로 20점을 더 받는다
		if (N >= 3) {
			score += 20;
		}
		// 모든 5개의 명소를 방문했다면, 기본 점수와 3개 이상 방문 추가 점수 외에, 특별 보너스로 50점을 더 받는다
		if (N == 5) {
			score += 50;
		}
		// 등산객이 명소를 방문하면서 총 걸음 수가 1000보를 초과했다면, 피로가 누적되어 최종 점수에서 15점이 감점
		if (W > 1000) {
			score -= 15;
		}
		// 점수는 0점 미만으로 내려가지 않는다
		System.out.println(score < 0 ? 0 : score); // 출력
		br.close();
	}
}
