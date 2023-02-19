import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 첫 번째 문자열의 알파벳 개수는 +, 두 번째 문자열의 알파벳 개수는 -로 저장하여
// 각 알파벳의 개수의 절댓값의 합을 출력
public class B1919_애너그램_만들기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt[] = new int[26]; // 알파벳 개수 저장
		String s = br.readLine(); // 첫 번째 문자열
		for (int i = 0; i < s.length(); i++) { // 알파벳 개수 +
			cnt[s.charAt(i) - 97]++;
		}
		s = br.readLine(); // 두 번째 문자열
		for (int i = 0; i < s.length(); i++) { // 알파벳 개수 -
			cnt[s.charAt(i) - 97]--;
		}
		int ans = 0; // 절댓값의 합
		for (int tmp : cnt) {
			ans += Math.abs(tmp); // 절댓값 더하기
		}
		System.out.println(ans); // 출력
		br.close();
	}
}