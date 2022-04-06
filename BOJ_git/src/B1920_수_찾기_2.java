import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이진탐색 - Arrays.binarySearch() 사용
// 56692 KB 528 ms
public class B1920_수_찾기_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()); // 정수 개수
		st = new StringTokenizer(br.readLine()); // 정수(input) 배열
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		} // input
		Arrays.sort(arr); // 정렬
		int M = Integer.parseInt(br.readLine()); // 확인할 수 개수
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			sb.append(Arrays.binarySearch(arr, Integer.parseInt(st.nextToken())) < 0 ? "0\n" : "1\n");
		} // 이진 탐색
		System.out.println(sb);
		br.close();
	}
}
