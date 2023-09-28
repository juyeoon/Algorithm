import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// if문으로 입력 구분
public class B5026_박사_과정 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()); // 문제 개수
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			if (s.charAt(0) == 'P') { // "P=NP"이면 
				sb.append("skipped\n");
			} else { // "a+b"형식이면 
				st = new StringTokenizer(s, "+"); // +를 기준으로 숫자 2개로 나누기
				sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}