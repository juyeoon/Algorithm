import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수익  = (여름의 일 수-1) / 자라는데 걸리는 일 수  * 심을 수 있는 칸 * 개당 가격 점수
public class B17496_스타후르츠 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 여름의 일 수
		int T = Integer.parseInt(s[1]); // 자라는데 걸리는 일 수
		int C = Integer.parseInt(s[2]); // 심을 수 있는 칸
		int P = Integer.parseInt(s[3]); // 개당 가격 점수
		System.out.println((N - 1) / T * C * P); // 출력
		br.close();
	}
}