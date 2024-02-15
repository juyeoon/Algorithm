import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 총 멀티탭에 꽂을 수 있는 최대 사람 수 = 각각의 멀티탭에 꽂을 수 있는 최대 사람 수의 합
// 한 멀티탭에 꽂을 수 있는 최대 사람 수 = 멀티탭 구 수 / 2 + (나머지가 있으면 1)
public class B15780_멀티탭_충분하니 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 스터디에 온 학생의 수
		int K = Integer.parseInt(s[1]); // 멀티탭의 수
		s = br.readLine().split(" ");
		int sum = 0; // 멀티탭에 꽂을 수 있는 최대 사람 수
		for (int i = 0; i < K; i++) {
			int A = Integer.parseInt(s[i]); // 각 멀티탭 구의 수
			sum += A / 2 + (A % 2 == 0 ? 0 : 1);
		}
		if (N > sum) { // 사람 수 > 최대 수
			System.out.println("NO");

		} else { // 그 외
			System.out.println("YES");
		}
		br.close();
	}
}