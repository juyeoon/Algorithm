import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 00:00:00 ~ N:59:59 동안 각 숫자에 하나 이상 K가 들어가면 카운트
// K가 포함되어 있는지 확인하는 방법 
// => h / 10 == K || h % 10 == K 
// || m / 10 == K || m % 10 == K 
// || s / 10 == K || s % 10 == K
public class B18312_시각 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 시각 범위
		int K = Integer.parseInt(st.nextToken()); // 찾는 숫자
		int cnt = 0; // K가 하나 이상 포함되어 있는 시각 개수
		for (int h = 0; h <= N; h++) { // 시
			for (int m = 0; m < 60; m++) { // 분
				for (int s = 0; s < 60; s++) { // 초
					// K가 하나라도 포함되어 있으면
					if (h / 10 == K || h % 10 == K || m / 10 == K || m % 10 == K || s / 10 == K || s % 10 == K) {
						cnt++; // 카운트
					}
				}
			}
		}
		System.out.println(cnt); // 카운트 출력
		br.close();
	}
}
