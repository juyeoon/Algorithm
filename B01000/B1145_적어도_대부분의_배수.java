import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 브루트포스 방법으로 5개의 수 중 최솟값부터 시작하여 값을 하나씩 증가시키며 5개의 수를 다 나눠본 후 3개 이상이 나누어 떨어지면 반복문 탈출
public class B1145_적어도_대부분의_배수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int num[] = new int[5]; // 5개의 수
		int n = Integer.MAX_VALUE; // 찾을 배수(최솟값부터 시작)
		for (int i = 0; i < 5; i++) { // input num[]
			num[i] = Integer.parseInt(s[i]);
			n = Math.min(n, num[i]); // 최솟값 찾기
		}
		while (true) {
			int cnt = 0; // 나누어떨어지는 수의 개수
			for (int i = 0; i < 5; i++) { // 5개의 수
				if (n >= num[i] && n % num[i] == 0) { // 배수인지 체크
					cnt++;
				}
			}
			if (cnt > 2) { // 3개 이상이면
				break; // 반복문 탈출
			}
			n++;
		}
		System.out.println(n); // 출력
		br.close();
	}
}