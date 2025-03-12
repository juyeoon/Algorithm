import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Carlitos의 키가 제한 높이 이상인 개수 카운트
public class B29986_Amusement_Park_Adventure {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 기구 개수
		int H = Integer.parseInt(s[1]); // Carlitos의 키
		s = br.readLine().split(" ");
		int ans = 0; // 탈 수 있는 기구 개수
		for (int i = 0; i < N; i++) {
			if (H >= Integer.parseInt(s[i])) { // 키가 제한 높이 이상이면
				ans++; // 탈 수 있는 기구 개수+1
			}
		}
		System.out.println(ans); // 출력
		br.close();
	}
}