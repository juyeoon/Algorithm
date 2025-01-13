import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/11195
// 주어진 문자열의 문자 순서를 바꾸어 팰린드롬으로 바꿀 때 제거해야하는 최소한의 문자의 개수를 구하는 문제
// 문자열을 이루는 문자의 종류별 개수를 구한 후 홀수 개를 가지는 문자의 개수를 구함
// 개수가 0이면 0 출력, 0보다 크면 홀수 개를 가지는 문자 중 하나는 가운데 배치하면 되므로 종류 - 1 출력
public class B11195_Peragrams {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 문자열
		int alphabetCnt[] = new int[26]; // 문자 종류별 개수
		for (int i = s.length() - 1; i >= 0; i--) { // alphabetCnt[] 구하기
			alphabetCnt[s.charAt(i) - 'a']++;
		}
		int ans = 0; // 홀수 개를 가지는 문자 개수
		for (int i : alphabetCnt) { // ans 구하기
			if (i % 2 == 1) {
				ans++;
			}
		}
		System.out.println(ans == 0 ? ans : ans - 1); // 출력
		br.close();
	}
}
