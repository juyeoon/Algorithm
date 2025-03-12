import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이분탐색 - 숫자가 시작하는 위치, 숫자가 끝나는 위치 구하기
public class B10816_숫자_카드2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()); // 숫자 카드 개수
		int[] cards = new int[N]; // 숫자 카드 배열
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		} // input
		Arrays.sort(cards); // 숫자 카드 정렬
		int M = Integer.parseInt(br.readLine()); // 확인할 숫자 개수
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken()); // 확인할 숫자
			// 숫자 개수 = 끝 위치 - 시작 위치
			// 카드에 숫자가 없으면 끝위치 = 시작 위치 => 개수 0
			sb.append(upperBound(cards, num) - lowerBound(cards, num)).append(" ");
		}
		System.out.println(sb);
		br.close();
	}

	// 숫자가 시작하는 위치(처음 숫자 위치)
	public static int lowerBound(int[] arr, int num) {
		int low = 0; // 처음
		int high = arr.length; // 끝
		while (low < high) { // 처음 < 끝일때만
			int mid = (low + high) / 2; // 중간
			if (arr[mid] >= num) { // 중간 값이 숫자보다 크거나 같으면
				high = mid; // 범위 밑으로 반 줄이기
			} else { // 중간 값이 숫자보다 작으면
				low = mid + 1; // 범위 위로 반 줄이기
			}
		}
		return low; // 시작 위치 리턴
	}

	// 숫자가 끝나는 위치(마지막 숫자 위치 +1)
	public static int upperBound(int[] arr, int num) {
		int low = 0; // 처음
		int high = arr.length; // 끝
		while (low < high) { // 처음 < 끝일때만
			int mid = (low + high) / 2; // 중간
			if (arr[mid] > num) { // 중간 값이 숫자보다 크면
				high = mid; // 범위 밑으로 반 줄이기
			} else { // 중간 값이 숫자보다 작거나 같으면
				low = mid + 1; // 범위 위로 반 줄이기
			}
		}
		return low; // 끝나는 위치 리턴
	}
}
