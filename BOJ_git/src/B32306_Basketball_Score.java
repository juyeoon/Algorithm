import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

// 각 포인트의 점수를 점수 * 슛 개수로 구하고 모두 더해 각 팀의 총점을 구한 후 비교하여 조건에 맞게 출력
public class B32306_Basketball_Score {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score[] = new int[2]; // Team 1, 2의 총점
		for (int i = 0; i < 2; i++) { // Team 별 계산
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 3; j++) { // 1, 2, 3점 계산
				score[i] += j * Integer.parseInt(st.nextToken());
			}
		}
		if (score[0] > score[1]) { // 1팀이 점수가 더 높으면
			System.out.println(1);
		} else if (score[0] < score[1]) { // 2팀이 점수가 더 높으면
			System.out.println(2);
		} else { // 두 팀 점수가 동일하면
			System.out.println(0);
		}
		br.close();
	}
}