import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// hole을 통과하면 3점 보드 위에 올라가면 1점
// 플레이어 1과 2의 점수를 각각 계산한 후 더 큰 점수를 가진 플레이어의 번호와 점수차를 출력
// 동점인 경우 "NO SCORE" 출력
public class B27855_Cornhole {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int score1 = 3 * (Integer.parseInt(s[0])) + Integer.parseInt(s[1]); // 플레이어 1 점수
		s = br.readLine().split(" ");
		int score2 = 3 * (Integer.parseInt(s[0])) + Integer.parseInt(s[1]); // 플레이어 2 점수
		if (score1 > score2) { // 플레이어 1 점수가 더 크면
			System.out.println("1 " + (score1 - score2));
		} else if (score1 < score2) { // 플레이어 2 점수가 더 크면
			System.out.println("2 " + (score2 - score1));
		} else { // 점수가 같음
			System.out.println("NO SCORE");
		}
		br.close();
	}
}