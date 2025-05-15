import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/15236
// N세트 도미노의 점의 총 개수를 구하는 문제
// N세트의 도미노의 점 개수는 점 0개짜리 N+2개, 점 1개짜리 N+2개, ... , 점 N개짜리 N+2개
// 즉, 1부터 N까지의 합 * (N+2)개 = (N * (N + 1) / 2) * (N + 2)
public class B15236_Dominos {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 세트값
		int sum = (N * (N + 1) / 2) * (N + 2); // 점의 총 개수
		System.out.println(sum); // 출력
		br.close();
	}
}
