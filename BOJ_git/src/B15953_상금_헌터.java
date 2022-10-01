import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 미리 등수에 따른 상금을 저장(rank17, reward17, rank18, reward18)
// 등수 배열을 돌면서 입력된 등수가 더 낮으면 해당 등수를 저장 후 반복문 탈출
public class B15953_상금_헌터 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;

		int[] rank17 = { 1, 3, 6, 10, 15, 21 }; // 17년도 등수
		int[] reward17 = { 500, 300, 200, 50, 30, 10 }; // 17년도 상금
		int[] rank18 = { 1, 3, 7, 15, 31 }; // 18년도 등수
		int[] reward18 = { 512, 256, 128, 64, 32 }; // 18년도 상금

		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int reward = 0; // 총 상금(만원)
			int a = Integer.parseInt(st.nextToken()); // 17년도 등수
			if (a != 0) { // 등수가 0이 아니면
				for (int i = 0; i < 6; i++) {
					if (a <= rank17[i]) { // 입력 받은 등수가 배열의 등수보다 수가 작으면
						reward += reward17[i]; // 총 상금에 해당하는 상금 더하기
						break; // 반복문 탈출
					}
				}
			}
			int b = Integer.parseInt(st.nextToken()); // 18년도 등수
			if (b != 0) { // 등수가 0이 아니면
				for (int i = 0; i < 5; i++) {
					if (b <= rank18[i]) { // 입력 받은 등수가 배열의 등수보다 수가 작으면
						reward += reward18[i]; // 총 상금에 해당하는 상금 더하기
						break; // 반복문 탈출
					}
				}
			}
			sb.append(reward * 10000).append("\n"); // 총 상금 * 10000(만원)
		}
		System.out.println(sb); // 출력
		br.close();
	}
}