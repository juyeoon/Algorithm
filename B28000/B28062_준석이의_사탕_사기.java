import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/28062
// 모든 사탕의 총합을 구하고 총합이 홀수냐 짝수냐에 따라 조건 분기하여 출력
public class B28062_준석이의_사탕_사기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 사탕 묶음의 개수
		int[] candy = new int[N]; // 각각의 사탕 묶음에 담겨있는 사탕의 개수
		int total = 0; // 모든 사탕 개수
		int minOdd = Integer.MAX_VALUE; // 최소 홀수
		boolean hasOdd = false; // 홀수 존재 여부 (true: 홀수 존재)
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) { // 배열에 사탕 수 저장, 모든 사탕 개수, 최소 홀수 구하기
			candy[i] = Integer.parseInt(st.nextToken());
			total += candy[i];
			if (candy[i] % 2 == 1) {
				hasOdd = true;
				minOdd = Math.min(minOdd, candy[i]);
			}
		}
		if (total % 2 == 0) { // 모든 사탕 총합이 딱수면 버릴 필요 없음
			System.out.println(total);
		} else if (hasOdd) { // total이 홀수이며 최소 홀수를 빼서 짝수로 만들 수 있는 경우
			System.out.println(total - minOdd);
		} else { // 짝수를 만들 수 없는 경우
			System.out.println(0);
		}
	}
}
