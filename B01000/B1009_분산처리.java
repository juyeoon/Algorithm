import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 두 가지 방법으로 풀이
// i) 일의 자리 수만 생각하여 제곱 횟수 만큼 일의 자리(10으로 나눈 나머지)를 계속 곱하기 => 1088ms
// ii) 일의 자리 수에 따른 규칙을 파악하여 경우를 나누고 경우에 맞게 계산하기 => 84ms
public class B1009_분산처리 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;

		// i) 일의 자리 수만 생각하여 제곱 횟수 만큼 일의 자리(10으로 나눈 나머지)를 계속 곱하기
//		int T = Integer.parseInt(br.readLine().trim()); // 테스트 케이스
//		for (int tc = 1; tc <= T; tc++) {
//			st = new StringTokenizer(br.readLine());
//			int a = Integer.parseInt(st.nextToken()); // 밑
//			int b = Integer.parseInt(st.nextToken()); // 지수
//			int ans = a % 10; // 일의 자리를 저장하는 변수. 아래의 조건문을 시행하지 않는 경우를 위해 10으로 나눈 나머지를 저장
//			for (int i = 1; i < b; i++) { // 앞에 a를 한 번 곱했으므로 b-1번 반복
//				ans *= a; // a를 곱하고
//				ans %= 10; // 일의 자리만 저장
//			}
//			sb.append((ans != 0) ? ans : 10).append("\n"); // 일의 자리가 0인 경우는 10으로 출력
//		}
//		System.out.println(sb); // 출력

		// ii) 일의 자리 수에 따른 규칙을 파악하여 경우를 나누고 경우에 맞게 계산하기
		int T = Integer.parseInt(br.readLine().trim()); // 테스트 케이스
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); // 밑
			int b = Integer.parseInt(st.nextToken()); // 지수
			int ans = a % 10; // 일의 자리를 저장하는 변수. 일의 자리의 수에 따라 경우를 나누므로 10으로 나눈 나머지를 저장
			if (ans == 2 || ans == 3 || ans == 7 || ans == 8) { // 주기가 4인 경우
				b = (b - 1) % 4; // b를 4로 나누어 a를 곱할 횟수로 만들기
				for (int i = 0; i < b; i++) { // a를 곱할 횟수만큼 반복
					ans = (ans * a) % 10; // a를 곱하고 일의 자리만 저장
				}
			} else if (ans == 4 || ans == 9) { // 주기가 2인 경우
				if (b % 2 == 0) { // b가 짝수인 경우에만 한 번 더 a를 곱해줌
					ans = (ans * a) % 10; // a를 곱하고 일의 자리만 저장
				}
			}
			// 나머지의 경우 몇 번을 곱하든 ans와 같음
			sb.append((ans != 0) ? ans : 10).append("\n"); // 일의 자리가 0인 경우는 10으로 출력
		}
		System.out.println(sb); // 출력
		br.close();
	}
}