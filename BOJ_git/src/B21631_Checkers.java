import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 검은색 흰색을 번갈아 줄세울 때 최대 검은색 덩어리 개수를 구하는 문제
// 검은색이 흰색보다 작거나 같을 때는 검은색 개수가 최댓값
// 그 외의 경우에는 (흰색 개수 + 1)가 최댓값
public class B21631_Checkers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		long a = Long.parseLong(s[0]); // 흰색 개수
		long b = Long.parseLong(s[1]); // 검은색 개수
		if (a >= b) { // 검은색이 흰색보다 작거나 같을 때
			System.out.println(b); // 검은색 개수가 최댓값
		} else { // 그 외의 경우
			System.out.println(a + 1); // (흰색 개수 + 1)가 최댓값
		}
		br.close();
	}
}