import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수를 하나씩 확인하면서 369가 있는지 세기(브루트포스)
public class B17614_369 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 마지막 수
		int cnt = 0; // 369 개수
		for (int i = 3; i <= N; i++) { // 3부터 N까지 확인
			String s = Integer.toString(i); // int -> String
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j); // String -> char
				if (c == '3' || c == '6' || c == '9') { // 369이면
					cnt++; // 개수 ++
				}
			}
		}
		System.out.println(cnt); // 개수 출력
		br.close();
	}
}