import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/27983
public class B27983_리본_Easy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] X = new int[N];
		int[] L = new int[N];
		char[] C = new char[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			X[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			L[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			C[i] = st.nextToken().charAt(0);
		}
		int num1 = 0; // 정답 리본 번호1
		int num2 = 0; // 정답 리본 번호2
		Loop: for (int i = 0; i < N - 1; i++) { // 브루트포스로 탐색
			for (int j = i + 1; j < N; j++) {
				if (C[i] != C[j] && Math.abs(X[i] - X[j]) <= L[i] + L[j]) {
					num1 = i + 1;
					num2 = j + 1;
					break Loop;
				}
			}
		}
		// 출력
		if (num1 == 0 && num2 == 0) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
			System.out.println(num1 + " " + num2);
		}
		br.close();
	}
}
