import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 대피소에서 동시에 하룻밤을 보낼 수 있는 최대 관광객 수 = 전체 크기 / 2 = W(행) * K(열) / 2
public class B8760_Schronisko {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			sb.append(Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()) / 2).append("\n"); // 대피소에서 동시에 하룻밤을 보낼 수 있는 최대 관광객 수
		}
		System.out.println(sb); // 출력
		br.close();
	}
}