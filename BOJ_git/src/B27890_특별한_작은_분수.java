import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N번 반복 계산
// Xi가 짝수면 2로 나눈 후 6으로 XOR
// Xi가 홀수면 2를 곱한 후 6으로 XOR
// XN 출력
public class B27890_특별한_작은_분수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int X0 = Integer.parseInt(s[0]); // 0초에서의 분수의 높이 (이후 Xi 저장)
		int N = Integer.parseInt(s[1]); // N(초)
		for (int i = 0; i < N; i++) {
			if (X0 % 2 == 0) { // 짝수면
				X0 = (X0 / 2) ^ 6; // 2로 나눈 후 6으로 XOR
			} else { // 홀수면
				X0 = (X0 * 2) ^ 6; // 2를 곱한 후 6으로 XOR
			}
		}
		System.out.println(X0); // 출력
		br.close();
	}
}