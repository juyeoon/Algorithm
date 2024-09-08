import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제는 우측부터 생각하기 때문에 좌측부터 처음을 0으로 생각하면 짝수 번호를 가지는 값을 짝수 번째 값이라고 생각
// 홀수 번째는 그냥 숫자를 더하고
// 짝수 번째는 숫자를 2배한 후 10이 넘으면 각 자리수를 더한 값을 더하기
public class B14726_신용카드_판별 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			char c[] = br.readLine().toCharArray();
			int sum = 0; // 모든 자리수에 대한 값의 합
			for (int i = 0; i < c.length; i++) {
				int num = c[i] - '0'; // 현재 자리 수
				if (i % 2 == 0) { // 짝수면
					num *= 2; // 2배한 후
					if (num >= 10) { // 10이 넘으면
						num = num / 10 + num % 10; // 각 자리수 더하기
					}
				}
				sum += num; // 합에 현재 값 더하기
			}
			sb.append(sum % 10 == 0 ? "T\n" : "F\n"); // 10의 배수면 T
		}
		System.out.println(sb); // 출력
		br.close();
	}
}