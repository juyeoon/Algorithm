import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1이면 카운트를 하나 올리고 카운트를 총 합에 더해줌
// 0이면 카운트를 0으로 리셋
public class B2506_점수계산 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 문제 개수
		String s[] = br.readLine().split(" "); // 문제 채첨 결과
		int score = 0; // 점수
		int cnt = 0; // 연속으로 맞은 문제 개수
		for (int i = 0; i < N; i++) {
			if (s[i].equals("0")) { // 0이면 카운트를 리셋
				cnt = 0;
			} else { // 1이면
				cnt++; // 카운트 하나 올림
				score += cnt; // 점수에 카운드를 더함
			}
		}
		System.out.println(score); // 점수 출력
		br.close();
	}
}