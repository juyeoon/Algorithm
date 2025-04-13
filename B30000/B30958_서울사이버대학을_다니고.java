import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/30958
// 입력 문자열의 알파벳 등장 횟수를 배열에 저장한 후 최댓값 찾기
public class B30958_서울사이버대학을_다니고 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 로고송 길이
		String s = br.readLine(); // 입력 문자열
		int[] cnt = new int[26]; // 각 알파벳의 등장 횟수
		for (int i = 0; i < N; i++) { // 등장 횟수 세기
			char c = s.charAt(i);
			if (c == ' ' || c == ',' || c == '.') { // 띄어쓰기, 쉼표, 마침표는 세지 않음
				continue;
			} else { // 알파벳 개수 갱신
				cnt[c - 'a']++;
			}
		}
		int max = 0; // 최대 등장 횟수
		for (int i : cnt) {
			if (max < i) {
				max = i;
			}
		}
		System.out.println(max); // 출력
		br.close();
	}
}
