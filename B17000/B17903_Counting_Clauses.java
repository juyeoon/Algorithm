import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력의 첫 숫자가 8 이상인지 아닌지 확인하는 문제
// 다른 입력은 확인할 필요가 없음
public class B17903_Counting_Clauses {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int m = Integer.parseInt(s[0]); // 입력의 첫 숫자
		System.out.println((m >= 8) ? "satisfactory" : "unsatisfactory"); // 출력
		br.close();
	}
}