import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/32801
// 1부터 n까지 a와 b로 나눈 나머지에 따라 개수를 세어 출력하는 문제
// a와 b 모두로 나누어 떨어지면 fizzbuzz
// a로만 나누어 떨어지면 fizz
// b로만 나누어 떨어지면 buzz
public class B32801_Generalized_FizzBuzz {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 확인할 숫자 범위
		int a = Integer.parseInt(st.nextToken()); // a
		int b = Integer.parseInt(st.nextToken()); // b
		int fb = 0; // fizzbuzz 개수
		int fz = 0; // fizz 개수
		int bz = 0; // buzz 개수
		for (int i = 1; i <= n; i++) { // 1부터 n까지 확인
			if (i % a == 0 && i % b == 0) { // 둘로 모두 나누어 떨어지면
				fb++;
			} else if (i % a == 0) { // a로만 나누어 떨어지면
				fz++;
			} else if (i % b == 0) { // b로만 나누어 떨어지면
				bz++;
			}
		}
		System.out.println(fz + " " + bz + " " + fb); // 출력
		br.close();
	}
}
