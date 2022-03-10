import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1157_단어_공부 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();// 주어진 문자열
		int count[] = new int[26]; // 알파벳 별 나온 횟수([0]: A나 a가 나온 횟수, ...)
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c < 'a') { // 대문자
				count[c - 'A']++;
			} else { // 소문자
				count[c - 'a']++;
			}
		}
		int max = 0; // 최대 횟수
		int maxIdx = -1; // 최대 횟수가 나온 인덱스
		for (int i = 0; i < 26; i++) {
			if (max < count[i]) { // 최댓값 설정
				max = count[i];
				maxIdx = i;
			}
		}
		int cnt = 0; // 최대 횟수인 알파벳 개수
		for (int i : count) {
			if (i == max) {
				cnt++;
			}
		}
		// 최대 횟수인 알파벳이 1개면 알파벳 출력, 2 이상이면 '?' 출력
		System.out.println(cnt == 1 ? (char) (maxIdx + 'A') : "?");
	}
}
