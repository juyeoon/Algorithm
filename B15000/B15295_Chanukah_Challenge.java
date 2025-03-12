import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1일차에 1+1개, 2일차에 2+1개, ... n일차에 n+1개의 촛불을 사용할 때 사용하는 촛불의 총 개수를 구하는 문제
// 1부터 n일차까지 피워지는 촛불 수 + 1부터 n일차까지 촛불을 피우기 위해 사용하는 촛불의 수
// (n * (n+1) / 2) + (1 * n)
public class B15295_Chanukah_Challenge {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스(데이터셋 개수)
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sb.append(st.nextToken()).append(" "); // 데이터 번호
			int n = Integer.parseInt(st.nextToken()); // 일 수
			sb.append(n * (n + 1) / 2 + n).append("\n"); // 1부터 n까지의 합 + n
		}
		System.out.println(sb); // 출력
		br.close();
	}
}

