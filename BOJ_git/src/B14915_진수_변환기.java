import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14915
// 10진수를 n진수로 바꾸는 방법 => 10진수를 n으로 나눈 나머지를 역순으로 출력
public class B14915_진수_변환기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken()); // 주어진 10진수
		int n = Integer.parseInt(st.nextToken()); // 변환할 진수
		char c[] = new char[16]; // 16진수 기준으로 사용할 문자
		for (int i = 0; i < 10; i++) { // 0~9
			c[i] = (char) (i + '0');
		}
		for (int i = 0; i < 6; i++) { // 10~16
			c[10 + i] = (char) ('A' + i);
		}
		ArrayList<Character> num = new ArrayList<>(); // 나머지를 저장할 ArrayList (길이가 얼말지 모르기 때문에 List 사용)
		if (m == 0) { // 0이면 따로 처리
			sb.append(0);
		}
		while (m > 0) { // 나머지 구하기
			num.add(c[m % n]);
			m /= n;
		}
		for (int i = num.size() - 1; i >= 0; i--) { // 역순 출력
			sb.append(num.get(i));
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
