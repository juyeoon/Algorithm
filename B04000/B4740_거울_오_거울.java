import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// StringBuilder의 reverse()를 사용하여 문자열 뒤집기
public class B4740_거울_오_거울 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("***")) { // EOF
			StringBuilder tmp = new StringBuilder(s); // 뒤집을 문자열
			sb.append(tmp.reverse()).append("\n"); // 뒤집어서 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}