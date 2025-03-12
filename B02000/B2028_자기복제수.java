import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N과 N^2를 1의 자리수부터 N의 자리수 개수만큼 자리수가 같은지 확인
// 모두 같으면 자기복제수가 맞음
public class B2028_자기복제수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 자연수 N
			int N2 = N * N; // 자연수 N의 제곱값
			boolean yes = true; // 자기복제수 여부(true: 자기복제수)
			while (N > 0) { // N의 모든 자리수를 확인할 때까지 반복
				if (N % 10 != N2 % 10) { // N의 1의 자리수와 N^2의 1의 자리수가 다르면
					yes = false; // 자기복제수가 아님
					break;
				}
				N /= 10; // N의 1의 자리수 삭제
				N2 /= 10; // N2의 1의 자리수 삭제
			}
			sb.append(yes ? "YES\n" : "NO\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
