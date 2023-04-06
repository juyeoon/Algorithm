import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 치킨 하나 당 N개보다 선호 사람 수가 많으면 N, 그 외에는 선호 사람 수
public class B27110_특식_배부 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 치킨 한 종류당 개수
		String s[] = br.readLine().split(" ");
		int ans = 0; // 선호하는 치킨을 받을 수 있는 인원수
		for (int i = 0; i < s.length; i++) {
			int cnt = Integer.parseInt(s[i]);
			ans += (cnt > N ? N : cnt); // 치킨 하나 당 N개보다 선호 사람 수가 많으면 N, 아니면 선호 사람 수 더하기
		}
		System.out.println(ans); // 출력
		br.close();
	}
}