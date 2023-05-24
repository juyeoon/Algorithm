import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// (a3 - a2 == a2 - a1)이면 등차수열 그 외에는 등비수열
// 등차수열에서 다음 항 : (a3 + (a3 - a2))
// 등비수열에서 다음 항 : (a3 * (a3 / a2))
public class B4880_다음수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		while (!(s = br.readLine()).equals("0 0 0")) { // EOF
			st = new StringTokenizer(s);
			int a1 = Integer.parseInt(st.nextToken()); // 첫 항
			int a2 = Integer.parseInt(st.nextToken()); // 둘째 항
			int a3 = Integer.parseInt(st.nextToken()); // 셋째 항
			if (a3 - a2 == a2 - a1) { // 등차수열인 경우
				sb.append("AP ").append(a3 + (a3 - a2)).append("\n");
			} else { // 등비 수열인 경우
				sb.append("GP ").append(a3 * (a3 / a2)).append("\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}