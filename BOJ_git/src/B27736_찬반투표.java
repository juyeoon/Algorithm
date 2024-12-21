import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/27736
// 찬성, 반대, 기권 표 개수를 구하고
// 기권 * 2 >= 전체 표 개수 : 무효
// 무효가 아닐 때, 찬성 > 반대 : 승인
// 그 외 : 통과 X
public class B27736_찬반투표 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 전체 표 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = 0; // 찬성표 개수
		int r = 0; // 반대표 개수
		int g = 0; // 기권표 개수
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if (tmp == 1) { // 찬성
				a++;
			} else if (tmp == -1) { // 반대
				r++;
			} else { // 기권
				g++;
			}
		}
		if (g * 2 >= N) { // 무효
			System.out.println("INVALID");
		} else { // 통과 or 통과 x
			System.out.println(a > r ? "APPROVED" : "REJECTED");
		}
		br.close();
	}
}
