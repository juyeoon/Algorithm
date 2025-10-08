import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/4655
// 1/2 + 1/3 + 1/4 + ... + 1/(n + 1)만큼 오버행이 쌓일 때
// 목표 길이를 만들기 위해 필요한 최소 카드 수를 출력하는 문제
// 목표 길이까지 더해서 확인 (단순 구현)
public class B4655_Hangover {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0.00")) { // EOI
			double c = Double.parseDouble(s); // 목표 길이
			double sum = 0.0; // 총 길이 합
			int n = 0; // 카드 수
			int k = 2; // 더할 분모
			while (sum < c) { // 목표 길이까지 가게 계속 더하기
				sum += 1.0 / k;
				n++;
				k++;
			}
			sb.append(n).append(" card(s)\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
