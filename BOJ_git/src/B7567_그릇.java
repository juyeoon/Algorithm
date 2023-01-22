import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 현재 그릇의 상태를 저장한 후 높이를 경우에 따라 더하고 현재 그릇의 상태를 갱신
public class B7567_그릇 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char c = s.charAt(0); // 현재 그릇 상태
		int h = 10; // 현재 높이
		for (int i = 1; i < s.length(); i++) { // 다음 그릇부터 끝까지 반복
			h += (c == s.charAt(i)) ? 5 : 10; // 그릇의 상태에 따라 다른 숫자 더하기
			c = s.charAt(i); // 현재 그릇 상태 갱신
		}
		System.out.println(h); // 높이 출력
		br.close();
	}
}