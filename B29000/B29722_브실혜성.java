import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/29722
// 다음 관칙일의 일수를 구한 후 연-월-일을 구함
public class B29722_브실혜성 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		int y = Integer.parseInt(st.nextToken()); // 연
		int m = Integer.parseInt(st.nextToken()); // 월
		int d = Integer.parseInt(st.nextToken()); // 일
		long N = Long.parseLong(br.readLine()); // 브실이를 볼 수 있는 주기
		long today = y * 360 + (m - 1) * 30 + (d - 1); // 오늘 날짜를 일수로 변환 (0일부터 시작)
		long next = today + N; // 다음 관측일
		long nextY = next / 360; // 다음 관측일 연도
		long remain = next % 360; // 해당 연도의 남은 일수
		int nextM = (int) (remain / 30) + 1; // 월
		int nextD = (int) (remain % 30) + 1; // 일
		System.out.printf("%04d-%02d-%02d%n", nextY, nextM, nextD); // 포맷에 맞게 출력
		br.close();
	}
}
