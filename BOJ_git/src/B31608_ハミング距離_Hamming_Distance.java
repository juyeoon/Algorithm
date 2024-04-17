import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 길이가 같은 두 문자열이 주어졌을 때 같은 위치의 문자를 비교한 후 다른 개수를 출력하는 문제
public class B31608_ハミング距離_Hamming_Distance {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 두 문자열의 길이
		String S = br.readLine(); // 입력 문자열 S
		String T = br.readLine(); // 입력 문자열 T
		int ans = 0; // 같은 위치의 문자가 다른 개수
		for (int i = 0; i < N; i++) {
			if (S.charAt(i) != T.charAt(i)) { // 같은 위치의 문자가 다르면
				ans++; // 카운트
			}
		}
		System.out.println(ans); // 개수 출력
		br.close();
	}
}