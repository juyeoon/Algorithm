import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// N이 15000 이하이므로 정렬 가능
// 정렬한 후 가장 작은 값의 인덱스(0, min)과 가장 큰 값의 인덱스(N-1, max)를 저장 후
// 두 값의 합이 M보다 작으면 값 증가(min++)
// 두 값의 합이 M보다 크면 값 감소 (max--)
// 두 값의 합이 M과 같으면 카운트, min++, max--
// min이 max보다 작은 경우에만 반복
public class B1940_주몽 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 재료 개수
		int M = Integer.parseInt(br.readLine()); // 카운트가 올라가는 (기준)수
		String s[] = br.readLine().split(" ");
		int num[] = new int[N]; // 재료의 번호
		for (int i = 0; i < N; i++) { // num[] 채우기
			num[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(num); // 오름차순으로 정렬
		int min = 0; // 앞쪽 인덱스
		int max = N - 1; // 뒤쪽 인덱스
		int cnt = 0; // 합이 M인 경우 카운트
		while (min < max) {
			int sum = num[min] + num[max]; // 합
			if (sum < M) { // 두 값의 합이 M보다 작으면
				min++;
			} else if (sum > M) { // 두 값의 합이 M보다 크면
				max--;
			} else { // 두 값의 합이 M과 같으면
				cnt++;
				min++;
				max--;
			}
		}
		System.out.println(cnt); // 카운트 출력
		br.close();
	}
}