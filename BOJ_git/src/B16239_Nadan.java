import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/16239
// 예산 K가 주어졌을 때 N개의 모두 다른 금액으로 나눈 것 중 하나를 출력하는 문제
// 한 금액의 최솟값만 있고 최댓값은 없기 때문에 N-1개를 1부터 하나씩 올린 값으로 정하고 마지막 N번째 값을 앞의 값을 뺀 값으로 설정하여 출력
public class B16239_Nadan {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine()); // 예산 K
		int N = Integer.parseInt(br.readLine()); // 나눌 개수 N
		for (int i = 1; i < N; i++) { // N-1개를 1부터 1씩 증가한 값으로 설정
			sb.append(i).append("\n");
			K -= i;
		}
		sb.append(K); // N번째 값은 앞의 값들을 뺀 값으로 설정
		System.out.println(sb); // 출력
		br.close();
	}
}
