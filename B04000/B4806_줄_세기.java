import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// EOI 사용 문제
public class B4806_줄_세기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		int cnt = 0; // 입력 문자열 개수
		while ((s = br.readLine()) != null) { // EOI
			cnt++;
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}