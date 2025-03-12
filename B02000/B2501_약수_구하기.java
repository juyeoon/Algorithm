import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1부터 N까지 반복하면서 N을 나누었을 때 나머지가 0인 것을 카운트
// 카운트가 K랑 같아지면 그때의 값을 출력
// N까지 반복했을 때 카운트가 K랑 다르면 0 출력
public class B2501_약수_구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int K = Integer.parseInt(s[1]);
		int cnt = 0; // 약수 카운트
		int ans = 1; // 나누는 수
		while (ans <= N) { // 1부터 N까지 반복
			if (N % ans == 0) { // N을 나누었을 때 나머지가 0인 것을 카운트
				cnt++;
			}
			if (cnt == K) { // 카운트가 K랑 같아지면 반복문 탈출
				break;
			}
			ans++;
		}
		System.out.println((cnt == K) ? ans : 0); // 카운트가 K랑 같으면 그때의 값을 출력 다르면 0 출력
		br.close();
	}
}