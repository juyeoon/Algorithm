import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// StringTokenizer를 이용하여 ","를 기준으로 나눈 후 토큰 개수 출력
public class B10821_정수의_개수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ","); // ","를 기준으로 나누기
		System.out.println(st.countTokens()); // 토큰 개수 출력
		br.close();
	}
}