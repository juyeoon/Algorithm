import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/26509
// 1. 두 삼각형이 같은 삼각형인지 확인
// 2. 삼각형이 직각삼각형인지 확인
public class B26509_Triangle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			boolean yes = true; // 가능불가능 여부
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] t1 = new int[3]; // 첫번째 삼각형
			for (int i = 0; i < 3; i++) {
				t1[i] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			int[] t2 = new int[3]; // 두번째 삼각형
			for (int i = 0; i < 3; i++) {
				t2[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(t1); // 정렬
			Arrays.sort(t2);
			for (int i = 0; i < 3; i++) { // 1. 같은 삼각형인지 확인
				if (t1[i] != t2[i]) {
					yes = false;
					break;
				}
			}
			int a2 = t1[0] * t1[0]; // 2. 직각삼각형인지 확인
			int b2 = t1[1] * t1[1];
			int c2 = t1[2] * t1[2];
			if (a2 + b2 != c2) {
				yes = false;
			}
			sb.append(yes ? "YES" : "NO").append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
