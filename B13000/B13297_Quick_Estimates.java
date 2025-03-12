import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/13297
// 주어진 금액(10^100까지)의 자리수를 구하는 문제
// 금액 범위가 크기 때문에 String으로 입력 받고 .length()를 출력
public class B13297_Quick_Estimates {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 비용 개수
		for (int i = 0; i < N; i++) {
			String cost = br.readLine(); // 비용
			sb.append(cost.length()).append("\n"); // 길이 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
