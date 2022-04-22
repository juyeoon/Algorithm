import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//toCharArray() 사용해서 한 단어를 뒤의 인덱스부터 0까지 출력을 반복
public class B9093_단어_뒤집기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스(문장 수)
		for (int tc = 0; tc < T; tc++) { // 문장 수 만큼 반복
			st = new StringTokenizer(br.readLine()); // 문장을 " " 기준으로 나눔
			while (st.hasMoreTokens()) { // 단어 수 만큼 반복
				char[] c = st.nextToken().toCharArray(); // 단어를 문자 배열에 나눠서 넣음
				for (int i = c.length - 1; i >= 0; i--) { // 뒤에서부터 한 문자씩 sb에 추가
					sb.append(c[i]);
				}
				sb.append(" "); // 공백 추가(단어 끝)
			}
			sb.append("\n"); // 개행 추가(문장 끝)
		}
		System.out.println(sb); // 출력
		br.close();
	}
}