import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2번 나오지 않는 번호의 여학생 출력(A, B 상관 X)
public class B1380_귀걸이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine()); // 학생 수
		int sce = 1; // 시나리오 번호
		while (n != 0) { // n이 0이면 종료
			String[] name = new String[n]; // 학생 이름
			for (int i = 0; i < n; i++) { // input 학생 이름
				name[i] = br.readLine();
			}
			int[] cnt = new int[n + 1]; // 번호 나온 수 (1~n)
			for (int i = 2 * n - 1; i > 0; i--) { // 번호 나온 수 카운트(A,B 상관 x)s
				st = new StringTokenizer(br.readLine());
				cnt[Integer.parseInt(st.nextToken())]++;
			}
			int num = 0; // 1번만 나온 번호
			for (int i = 1; i <= n; i++) { // num 찾기
				if (cnt[i] == 1) {
					num = i;
				}
			}
			sb.append(sce++).append(" ").append(name[num - 1]).append("\n"); // 출력ㄴ
			n = Integer.parseInt(br.readLine()); // 학생 수 갱신(다음 시나리오)
		}
		System.out.println(sb);
		br.close();
	}
}
