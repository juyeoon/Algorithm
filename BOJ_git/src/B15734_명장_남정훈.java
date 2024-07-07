import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 왼발잡이 선수와 오른발잡이 선수 수의 차이를 양발잡이 선수로 채우고
// 남은 양발잡이 선수를 2명씩(왼발 1, 오른발 1)로 최대한 묶어서 계산
public class B15734_명장_남정훈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int L = Integer.parseInt(s[0]); // 왼발잡이 선수의 수
		int R = Integer.parseInt(s[1]); // 오른발잡이 선수의 수
		int A = Integer.parseInt(s[2]); // 양발잡이 선수의 수
		int diff = Math.abs(L - R); // L과 R의 차이
		if (A - diff < 0) { // 양발잡이 선수를 왼발잡이나 오른발잡이 중 작은 쪽으로 전부 보내도 부족하면
			// (작은 쪽에 양발잡이를 더한 값) + (그만큼의 큰 쪽의 수)
			System.out.println((Math.min(L, R) + A) * 2);
		} else { // 양발잡이 선수를 작은 쪽으로 보내고도 양발잡이 선수 수가 남았을 때
			// (작은 쪽 + 둘의 차이) + (큰 쪽) + (둘의 차이를 뺀 값 / 2) * 2
			System.out.println((Math.max(L, R) + (A - diff) / 2) * 2);
		}
		br.close();
	}
}
