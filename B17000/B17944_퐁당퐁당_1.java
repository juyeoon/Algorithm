import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/17944
// 1부터 증가하여 2N까지 갔다가 1로 감소 => 주기: 4 * N - 2
// T번째 차례를 주기 내에서의 위치로 변환
// 주기 내에서의 차례에 따라 팔의 개수 계산 후 출력
public class B17944_퐁당퐁당_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 게임에 참여하는 사람 수
		int T = Integer.parseInt(st.nextToken()); // 계산해야 하는 차례
		int cycle = 4 * N - 2; // 증가 후 감소하는 한 주기의 길이
		int tMod = (T - 1) % cycle + 1; // 주기 내에서의 현재 차례 위치
		int arms = 0; // 해당 차례에서 들어야 하는 팔의 개수
		if (tMod <= 2 * N) { // 만약 차례가 증가하는 구간이라면 그대로 사용
			arms = tMod;
		} else { // 감소하는 구간이라면 대칭적으로 계산
			arms = 4 * N - tMod;
		}
		System.out.println(arms); // 출력
		br.close();
	}
}
