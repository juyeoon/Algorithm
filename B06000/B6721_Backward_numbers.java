import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 두 개의 양의 정수(0 포함)를 입력 받았을 때 각 수를 뒤집은 수의 합을 뒤집은 값을 출력하는 문제
// Stringbuilder를 사용해서 문자열을 뒤집음
public class B6721_Backward_numbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < N; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringBuilder a = new StringBuilder(st.nextToken()); // 숫자 a
			StringBuilder b = new StringBuilder(st.nextToken()); // 숫자 b
			int sum = Integer.parseInt(a.reverse().toString()) + Integer.parseInt(b.reverse().toString()); // 각 수를 뒤집은									// 값의 합
			int ans = Integer.parseInt(new StringBuilder(Integer.toString(sum)).reverse().toString()); // 합을 뒤집은 값
			sb.append(ans).append("\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}