import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열을 ","로 split하여 수 나누어 더하기
public class B10822_더하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S[] = br.readLine().split(",");
		int sum = 0; // 합
		for (int i = 0; i < S.length; i++) { // 더하기
			sum += Integer.parseInt(S[i]);
		}
		System.out.println(sum); // 출력
		br.close();
	}
}