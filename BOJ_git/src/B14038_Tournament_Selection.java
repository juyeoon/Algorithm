import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이긴 횟수를 센 후, 다 졌으면 -1 출력. 그 외에는 경우의 규칙을 찾은 후 계산식으로 그룹 출력
public class B14038_Tournament_Selection {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int winCnt = 0; // 이긴 횟수
		for (int i = 0; i < 6; i++) { // 이긴 횟수 세기
			if (br.readLine().equals("W")) {
				winCnt++;
			}
		}
		// 다 졌으면 -1
		// 그 외에는 (8 - 이긴 횟수) / 2로 그룹 판별
		System.out.println(winCnt == 0 ? -1 : (8 - winCnt) / 2); // 출력
		br.close();
	}
}