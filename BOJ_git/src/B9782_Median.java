import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 정렬된 수들이 주어졌을 때 중앙값을 구하는 문제
// 수가 홀수개인 경우, 중앙에 있는 하나의 값의 중앙값
// 수가 짝수개인 경우, 중앙에 있는 두 개의 값의 평균값이 중앙값
public class B9782_Median {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = ""; // 입력 문자열
		int tc = 1; // 테스크케이스 번호
		while (!(s = br.readLine()).equals("0")) { // EOI
			String num[] = s.split(" "); // 정렬 된 수
			int N = Integer.parseInt(num[0]); // 수 개수
			sb.append("Case ").append(tc++).append(": ");
			double median = 0; // 중앙값
			if (N % 2 == 1) { // 수가 홀수개인 경우
				median = Double.parseDouble(num[N / 2 + 1]); // 중앙값
			} else { // 수가 짝수개인 경우
				median = (Double.parseDouble(num[N / 2]) + Double.parseDouble(num[N / 2 + 1])) / 2; // 중앙값
			}
			sb.append(String.format("%.1f\n", median)); // 소수 첫째자리까지 반올림하여 출력
		}
		System.out.println(sb); // 출력
		br.close();
	}
}