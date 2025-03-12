import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// '+'가 포함된 문자열 개수 찾기
public class B28808_Таблица_результатов {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]); // 입력 문자열 개수
		int m = Integer.parseInt(s[1]); // 문자열 길이
		int cnt = 0; // '+'가 포함된 문자열 개수
		for (int i = 0; i < n; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < m; j++) {
				if (tmp.charAt(j) == '+') { // '+'가 포함
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}