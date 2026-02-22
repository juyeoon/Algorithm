import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14614
// A XOR B를 1번하면 A^B, 2번하면 A, 3번하면 A^B, ...
public class B14614_Calculate {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		String CS = st.nextToken(); // C를 String으로 받음
		int C = (CS.charAt(CS.length() - 1)) % 2; // C가 홀수인지 짝수인지 확인
		if (C == 0) { // C가 짝수
			System.out.println(A);
		} else { // C가 홀수
			System.out.println(A ^ B);
		}
		br.close();
	}
}
