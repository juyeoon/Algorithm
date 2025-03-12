import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 첫째 나이  = 둘째 나이 + 둘째와 셋째의 나이 차
public class B6749_Next_in_line {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int third = Integer.parseInt(br.readLine()); // 셋째 나이
		int second = Integer.parseInt(br.readLine()); // 둘째 나이
		System.out.println(second + second - third); // 첫째 나이 출력
		br.close();
	}
}