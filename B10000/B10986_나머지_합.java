import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// (A - B) % C = ((A % C) - (B % C)) % C을 이용
// 구간 합 (pSum[j] - pSum[i])이 M의 배수인지 알아보려면 (pSum[j] - pSum[i]) % M이 0인지 확인
// (pSum[j] - pSum[i]) % M이 0이려면 위의 공식에 따라서 (pSum[j] % M)와 (pSum[i] % M)이 같으면 0
// 따라서 구간 합이 M으로 나누어 떨어지는 (i,j) 쌍의 개수는
// (pSum[k] % M)가 0인 값의 개수 (=> A1부터 Ak까지의 합이 M의 배수인 경우)
// + (pSum[k] % M)가 0인 값 중 2개 선택 경우의 수 + (pSum[k] % M)가 1인 값 중 2개 선택 경우의 수 + ... + (pSum[k] % M)가 M-1인 값 중 2개 선택 경우의 수
public class B10986_나머지_합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//
		int N = Integer.parseInt(st.nextToken()); // 수 개수
		int M = Integer.parseInt(st.nextToken()); // 나눌 수
		//
		long pSum[] = new long[N]; // 누적합 배열 ([i] => 0부터 i까지의 합)
		long cnt[] = new long[M]; // pSum[]을 M으로 나눈 나머지의 개수 저장 배열([i] => 나눈 값이 i인 개수)
		//
		st = new StringTokenizer(br.readLine());
		pSum[0] = Long.parseLong(st.nextToken()); // [0]값
		for (int i = 1; i < N; i++) { // pSum[] 채우기
			pSum[i] = pSum[i - 1] + Long.parseLong(st.nextToken());
		}
		//
		for (int i = 0; i < N; i++) { // cnt[] 채우기
			int remainder = (int) (pSum[i] % M);
			cnt[remainder]++;
		}
		//
		long ans = cnt[0]; // 나눈 나머지가 0인 것의 개수
		for (int i = 0; i < M; i++) { // 나머지가 i인 수 중 2개 선택 경우의 수 구하기 (NC2, N은 수의 개수)
			if (cnt[i] > 1) {
				ans += cnt[i] * (cnt[i] - 1) / 2;
			}
		}
		//
		System.out.println(ans); // 출력
		br.close();
	}
}