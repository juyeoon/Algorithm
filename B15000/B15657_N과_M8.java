import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

// 중복조합(NHM) - 재귀
public class B15657_N과_M8 {
	static int N, M;
	static int[] nums, arr;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 숫자 개수
		M = Integer.parseInt(st.nextToken()); // 뽑을 숫자 개수
		nums = new int[N]; // 숫자 배열
		arr = new int[M]; // 조합 배열
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		} // input
		Arrays.sort(nums); // 정렬
		comb(0, 0); // NHM
		System.out.println(sb); // 출력
		br.close();
	}
	// NHM
	public static void comb(int start, int cnt) { // 시작 숫자, 현재 뽑은 숫자 개수
		// 기저
		if (cnt == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		// 유도
		for (int i = start; i < N; i++) {
			arr[cnt] = nums[i];
			comb(i, cnt + 1);
		}
	}
}