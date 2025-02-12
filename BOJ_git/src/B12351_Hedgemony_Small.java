import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/12351
// 덤불 손질 규칙에 맞게 덤불을 손질할 때 마지막으로 손질한 덤불의 길이를 구하는 문제
// 규칙: 2번 덤불부터 N-1번 덤불까지(맨 앞과 맨 끝은 손질하지 않음),
// 덤불 높이를 양옆 덤불의 평균 높이로 조정. 단, 이미 평균보다 작거나 같으면 그대로 둠
// 접근: 처음 덤불 높이를 배열에 저장한 후 [1]부터 순차적으로 조정해감 
public class B12351_Hedgemony_Small {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			double num[] = new double[N]; // 덤불 높이
			for (int i = 0; i < N; i++) { // 처음 덤불 높이 입력
				num[i] = Double.parseDouble(st.nextToken());
			}
			for (int i = 1; i < N - 1; i++) { // 덤불 손질
				double avg = (num[i - 1] + num[i + 1]) / 2; // 양옆 덤불의 평균 높이
				if (num[i] > avg) { // 평균보다 클때 손질
					num[i] = avg;
				}
			}
			sb.append(String.format("Case #%d: %.6f\n", tc, num[N - 2])); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
