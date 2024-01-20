import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 계약 만기일 이전에 베니스에 도착할 수 있는 선박의 화물의 총 양을 출력
public class B13496_The_Merchant_of_Venice {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 입력 데이터 세트 수
		for (int tc = 1; tc <= T; tc++) {
			String inp1[] = br.readLine().split(" ");
			int n = Integer.parseInt(inp1[0]); // 선박 수
			int s = Integer.parseInt(inp1[1]); // 선박 일일 속도
			int d = Integer.parseInt(inp1[2]); // 계약 만기까지 남은 일 수
			int ans = 0; // 얻을 수 있는 화물의 양
			for (int i = 0; i < n; i++) {
				String inp2[] = br.readLine().split(" ");
				int a = Integer.parseInt(inp2[0]); // 베니스에서 선박까지 거리
				int b = Integer.parseInt(inp2[1]); // 선박 하중
				if (s * d >= a) { // 계약 만기일 이전에 베니스에 도착할 수 있으면
					ans += b; // 화물의 양 추가
				}
			}
			sb.append("Data Set ").append(tc).append(":\n");
			sb.append(ans).append("\n\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}