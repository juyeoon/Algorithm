import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이분 탐색 - 나무 길이를 기준으로
public class B2805_나무_자르기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 나무 수
		int M = Integer.parseInt(st.nextToken()); // 필요한 길이
		st = new StringTokenizer(br.readLine());
		int[] tree = new int[N]; // 나무 배열
		int start = 0; // 이분 탐색 시작 - 전기톱 높이 최소
		int end = 0; // 이분 탐색 끝 - 전기톱 높이 최대
		for (int i = 0; i < N; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			if (end < tree[i])
				end = tree[i]; // 나무 길이 최대값으로 끝 설정
		} // input
			// 이분탐색
		while (start < end) {
			int mid = (start + end) / 2; // 이분 탐색 중간
			long sum = 0; // 잘려진 나무 길이
			for (int i : tree) {
				if (i - mid > 0) {
					sum += i - mid;
				}
			} // sum 계산
			if (sum < M) { // 나무 길이 모자르면 end를 옮김
				end = mid;
			} else { // 나무 길이 남거나 같으면 start를 옮김(최소 구하기 위해서)
				start = mid + 1;
			}
		}
		System.out.println(start - 1); // 전기톱 높이 최댓값 출력
		br.close();
	}
}
