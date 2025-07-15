import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/12871
// 문자열 s와 문자열 t 길이의 최소공배수를 찾은 후 길이가 최소공배수가 되도록 반복한 문자열을 각각 만듦
// 만들어진 반복된 문자열 f(s)와 f(t)가 같으면 1, 아니면 0 출력
public class B12871_무한_문자열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 문자열 s
		String t = br.readLine(); // 문자열 t
		boolean isSame = false; // f(s)와 f(t)가 같은지 아닌지
		int lcm = s.length() * t.length() / gcd(s.length(), t.length()); // 두 문자열 길이의 최소공배수
		StringBuilder sSb = new StringBuilder(); // 최소공배수 길이만큼 s를 반복한 문자열 (f(s))
		StringBuilder tSb = new StringBuilder(); // 최소공배수 길이만큼 t를 반복한 문자열 (f(t))
		int sRepeat = lcm / s.length(); // 문자열 s를 반복할 횟수
		int tRepeat = lcm / t.length(); // 문자열 t를 반복할 횟수
		for (int i = 0; i < sRepeat; i++) { // s 반복 문자열 만들기
			sSb.append(s);
		}
		for (int i = 0; i < tRepeat; i++) { // t 반복 문자열 만들기
			tSb.append(t);
		}
		if (sSb.toString().equals(tSb.toString())) { // f(s)와 f(t)가 같은지 확인
			isSame = true;
		}
		System.out.println(isSame ? 1 : 0); // 출력
		br.close();
	}

	public static int gcd(int a, int b) { // 최대공약수 찾기
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}
