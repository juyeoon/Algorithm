import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/26004
// 입력 문자열의 각 문자의 등장횟수를 저장한 후 HIARC의 등장횟수를 확인하며 최솟값을 찾은 후 최솟값 출력
public class B26004_HI_ARC {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 입력 문자열 길이
		char s[] = br.readLine().toCharArray(); // 입력 문자열
		int cnt[] = new int[26]; // 각 알파벳의 출현 개수
		for (int i = 0; i < N; i++) { // 개수 세기
			cnt[s[i] - 'A']++;
		}
		int min = Integer.MAX_VALUE; // HIARC의 등장 횟수 중 최솟값
		String hiarc = "HIARC"; // 반복문을 돌리기 위한 변수
		for (int i = 0; i < hiarc.length(); i++) { // HIARC 등장 횟수 최솟값 세기
			char c = hiarc.charAt(i);
			min = Math.min(min, cnt[c - 'A']); // 최솟값 갱신
		}
		System.out.println(min); // 최솟값 출력
		br.close();
	}
}
