import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 풀이 2: 0부터 M의 최댓값인 1000000까지 누적 0의 개수를 구하여 배열에 저장 후
// (0부터 M까지의 0의 개수) - (0부터 N-1까지의 0의 개수) 출력
// N이 0이면 (0부터 M까지의 0의 개수) 출력
// (104ms)
public class B11170_0의_개수_풀이2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] cnt = new int[1000001]; // 0부터 각 숫자까지의 누적 0의 개수 저장
		cnt[0] = 1; // 0일 경우 0의 개수를 갱신
		for (int i = 1; i < 1000001; i++) { // for 반복문을 사용해 각 숫자를 순회
			int num = i; // 현재 수
			int nowCnt = 0; // 현재 수의 0의 개수를 저장
			while (num > 9) { // 현재 수가 1의 자리가 될 때까지 반복
				if (num % 10 == 0) { // 현재 수의 1의 자리에 0이 존재하는 경우
					nowCnt++; // 0의 개수 카운트
				}
				num /= 10; // 현재 수의 다음 자리 수를 확인하기 위해 1의 자리 숫자 삭제
			}
			cnt[i] = cnt[i - 1] + nowCnt; // 현재 수까지의 0의 개수를 갱신
		}
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			if (N == 0) { // 시작 값이 0인 경우
				sb.append(cnt[M]); // 0부터 끝 값까지의 0의 개수 출력
			} else { // 시작 값이 0이 아닌 경우
				// (0부터 끝 값까지의 0의 개수) - (0부터 시작 값 이전 값까지의 0의 개수) 출력
				sb.append(cnt[M] - cnt[N - 1]);
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}