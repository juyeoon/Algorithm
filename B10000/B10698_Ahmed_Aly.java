import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10698
// 주어진 다항식이 맞는 다항식인지 확인하는 문제
// if문으로 확인 후 출력 저장
public class B10698_Ahmed_Aly {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			sb.append("Case ").append(tc).append(": ");
			String s[] = br.readLine().split(" ");
			int X = Integer.parseInt(s[0]); // 피연산자 X
			int Y = Integer.parseInt(s[2]); // 피연산자 Y
			int Z = Integer.parseInt(s[4]); // 결과값 Z
			char O = s[1].charAt(0); // 연산자
			if ((O == '+' && X + Y == Z) || (O == '-' && X - Y == Z)) { // 다항식이 참이면
				sb.append("YES\n");
			} else { // 다항식이 거짓이면
				sb.append("NO\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
