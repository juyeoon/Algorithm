import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력받은 수가 9의 배수인지 판별하는 문제
// 입력 수의 범위가 10^100000 이기 때문에 입력 수 자체를 9로 나누는 것보다
// 9의 배수 판별법인 각 자리의 수의 합을 구하여 그 수가 9의 배수이면 원래의 수도 9의 배수라는 판별법을 사용
public class B13366_Math_Contest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			char c[] = br.readLine().toCharArray(); // 한자리 숫자들로 자르기
			int end = c.length; // 반복문 종료 조건
			int sum = 0; // 각 자리 수의 합
			for (int i = 0; i < end; i++) { // 수의 합 구하기
				sum += c[i] - '0';
			}
			if (sum % 9 == 0) { // 수의 합이 9의 배수면 원래 수도 9의 배수
				sb.append("YES\n");
			} else { // 아니면 9의 배수가 아님
				sb.append("NO\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}