import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/26198
// 주어진 알파벳을 제외한 문자는 무시. 주어진 알파벳에 따른 정수를 더하여 출력
public class B26198_Chronogram {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		for (int tc = 1; tc <= T; tc++) {
			char[] c = br.readLine().toCharArray(); // 연대문
			int sum = 0; // 암호화된 연도 합
			for (int i = 0; i < c.length; i++) {
				if (c[i] == 'I') {
					sum += 1;
				} else if (c[i] == 'V') {
					sum += 5;
				} else if (c[i] == 'X') {
					sum += 10;
				} else if (c[i] == 'L') {
					sum += 50;
				} else if (c[i] == 'C') {
					sum += 100;
				} else if (c[i] == 'D') {
					sum += 500;
				} else if (c[i] == 'M') {
					sum += 1000;
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
