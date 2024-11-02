import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 점수가 갱신될 때마다 가능한 점수인지(점수가 줄어드는 일) 확인하는 문제
// 이전 a, b의 점수가 현재 a, b의 점수보다 크면 No 출력, 끝까지 그런 경우가 없으면 Yes 출력
public class B32604_Jumbled_Scoreboards {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 점수 개수
		int a = 0; // 팀 a 점수
		int b = 0; // 팀 b 점수
		boolean isSorted = true; // 정렬 여부(true: 정렬)
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int tmpa = Integer.parseInt(st.nextToken()); // 현재 a 점수
			int tmpb = Integer.parseInt(st.nextToken()); // 현재 b 점수
			if (tmpa < a || tmpb < b) { // 이전 a, b의 점수가 현재 a, b의 점수보다 크면
				isSorted = false;
				break; // 반복문 종료
			}
			a = tmpa;
			b = tmpb;
		}
		System.out.println(isSorted ? "yes" : "no"); // 출력
		br.close();
	}
}
