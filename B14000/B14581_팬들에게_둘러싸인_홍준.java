import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// StringBuilder를 이용하여 출력문 사이에 입력문 넣기
public class B14581_팬들에게_둘러싸인_홍준 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine(); // 입력 문자열
		sb.append(":fan::fan::fan:\n");
		sb.append(":fan::").append(s).append("::fan:\n");
		sb.append(":fan::fan::fan:\n");
		System.out.println(sb); // 출력
		br.close();
	}
}
