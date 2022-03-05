import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//조합 문제 - 재귀 사용
public class B2798_블랙잭 {
	static int N, M;
	static int arr[];
	static int cb[];
	static int max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // N장의 카드
		M = Integer.parseInt(st.nextToken()); // M을 넘지 않으면서 M과 최대한 가까워야 함
		st = new StringTokenizer(br.readLine());
		arr = new int[N]; // 카드 배열
		cb = new int[3]; // 조합 배열
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		} // input
		comb(0, 0); // 조합
		System.out.println(max);
		br.close();
	}

	// 조합 만드는 메서드
	// cnt: 조합으로 만들어진 숫자 개수, start: 조합에 사용할 원소의 시작 인덱스
	public static void comb(int cnt, int start) {
		if (cnt == 3) { // 기저 조건
			int sum = 0;
			for (int i = 0; i < 3; i++) {
				sum += cb[i];
			}
			if (max < sum && sum <= M) {
				max = sum;
			}
			return;
		}
		// 유도 부분
		for (int i = start; i < N; i++) {
			cb[cnt] = arr[i];
			comb(cnt + 1, i + 1);
		}
	}
}
