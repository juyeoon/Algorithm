import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// "0 0"이 입력들어올 때까지 한 줄의 수 더하기를 반복
public class B5717_상근이의_친구들 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = ""; // 임력 문자열
		while (!((s = br.readLine()).equals("0 0"))) {
			st = new StringTokenizer(s);
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n"); // 한 줄 수 더하기
		}
		System.out.println(sb); // 출력
		br.close();
	}
}