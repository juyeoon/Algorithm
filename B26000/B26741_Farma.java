import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/26741
// 머리 수(X) = 마리수의 합과 같음
// 다리 수(Y) = 2*닭 마리 + 4*소 마리
// => 닭 = 2X - Y/2
// => 소 = Y/2 - X
public class B26741_Farma {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long X = Long.parseLong(st.nextToken()); // 머리 수
		long Y = Long.parseLong(st.nextToken()); // 다리 수
		long cows = Y / 2 - X; // 소의 수
		long chickens = X - cows; // 닭의 수
		System.out.println(chickens + " " + cows); // 출력
		br.close();
	}
}
