import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11288
// a^b mod 26 = (a mod 26) ^ b (곱할 때 마다 mod 반복)
// 복호: 'A'를 0으로 만들고 offset 만큼 뒤로 민 후 0 ~ 26 사이로 만든 후, 다시 'A'를 65(아스키)로 만든 후 출력 저장
public class B11288_Ethel_s_Encryption {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken()); // 암호화된 메시지의 문자 개수 (공백 포함)
		long a = Long.parseLong(st.nextToken()) % 26; // 오프셋을 계산하는 데 사용되는 값
		long b = Long.parseLong(st.nextToken());
		long offset = 1; // 오프셋
		for (int i = 0; i < b; i++) {
			offset *= a;
			offset %= 26;
		}
		String s = br.readLine();
		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if (c == ' ') { // 공백 스킵
				sb.append(c);
			} else { // 복호
				sb.append((char) ((c - 'A' + 26 - offset) % 26 + 'A'));
			}
		}
		System.out.println(sb);
		br.close();
	}
}
