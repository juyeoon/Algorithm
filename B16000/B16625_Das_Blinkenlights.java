import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/16625
// 각기 다른 주기로 깜빡이는 불이 함께 꺼지는 시점이 주어진 범위 안인지 구하는 문제
// 함께 꺼지는 시점 = 두 주기의 최소공배수
// 최소공배수 = 두 수의 곱 / 최대공약수
// p와 q의 최대공약수 = q와 p%q의 최대공약수
public class B16625_Das_Blinkenlights {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int p = Integer.parseInt(st.nextToken()); // 주기 p
		int q = Integer.parseInt(st.nextToken()); // 주기 q
		int s = Integer.parseInt(st.nextToken()); // 주어진 범위 s
		int gcd = (p > q) ? gcd(p, q) : gcd(q, p); // 최대공약수 구하기
		if (p * q / gcd <= s) { // 최소공배수가 범위 안이면
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		br.close();
	}

	public static int gcd(int p, int q) { // 재귀로 최대공약수 구하기
		int ret = 0;
		if (q == 0) { // 재귀 종료
			ret = p;
		} else { // 재귀
			ret = gcd(q, p % q);
		}
		return ret;
	}
}
