import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 한 줄에 공백으로 구분된 문자열이 같으면 OK
// 다르면 ERROR 출력
public class B11121_Communication_Channels {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			sb.append(st.nextToken().equals(st.nextToken()) ? "OK\n" : "ERROR\n"); // 문자열이 같으면 OK 아니면 ERROR 출력
		}
		System.out.println(sb); // 출력
		br.close();
	}
}