import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열의 문자 하나씩 돌면서 모음인지 체크
public class B10987_모음의_개수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c[] = br.readLine().toCharArray(); // 입력 문자열을 문자 단위로 분할
		int cnt = 0; // 모음 개수
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') { // 문자가 모음이면
				cnt++; // 카운트 업
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}