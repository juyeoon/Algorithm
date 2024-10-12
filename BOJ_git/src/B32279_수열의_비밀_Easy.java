import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 현재 항의 값의 이전 항의 값에 대해 계산하는 것이므로 수열의 값을 배열에 저장
// 현재 항의 값을 구하는 것은 주어진 값을 그대로 구현
public class B32279_수열의_비밀_Easy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[21]; // 수열의 값
		StringTokenizer st = new StringTokenizer(br.readLine());
		int p = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		a[1] = Integer.parseInt(br.readLine()); // 첫 번째 항
		int sum = a[1]; // n번째 항까지의 합
		for (int i = 2; i <= n; i++) { // 두번째 항부터 n번째 항까지 값 구하기
			if (i % 2 == 0) { // 짝수 항
				a[i] = p * a[i / 2] + q;
			} else { // 홀수 항
				a[i] = r * a[i / 2] + s;
			}
			sum += a[i]; // 합에 더하기
		}
		System.out.println(sum); // 출력
		br.close();
	}
}
