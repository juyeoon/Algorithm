import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 중앙에서 거리가 같은 곳의 알파벳이 같다는 점을 이용
public class B1262_알파벳_다이아몬드 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" ");

		int N = Integer.parseInt(s[0]); // 타일에 들어가는 알파벳 종류
		int R1 = Integer.parseInt(s[1]); // 시작점 x
		int C1 = Integer.parseInt(s[2]); // 시작점 y
		int R2 = Integer.parseInt(s[3]); // 끝점 x
		int C2 = Integer.parseInt(s[4]); // 끝점 y

		for (int i = R1; i <= R2; i++) { // 행 반복
			for (int j = C1; j <= C2; j++) { // 열 반복
				int x = i % (2 * N - 1); // 하나의 타일에서의 행 위치
				int y = j % (2 * N - 1); // 하나의 타일에서의 열 위치
				int dst = Math.abs(N - 1 - x) + Math.abs(N - 1 - y); // 중앙과의 거리
				if (dst >= N) // 거리가 N보다 크면 .
					sb.append(".");
				else // 그 외에는 알파벳
					sb.append((char) (dst % 26 + 'a')); // 알파벳 26자 단위로 돌려주기
			}
			sb.append("\n"); // 하나의 행 끝
		}
		System.out.println(sb); // 출력
		br.close();
	}
}