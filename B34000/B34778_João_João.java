import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/34778
public class B34778_João_João {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean[] exist = new boolean[5]; // 난이도 존재 체크
		for (int i = 0; i < 10; i++) { // exist[] 채우기
			exist[Integer.parseInt(st.nextToken())] = true;
		}
		int cnt = 0; // 필요한 난이도 개수
		for (int i = 1; i <= 4; i++) { // 개수 세기
			if (!exist[i]) {
				cnt++;
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
