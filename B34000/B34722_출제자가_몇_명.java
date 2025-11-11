import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/34722
public class B34722_출제자가_몇_명 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 사람 수
		int ans = 0; // 조건에 맞는 참가자 수
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			if (s >= 1000 || c >= 1600 || a >= 1500 || (r != -1 && r <= 30)) { // 출제 자격 조건
				ans++;
			}
		}
		System.out.println(ans); // 출력
		br.close();
	}
}
