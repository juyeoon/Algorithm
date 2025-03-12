import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 2822 - 점수 계산
// https://www.acmicpc.net/problem/2822
public class B2822_점수_계산 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int score[][] = new int[8][2]; // 0열: 입력 순서(1~8), 1열: 점수
		for (int i = 0; i < 8; i++) { // input
			score[i][0] = i + 1; // 입력 순서
			score[i][1] = Integer.parseInt(br.readLine()); // 점수
		}
		Arrays.sort(score, new Comparator<int[]>() { // 점수 기준으로 내림차순
			public int compare(int[] o1, int[] o2) {
				return o2[1] - o1[1];
			}
		});
		int sum = 0; // 상위 5개 점수 합
		int num[] = new int[5]; // 상위 5개 입력 순서 (오름차순 정렬하기 위해서)
		for (int i = 0; i < 5; i++) {
			sum += score[i][1]; // 합 구하기
			num[i] = score[i][0]; // 상위 5개 입력 순서
		}
		Arrays.sort(num); // 상위 5개 입력 순서 오름차순 정렬
		// 출력
		sb.append(sum).append("\n");
		for (int i = 0; i < 5; i++) {
			sb.append(num[i]).append(" ");
		}
		System.out.println(sb);
		br.close();
	}
}
