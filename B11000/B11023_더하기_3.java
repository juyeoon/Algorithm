import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// for문으로 더하기
public class B11023_더하기_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int sum = 0; // 숫자 합
		for (int i = 0; i < s.length; i++) {
			sum += Integer.parseInt(s[i]); // 더하기
		}
		System.out.println(sum); // 출력
		br.close();
	}
}