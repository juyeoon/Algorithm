import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//이분 탐색 문제
//주의해야 할 부분 - data type(long)
public class B1654_랜선_자르기 {
	static int arr[];
	static int K, N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		K = Integer.parseInt(s[0]); // 영식이의 랜선 개수
		N = Integer.parseInt(s[1]); // 필요한 랜선 개수
		arr = new int[K]; // 영식이의 랜선 길이
		long sum = 0; // 영식이의 랜선 길이의 합 - end 계산 위함
		for (int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}//input 및 sum 계산
		long start = 1; // 무조건 가능한 것
		long end = sum / N + 1; // 무조건 불가능한 것
		while (start + 1 < end) { // 이분 탐색
			long mid = (start + end) / 2; //start와 end의 가운데 수
			if (check(mid)) { // mid가 가능 -> start = mid
				start = mid;
			} else { // mid가 불가능 -> end = mid
				end = mid;
			}
		}
		System.out.println(start);
		br.close();
	}
	//mid가 가능한지 체크
	public static boolean check(long mid) {
		int cnt = 0;
		for (int i = 0; i < K; i++) {
			cnt += arr[i] / mid;
		}
		if (cnt >= N) {
			return true;
		} else {
			return false;
		}
	}
}
