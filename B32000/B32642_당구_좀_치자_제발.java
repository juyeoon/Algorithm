import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/32642
// 비가 오지 않는 날(당구를 치는 날)의 분노 = 분노 - 1
// 비가 오는 날(당구를 치지 않는 날)의 분노 = 분노 + 1
// 각 날의 분노의 합을 구하는 문제
public class B32642_당구_좀_치자_제발 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 일 수
		long sum = 0; // 분노의 합
		long anger = 0; // 현재 분노
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			if (Integer.parseInt(st.nextToken()) == 1) { // 비가 오는 날
				anger++;
			} else { // 비가 오지 않는 날
				anger--;
			}
			sum += anger; // 분노의 합
		}
		System.out.println(sum); // 출력
		br.close();
	}
}
