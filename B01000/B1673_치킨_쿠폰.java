import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 쿠폰을 모아 먹은 치킨도 쿠폰을 받을 수 있다는 것이 포인트
public class B1673_치킨_쿠폰 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		while ((s = br.readLine()) != null) { // EOF
			st = new StringTokenizer(s);
			int n = Integer.parseInt(st.nextToken()); // 처음 치킨을 시킨 수
			int k = Integer.parseInt(st.nextToken()); // 한마리 치킨을 시키기 위한 쿠폰 수
			long ans = n; // 총 먹은 치킨의 수
			while (n / k > 0) {
				ans += n / k;
				n = n / k + n % k;
			}
			sb.append(ans).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}