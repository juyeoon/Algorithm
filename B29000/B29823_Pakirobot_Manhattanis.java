import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 로봇이 창고로 돌아가기 위해 갈 수 있는 최소 거리
// = | 북쪽으로 간 거리 - 남쪽으로 간 거리 | + | 서쪽으로 간 거리 - 동쪽으로 간 거리 | 
// (북쪽과 남쪽, 서쪽과 동쪽은 서로 상쇄되기 때문)
public class B29823_Pakirobot_Manhattanis {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 이동 횟수(입력 문자열 길이)
		String s = br.readLine(); // 방향(입력 문자열)
		int cnt[] = new int[4]; // 북남서동 방문횟수
		for (int i = 0; i < N; i++) { // cnt[] 구하기
			switch (s.charAt(i)) {
			case 'N':
				cnt[0]++;
				break;
			case 'S':
				cnt[1]++;
				break;
			case 'W':
				cnt[2]++;
				break;
			case 'E':
				cnt[3]++;
				break;
			}
		}
		System.out.println(Math.abs(cnt[0] - cnt[1]) + Math.abs(cnt[2] - cnt[3])); // 로봇이 창고에서 떨어진 거리
		br.close();
	}
}