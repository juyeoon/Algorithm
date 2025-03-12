import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 연속으로 같은 수(방법)가 올 수 없는데 3과 6이 같은 수이어야 하므로 6은 불가능. 6에서 불가능하므로 6 이상은 불가능
// 6 미만일 때 시작 수가 0이면 01010, 1이면 10101
// 0과 1을 바꾸기 위해 boolean으로 입력 받아 not 연산으로 바꿈
public class B17210_문문문 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long N = Long.parseLong(br.readLine().trim()); // 문의 개수
		int p = Integer.parseInt(br.readLine().trim()); // 문 여는 방법
		boolean start = p == 0 ? false : true; // 0: false, 1: true
		if (N >= 6) { // 6 이상으론 갈 수 없음
			sb.append("Love is open door");
		} else {
			for (int i = 1; i < N; i++) { // 두번째 문(1)부터 N번째 문(N-1)까지
				start = !start; // 직전과 다른 방법으로 열기
				sb.append(start ? 1 : 0).append("\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}