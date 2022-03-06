import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11659_구간_합_구하기4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 숫자 개수
		int M = Integer.parseInt(s[1]); // 구간 합 구해야 하는 횟수
		int num[] = new int[N]; // 주어진 숫자
		int psum[] = new int[N]; // 구간 합 // [0]: 0~0, [1]: 0~1, ...
		s = br.readLine().split(" ");
		num[0] = Integer.parseInt(s[0]);
		psum[0] = num[0];
		for (int k = 1; k < N; k++) {
			num[k] = Integer.parseInt(s[k]);
			psum[k] = psum[k - 1] + num[k];
		} // input 및 구간합 구하기
		for (int k = 0; k < M; k++) { // M만큼 반복
			s = br.readLine().split(" ");
			int i = Integer.parseInt(s[0]) - 1; // [i]부터
			int j = Integer.parseInt(s[1]) - 1; // [j]까지의 합
			if (i == j) { // i == j이면, [i]
				sb.append(num[i]);
			} else if (i == 0) { // i == 0이면, 구간합[j]
				sb.append(psum[j]);
			} else { // [i]부터 [j]까지의 합 = 0~j까지의 합 - 0~(i-1)까지의 합
				sb.append(psum[j] - psum[i - 1]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
