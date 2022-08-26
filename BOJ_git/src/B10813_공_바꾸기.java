import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// swap하는 문제
public class B10813_공_바꾸기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 공 개수 (1~N번)
		int M = Integer.parseInt(st.nextToken()); // 교환 수
		int basket[] = new int[N + 1]; // 바구니 (인덱스 번호가 바구니 번호, 값이 공)
		for (int i = 1; i <= N; i++) { // input basket[]
			basket[i] = i;
		}
		for (int i = 0; i < M; i++) { // 공 교환
			st = new StringTokenizer(br.readLine());
			swap(basket, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		for (int i = 1; i <= N; i++) { // 출력을 위해 sb에 저장
			sb.append(basket[i]).append(" ");
		}
		System.out.println(sb); // 출력
		br.close();
	}

	// 값 교환 메서드 (arr[i]와 arr[j]를 교환)
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}