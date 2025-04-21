import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/25175
// K모가 되기 위해서는 (K - 3)만큼 반시계 방향으로 이동
// 0부터 시작하게 수정: (M - 1) + (K - 3)
// 원형이므로 모듈러 연산 사용: (M - 1 + (K - 3)) % N
// 중간에 음수가 나올 수 있으므로 +N 후 다시 %N 처리: ((M - 1 + (K - 3)) % N + N) % N
// 최종적으로 다시 1-based 인덱스로 환산: ((M - 1 + (K - 3)) % N + N) % N + 1
public class B25175_두_부_두부_두부 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 총 인원 수
		int M = Integer.parseInt(st.nextToken()); // 현재 차례인 사람 번호
		int K = Integer.parseInt(st.nextToken()); // 외친 두부의 모 수
		System.out.println(((M - 1 + (K - 3)) % N + N) % N + 1); // 출력
	}
}
