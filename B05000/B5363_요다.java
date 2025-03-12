import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// StringTokenizer를 사용해서 " "로 단어를 자르고 앞의 두 단어를 따로 저장 후 
// 그 다음 단어들을 순서대로 출력에 저장한 후 따로 저장한 앞의 두 단어를 붙이기
public class B5363_요다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 문자열 개수
		for (int tc = 0; tc < N; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String tmp = st.nextToken() + " " + st.nextToken(); // 앞의 두 단어 저장
			int end = st.countTokens(); // 남은 문자 개수(반복 횟수)
			for (int i = 0; i < end; i++) {
				sb.append(st.nextToken()).append(" "); // 출력문에 순서대로 단어 더하기
			}
			sb.append(tmp).append("\n"); // 출력문에 앞의 두 단어 더하기
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
