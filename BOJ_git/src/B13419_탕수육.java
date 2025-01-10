import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/13419
// 사용할 문자열의 길이가 짝수, 홀수에 따라 방법이 다름
// 짝수: 짝수 인덱스 문자, 홀수 인덱스 문자로 나눔
// 홀수: 짝수 인덱스 문자 + 홀수 인덱스 문자 , 홀수 인덱스 문자 + 짝수 인덱스 문자
public class B13419_탕수육 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			char[] s = br.readLine().toCharArray(); // 게임에 사용할 문자열
			StringBuilder han = new StringBuilder(); // 환규가 기억해야하는 문자열
			StringBuilder tae = new StringBuilder(); // 태욱이 기억해야하는 문자열
			int leng = s.length; // 사용할 문자열 길이
			if (leng % 2 == 0) { // 길이가 짝수
				// 환규: 짝수 인덱스
				// 태욱: 홀수 인덱스
				for (int i = 0; i < leng; i += 2) {
					han.append(s[i]);
					tae.append(s[i + 1]);
				}
			} else { // 길이가 홀수
				// 환규: 짝수 인덱스 + 홀수 인덱스
				// 태욱: 홀수 인덱서 + 짝수 인덱스
				for (int i = 0; i < leng; i += 2) {
					han.append(s[i]);
				}
				for (int i = 1; i < leng; i += 2) {
					tae.append(s[i]);
				}
				for (int i = 0; i < leng; i += 2) {
					tae.append(s[i]);
				}
				for (int i = 1; i < leng; i += 2) {
					han.append(s[i]);
				}
			}
			// 출력 저장
			sb.append(han.toString()).append("\n");
			sb.append(tae.toString()).append("\n");
		}
		System.out.println(sb); // 저장
		br.close();
	}
}
