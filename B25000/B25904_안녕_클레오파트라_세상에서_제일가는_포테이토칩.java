import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 각 번호가 몇 번까지 통과할 수 있는지를 구한 후 가장 적게 통과할 수 있는 번호 중 앞 번호를 출력
public class B25904_안녕_클레오파트라_세상에서_제일가는_포테이토칩 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 게임에 참여하는 사람 수
		int X = Integer.parseInt(st.nextToken()); // 처음 목소리 높이
		int hei[] = new int[N]; // 각 번호의 목소리 높이의 상한선([0]: 1번의 상한선)
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) { // input hei[]
			hei[i] = Integer.parseInt(st.nextToken());
		}
		int max[] = new int[N]; // 각 번호가 통과할 수 있는 횟수
		for (int i = 0; i < N; i++) {
			int Xi = X; // 해당 번호의 시작 높이
			int cnt = 0; // 통과 횟수
			while (Xi <= hei[i]) { // 내야하는 목소리가 상한선을 넘지 않을 때 반복
				Xi += N; // 다음에 내야하는 목소리 높이 (+사람수)
				cnt++; // 통과 횟수 추가
			}
			max[i] = cnt; // 통과 횟수 저장
			X++; // 다음 번호 시작 높이
		}
		int minCnt = Integer.MAX_VALUE; // 최소 통과 목소리 높이
		int minNum = -1; // 최솟값을 가지는 번호(ex) 1번 -> 0)
		for (int i = 0; i < N; i++) { // 최솟값을 가지는 번호 찾기
			if (minCnt > max[i]) {
				minCnt = max[i];
				minNum = i;
			}
		}
		System.out.println(minNum + 1); // 출력
		br.close();
	}
}