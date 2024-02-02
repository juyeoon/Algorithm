import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 다이나믹 프로그래밍 이용
// i가 1부터 N까지 값을 구하기
// i가 6으로 나누어지면 3으로 나눈 값까지의 최소 횟수, 2로 나눈 값까지의 최소 횟수, 1을 뺀 값까지의 최소 횟수 중 최솟값 + 1
// i가 3으로 나누어지면 3으로 나눈 값까지의 최소 횟수, 1을 뺀 값까지의 최소 횟수 중 최솟값 + 1
// i가 2로 나누어지면 2로 나눈 값까지의 최소 횟수, 1을 뺀 값까지의 최소 횟수 중 최솟값 + 1
// 그 외의 경우 1을 뺀 값까지의 최소 횟수 + 1
public class B1463_1로_만들기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 정수 N
		int minCnt[] = new int[N + 1]; // dp 값 저장 배열
		minCnt[1] = 0; // 초기값
		for (int i = 2; i <= N; i++) {
			if (i % 6 == 0) { // i가 6으로 나누어지면
				minCnt[i] = Math.min(minCnt[i / 3], Math.min(minCnt[i / 2], minCnt[i - 1])) + 1;
			} else if (i % 3 == 0) { // i가 3으로 나누어지면
				minCnt[i] = Math.min(minCnt[i / 3], minCnt[i - 1]) + 1;
			} else if (i % 2 == 0) { // i가 2으로 나누어지면
				minCnt[i] = Math.min(minCnt[i / 2], minCnt[i - 1]) + 1;
			} else { // 그 외의 경우
				minCnt[i] = minCnt[i - 1] + 1;
			}
		}
		System.out.println(minCnt[N]); // 출력
		br.close();
	}
}