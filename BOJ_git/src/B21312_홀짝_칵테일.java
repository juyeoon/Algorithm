import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 홀수인 칵테일이 짝수인 칵테일 보다 맛있음
// 똑같이 홀수이거나 짝수이면 맛이 더 큰 칵테일이 맛있음
// => 최대한 많이 홀수만 곱하기, 짝수만 있을 때는 전부 곱하기
// => 홀수와 짝수의 개수에 맞게 계산
public class B21312_홀짝_칵테일 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int abc[] = new int[3]; // 세 칵테일의 고유번호
		for (int i = 0; i < 3; i++) { // abc[] 채우기
			abc[i] = Integer.parseInt(st.nextToken());
		}
		int oddCnt = 0; // 홀수 개수
		for (int i = 0; i < 3; i++) { // 홀수 개수 세기
			if (abc[i] % 2 == 1) {
				oddCnt++;
			}
		}
		int ans = 0; // 출력값
		if (oddCnt == 0 || oddCnt == 3) { // 모두 짝수거나 모두 홀수일 때
			ans = abc[0] * abc[1] * abc[2]; // 모든 수의 곱이 최대
		} else if (oddCnt == 1) { // 한 수만 홀수 일 때
			for (int i = 0; i < 3; i++) { // 홀수를 찾아서 출력
				if (abc[i] % 2 == 1) {
					ans = abc[i];
					break;
				}
			}
		} else { // 홀수 2개 짝수 1개일 때
			int even = 0; // 짝수
			for (int i = 0; i < 3; i++) { // 짝수 찾기
				if (abc[i] % 2 == 0) {
					even = abc[i];
					break;
				}
			}
			ans = abc[0] * abc[1] * abc[2] / even; // 세 수의 곱에서 짝수 나누기 = 두 홀수의 곱
		}
		System.out.println(ans); // 출력
		br.close();
	}
}
