import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열이 대문자인지 확인하고 대문자면 아스키코드로 변환하고 계산하여 A가 1이 되게 변환 후 총점에 더하고
// 계산이 끝난 총점에 따라 출력
public class B15351_인생_점수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 입력 문자열 개수
		for (int tc = 0; tc < N; tc++) {
			char c[] = br.readLine().toCharArray(); // 입력 문자열을 문자 단위로 저장
			int sum = 0; // 총 점수
			for (int i = 0; i < c.length; i++) {
				if (65 <= c[i] && c[i] <= 90) { // 문자가 대문자면
					sum += c[i] - 64; // 점수 합하기 (A:1, ..., Z:26)
				}
			}
			if (sum == 100) { // 총 점이 100점이면
				sb.append("PERFECT LIFE");
			} else { // 이외의 점수이면
				sb.append(sum); // 점수 출력
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}