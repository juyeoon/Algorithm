import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 이름은 버블 소트지만 실제로 버블 소트를 사용하여 swap 횟수를 구하면 N범위 때문에 시간초과가 뜸
// 따라서 분할 정렬(O(nlogn))을 사용하여 구함
// 분할 정렬된 배열을 합쳐서 다시 배열을 만들 때 앞으로 오는 값의 이동 거리를 더하면 버블소트에서의 swap 횟수와 같음
// 주의: 앞으로 오는 값만 계산해야함, 뒤로 가는 값은 더하면 안 됨
public class B1517_버블_소트 {
	public static int[] num, tmp;
	public static int N;
	public static long ans;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); // 수 개수
		String s[] = br.readLine().split(" ");
		num = new int[N]; // 정렬된 배열
		tmp = new int[N]; // 정렬 중 사용할 배열
		for (int i = 0; i < N; i++) { // num[] 채우기
			num[i] = Integer.parseInt(s[i]);
		}
		sort(0, N - 1); // 분할 정렬
		System.out.println(ans); // 출력
		br.close();
	}

	public static void sort(int start, int end) { // 분할 정렬
		if (end - start < 1) { // 재귀 끝 조건
			return;
		}
		int mid = (start + end) / 2;
		sort(start, mid); // 앞쪽 절반 재귀 호출
		sort(mid + 1, end); // 뒤쪽 절반 재귀 호출

		for (int i = start; i <= end; i++) { // tmp[] 채우기
			tmp[i] = num[i];
		}

		int i = start; // num[] 인덱스
		int idx1 = start; // 앞쪽 절반 인덱스
		int idx2 = mid + 1; // 뒤쪽 절반 인덱스

		while (idx1 <= mid && idx2 <= end) { // 인덱스가 넘어가지 않는 범위에서 정렬하여 합치기
			if (tmp[idx1] > tmp[idx2]) { // 뒤쪽 절반에서 값을 가져올 때(값이 앞으로 올 때)
				ans += idx2 - i; // swap 횟수 더하기(이동 거리 더하기)
				num[i++] = tmp[idx2++]; // 정렬값 저장
			} else { // 앞쪽 절반에서 값 가져올 때
				num[i++] = tmp[idx1++]; // 정렬값 저장
			}
		}
		// 앞뒤 절반 배열에서 남은 값들 가져오기
		while (idx2 <= end) {
			num[i++] = tmp[idx2++];
		}
		while (idx1 <= mid) {
			num[i++] = tmp[idx1++];
		}
	}
}