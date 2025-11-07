import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 19774 - ABCD-код
// https://www.acmicpc.net/problem/19774
// 코드의 앞 두 자리(AB)와 뒤 두 자리(CD)를 각각 두 자리 수로 보고
// AB^2 + CD^2 를 계산했을 때, 7로 나눈 나머지가 1이면 "YES", 아니면 "NO" 를 출력
public class B19774_ABCD_код {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 코드 후보 개수
		for (int tc = 0; tc < T; tc++) {
			String s = br.readLine(); // 4자리 숫자 문자열 (앞의 0도 포함)
			// 각 자리의 숫자 추출
			int A = s.charAt(0) - '0';
			int B = s.charAt(1) - '0';
			int C = s.charAt(2) - '0';
			int D = s.charAt(3) - '0';
			// 두 자리 수 AB, CD 만들기
			long ab = A * 10 + B;
			long cd = C * 10 + D;
			// AB^2 + CD^2 을 계산하고 7로 나눈 나머지가 1인지 확인
			long value = ab * ab + cd * cd;
			sb.append((value % 7 == 1) ? "YES" : "NO").append("\n");
		}
		System.out.print(sb);
		br.close();
	}
}
