import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/25024
// 각 월의 마지막 일을 배열에 저장한 후
// 시:분 체크 => x가 0~23, y가 0~59를 둘 다 만족하면 Yes, 아니면 No
// 월:일 체크 => x가 1~12, y가 1~해당 월의 마지막 날을 둘 다 만족하면 Yes, 아니면 No
public class B25024_시간과_날짜 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		int[] lastDays = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 각 월의 마지막 일
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()); // 첫번째 수
			int y = Integer.parseInt(st.nextToken()); // 두번째 수
			sb.append((0 <= x && x <= 23 && 0 <= y && y <= 59) ? "Yes" : "No").append(" "); // 시:분
			sb.append((1 <= x && x <= 12 && 1 <= y && y <= lastDays[x]) ? "Yes" : "No").append("\n"); // 월:일
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
