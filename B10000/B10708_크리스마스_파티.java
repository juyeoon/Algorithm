import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10708
// 게임별 타겟과 참여자의 누적 점수를 저장하는 배열을 사용
// 게임마다 반복해 타겟 추측 성공하면 누적 점수 +1
// 게임마다 추측에 실패한 수를 저장 후 추측 성공 여부 확인이 다 끝나면 타겟에게 틀린 사람 수만큼 점수 추가
public class B10708_크리스마스_파티 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 게임 참여자 수
		int M = Integer.parseInt(br.readLine()); // 게임 횟수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int target[] = new int[M + 1]; // 게임 당 타겟
		for (int i = 1; i <= M; i++) { // target[] 채우기
			target[i] = Integer.parseInt(st.nextToken());
		}
		int point[] = new int[N + 1]; // 참여자 당 누적 점수
		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			int missCnt = 0; // 틀린 사람 수
			for (int j = 1; j <= N; j++) { // 참여자만큼 반복
				int guess = Integer.parseInt(st.nextToken()); // 추측한 타겟
				if (guess == target[i]) { // 추측 성공
					point[j]++;
				} else { // 추측 실패
					missCnt++;
				}
			}
			point[target[i]] += missCnt; // 해당 게임의 타겟에게 틀린 사람 수만큼 점수 추가
		}
		for (int i = 1; i <= N; i++) { // 출력 저장
			sb.append(point[i]).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
