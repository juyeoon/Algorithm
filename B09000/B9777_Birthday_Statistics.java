import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/9777
// 입력된 정보에서 보면 태어난 달에 관한 정보만 필요하므로 "/"로 나눠서 두 번째 데이터만 사용
public class B9777_Birthday_Statistics {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 직원의 수
		int[] monthCnt = new int[13]; // 태어난 달에 대한 직원 수
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), "/");
			st.nextToken();
			monthCnt[Integer.parseInt(st.nextToken())]++; // 직원 수 카운트
		}
		for (int i = 1; i <= 12; i++) { // 출력 저장
			sb.append(i).append(" ").append(monthCnt[i]).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
