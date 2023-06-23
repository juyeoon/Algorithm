import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// (좀비가 먹는 뇌의 수) >= (좀비가 먹어야 하는 뇌의 수)면 "MMM BRAINS" 출력
// 아니면 "NO BRAINS" 출력
public class B4562_No_Brainer {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine()); // 입력 개수
		for (int tc = 0; tc < n; tc++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()); // 좀비가 먹는 뇌의 수
			int y = Integer.parseInt(st.nextToken()); // 좀비가 먹어야 하는 뇌의 수
			sb.append(x >= y ? "MMM BRAINS" : "NO BRAINS").append("\n");
		}
		System.out.println(sb); // 출력
		br.readLine();
	}
}