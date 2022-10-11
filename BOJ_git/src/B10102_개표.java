import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자가 A면 A의 개수를 ++, B면 B의 개수를 ++
// 두 수를 비교 후 가장 많은 쪽을 출력
public class B10102_개표 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int V = Integer.parseInt(br.readLine()); // 투표 수
		String s = br.readLine(); // 입력 문자열
		int A = 0; // A 득표수
		int B = 0; // B 득표수
		for (int i = 0; i < V; i++) {
			if (s.charAt(i) == 'A')
				A++; // 입력 문자가 A면 A 득표수 추가
			else
				B++; // 입력 문자가 B면 B 득표수 추가
		}
		System.out.println((A > B) ? 'A' : ((A < B) ? 'B' : "Tie")); // 결과 출력
		br.close();
	}
}