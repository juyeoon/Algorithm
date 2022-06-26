import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 첫번째 수와 두번째 수를 비교
// 마지막 줄 0 0인지 체크
public class B4101_크냐qus {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		while (!(s = br.readLine()).equals("0 0")) { // 마지막 줄이 아니면 반복
			st = new StringTokenizer(s);
			// 첫번째 수 > 두번째 수 이면 Yes 아니면 Nos
			sb.append(Integer.parseInt(st.nextToken()) > Integer.parseInt(st.nextToken()) ? "Yes\n" : "No\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
