import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11908
// 카드가 한 장 남을 때까지 반복하면 결국 남는 카드는 최댓값
// 모든 카드의 합을 구한 후 최댓값을 뺀 후 그 값을 출력
public class B11908_카드 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 카드 개수
		int sum = 0; // 뒷면 숫자의 합
		int max = 0; // 숫자들 중 최댓값
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) { // sum과 max 구하기
			int c = Integer.parseInt(st.nextToken());
			sum += c;
			max = Math.max(max, c);
		}
		System.out.println(sum - max); // 출력
		br.close();
	}
}
