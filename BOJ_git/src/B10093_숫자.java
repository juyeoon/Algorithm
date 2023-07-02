import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1. 두 수 (A, B)의 크기 비교
// 2. 사이 정수 개수  = 큰 수 - 작은 수 - 1
// 3. 작은 수 + 1 에서 큰 수 - 1 까지 반복하여 StringBuilder에 저장
public class B10093_숫자 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" ");
		long A = Long.parseLong(s[0]); // 수 1
		long B = Long.parseLong(s[1]); // 수 2
		if (A > B) { // A가 B보다 클 때
			sb.append(A - B - 1).append("\n"); // 사이 정수 개수
			for (long i = B + 1; i < A; i++) { // 사이 정수 출력
				sb.append(i).append(" ");
			}
		} else if (A < B) { // B가 A보다 클 때
			sb.append(B - A - 1).append("\n"); // 사이 정수 개수
			for (long i = A + 1; i < B; i++) { // 사이 정수 출력
				sb.append(i).append(" ");
			}
		} else { // 같을 때
			sb.append("0\n"); // 개수 0 출력
		}
		System.out.println(sb); // 출력
		br.readLine();
	}
}