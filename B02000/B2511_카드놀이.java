import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10라운드를 진행하면서 A나 B가 이길 때 마지막으로 이긴 사람을 저장하는 변수를 갱신
// 10라운드가 다 끝나고 점수가 같으면 마지막으로 이긴 사람 출력
// 점수가 같지 않으면 점수가 더 큰 사람 출력
public class B2511_카드놀이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String A[] = br.readLine().split(" "); // A 카드
		String B[] = br.readLine().split(" "); // B 카드
		char lastWin = 'D'; // 마지막으로 이긴 사람
		int Ascore = 0; // A의 총점
		int Bscore = 0; // B의 총점
		for (int i = 0; i < 10; i++) { // 10 라운드 진행
			int a = Integer.parseInt(A[i]); // A 카드
			int b = Integer.parseInt(B[i]); // B 카드
			if (a > b) { // A가 더 클 때
				Ascore += 3; // A 점수 갱신
				lastWin = 'A'; // 마지막으로 이긴 사람 갱신
			} else if (a < b) { // B가 더 클 때
				Bscore += 3; // B 점수 갱신
				lastWin = 'B'; // 마지막으로 이긴 사람 갱신
			} else { // 같을 때
				Ascore++; // 각 1점씩
				Bscore++;
			}
		}
		sb.append(Ascore).append(" ").append(Bscore).append("\n"); // 점수 출력
		if (Ascore == Bscore) { // 점수 같으면
			sb.append(lastWin); // 마지막으로 이긴 사람 출력
		} else { // 점수가 다르면
			sb.append(Ascore > Bscore ? "A" : "B"); // 점수가 더 큰 사람 출력
		}
		System.out.println(sb); // 출력
		br.readLine();
	}
}