import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/16676
// 0부터 N까지의 모든 수를 만들기 위해 필요한 팩 수는 가장 많이 반복되는 경우는 보통 111... 형태의 수를 기준으로 다름
// N의 자릿수를 len이라 할 때 len자리의 111...과 비교해서 크거나 같으면 111...이 포함되므로 len만큼 필요
// 그 값보다 적으면 최대 len -1만큼 필요
// 단, 최소 1만큼 필요
public class B16676_근우의_다이어리_꾸미기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine(); // 정수 N
		int len = N.length(); // N의 길이
		int oneone = 0; // N의 길이만큼의 111...
		int tenSquare = 1; // oneone을 구하기 위한 10의 제곱수
		for (int i = 0; i < len; i++) { // oneone 구하기
			oneone += tenSquare;
			tenSquare *= 10;
		}
		// N이 oneone보다 크면 N의 길이만큼 필요, 아니면 N의 길이 - 1 만큼 필요
		int ans = (Integer.parseInt(N) >= oneone) ? len : len - 1;
		ans = Math.max(ans, 1); // 최소 1개 필요
		System.out.println(ans); // 출력
		br.close();
	}
}
