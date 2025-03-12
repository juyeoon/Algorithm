import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/25629
// 조건이 1) 홀수는 홀수번째, 짝수는 짝수번째에 존재 => 무조건 홀수 먼저 시작하므로 홀수가 짝수보다 같거나 하나 많아야 함
// 2) 홀수끼리와 짝수끼리는 같거나 증가 => 이 조건은 수들의 순서를 바꿔서 정렬할 수 있기 때문에 신경쓰지 않아도 됨
public class B25629_홀짝_수열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 수열의 길이
		StringTokenizer st = new StringTokenizer(br.readLine());
		int oddCnt = 0; // 홀수 개수
		int evenCnt = 0; // 짝수 개수
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(st.nextToken()); // 원소
			if (tmp % 2 == 0) { // 짝수
				evenCnt++;
			} else { // 홀수
				oddCnt++;
			}
		}
		// 조건 1에 따라 출력
		if (oddCnt - evenCnt == 0 || oddCnt - evenCnt == 1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		br.close();
	}
}
