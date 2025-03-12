import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피연산자들를 더하고 결과랑 비교
public class B13985_Equality {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int sum = Integer.parseInt(s[0]) + Integer.parseInt(s[2]); // 피연산자 더하기
		System.out.println((sum == Integer.parseInt(s[4])) ? "YES" : "NO"); // 결과랑 비교하여 출력
		br.close();
	}
}