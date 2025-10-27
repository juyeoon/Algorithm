import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/21200
//P가 선택된 집합 안에 있으면 KEEP 해야 P가 남고, 없으면 선택된 카드들을 REMOVE 해야 P가 남음
public class B21200_Forced_Choice {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 총 카드 개수 (사용 X)
		int P = Integer.parseInt(st.nextToken()); // 봉투 속 예측 카드 번호
		int S = Integer.parseInt(st.nextToken()); // 단계 수
		for (int i = 0; i < S; i++) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken()); // 이번에 공주가 고른 카드 수
			boolean containP = false; // P가 선택된 집합 안에 있는지
			for (int j = 0; j < m; j++) {
				if (Integer.parseInt(st.nextToken()) == P) {
					containP = true;
				}
			}
			sb.append(containP ? "KEEP" : "REMOVE").append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
