import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 경우 1) Division 1과 shake!의 우승 상금을 모두 갖는 경우
// 경우 2) Division 2의 상금만 갖는 경우
// 두 경우 중 큰 금액이 얻을 수 있는 최대 상금의 액수
public class B31922_이_대회는_이제_제_겁니다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]); // Division 1
		int P = Integer.parseInt(s[1]); // Division 2
		int C = Integer.parseInt(s[2]); // shake!
		System.out.println(Math.max(A + C, P)); // 두 경우 중 큰 금액 출력
		br.close();
	}
}