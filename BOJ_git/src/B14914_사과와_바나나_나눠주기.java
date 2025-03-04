import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14914
// 최댓값이 1000이므로 1부터 입력 두 수 a, b 중 최솟값까지 
// a, b를 각각 나누었을 때 나누어떨어지는 수와 그 수로 나누었을 때의 목을 출력
public class B14914_사과와_바나나_나눠주기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()); // 사과의 수
		int b = Integer.parseInt(st.nextToken()); // 바나나의 수
		int end = Math.min(a, b); // 반복문 종료 조건
		for (int i = 1; i <= end; i++) {
			if (a % i == 0 && b % i == 0) { // 두 수 모두 나누어떨어지면 출력 저장
				sb.append(i).append(" ").append(a / i).append(" ").append(b / i).append("\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
