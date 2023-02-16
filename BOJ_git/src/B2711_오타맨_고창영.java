import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// StringBuffer의 deleteCharAt(idx)를 이용하여 특정 위치의 문자를 제거
public class B2711_오타맨_고창영 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int idx = Integer.parseInt(st.nextToken()); // 제거 위치(첫 번째 문자가 1)
			StringBuffer s = new StringBuffer(st.nextToken()); // 입력 문자열
			s.deleteCharAt(idx - 1); // 특정 위치의 문자를 제거(첫 번째 문자가 0이기 때문에 -1 하기)
			sb.append(s).append("\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}