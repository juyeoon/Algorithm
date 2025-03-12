import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최소 나이 => 사망일 범위의 시작값(c) - 출생일 범위의 끝값(b)
// 최대 나이 => 사망일 범위의 끝값(d) - 출생일 범위의 시작값(a)
public class B10599_페르시아의_왕들 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		while (!(s = br.readLine()).equals("0 0 0 0")) { // EOI
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken()); // 출생일의 범위 시작값
			int b = Integer.parseInt(st.nextToken()); // 출생일의 범위 끝값
			int c = Integer.parseInt(st.nextToken()); // 사망일의 범위 시작값
			int d = Integer.parseInt(st.nextToken()); // 출생일의 범위 끝값
			sb.append(c - b).append(" ").append(d - a).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}