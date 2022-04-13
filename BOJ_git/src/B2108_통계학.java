import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//카운트 배열 사용
public class B2108_통계학 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		if (N == 1) { // 숫자가 1개일 때
			int num = Integer.parseInt(br.readLine());
			sb.append(num).append("\n").append(num).append("\n").append(num).append("\n").append(0).append("\n");
		} else {
			int[] cnt = new int[8001];// -4000~4000 등장 횟수 저장
			int sum = 0; // 숫자 합
			int max = Integer.MIN_VALUE; // 최댓값 (-4000~4000)
			int min = Integer.MAX_VALUE; // 최솟값 (-4000~4000)
			for (int i = 0; i < N; i++) {
				int num = Integer.parseInt(br.readLine()); // 숫자
				sum += num; // 합 계산
				cnt[num + 4000]++; // 카운트 증가
				if (max < num) { // 최댓값 계산
					max = num;
				}
				if (min > num) { // 최솟값 계산
					min = num;
				}
			} // input

			// 산술평균
			double avg = (double) sum / N;
			// 중앙값, 최빈값
			int median = -4001; // 중앙값
			int mode = -4001; // 최빈값
			int modecnt = 0; // 최빈값 횟수
			int count = 0; // 누적 개수 합
			boolean dupl = false; // 최빈값 중복 체크(true: 두번째 작은 수 설정)
			for (int i = min + 4000; i <= max + 4000; i++) {
				if (cnt[i] != 0) { // 0이 아닐때만
					// 중앙값
					count += cnt[i]; // 누적합 계산
					if (median == -4001 && count > N / 2) {
						median = i - 4000; // 중앙값 설정
					}
					// 최빈값
					if (modecnt < cnt[i]) { // 현재 최빈값 횟수보다 클때
						modecnt = cnt[i];
						mode = i - 4000; // 최빈값 설정
						dupl = false; // 중복 false
					} else if (modecnt == cnt[i] && !dupl) { // 현재 최빈값 횟수와 같은데 처음 중복일 때(두번째로 작은 수)
						modecnt = cnt[i];
						mode = i - 4000; // 최빈값 설정
						dupl = true; // 중복 true
					}
				}
			}
			// 범위
			int range = max - min; // 최댓값 - 최솟값
			sb.append(Math.round(avg)).append("\n").append(median).append("\n").append(mode).append("\n").append(range)
					.append("\n");
		}

		System.out.println(sb);
		br.close();
	}
}
