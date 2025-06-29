import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/31244
// 세 숫자 A, B, C가 주어졌을 때, 이 숫자로 시작하는 가장 작은 대칭수를 만드는 문제
// 첫 번째 숫자와 마지막 숫자가 같으면 3자리, 두 번째와 마지막이 같으면 4자리, 모두 다르면 5자리로 만듦
public class B31244_СИМЕТРИЧНИ_ЧИСЛА {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()); // 숫자 a
		int b = Integer.parseInt(st.nextToken()); // 숫자 b
		int c = Integer.parseInt(st.nextToken()); // 숫자 c
		int ans = 0; // 정답 저장
		if (a == c) { // 첫 번째와 세 번째 숫자가 같으면 -> 3자리 대칭수 가능
			ans = a * 100 + b * 10 + c;
		} else if (b == c) { // 두 번째와 세 번째 숫자가 같으면 -> 4자리 대칭수 가능
			ans = a * 1000 + b * 100 + c * 10 + a;
		} else { // 그 외 -> 5자리 대칭수 필요
			ans = a * 10000 + b * 1000 + c * 100 + b * 10 + a;
		}
		System.out.println(ans); // 출력
		br.close();
	}
}
