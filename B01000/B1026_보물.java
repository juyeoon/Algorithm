import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

// 배열을 오름차순과 내림차순으로 정렬하여 곱하면 합은 최소가 됨
public class B1026_보물 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s1[] = br.readLine().split(" "); // 정수 배열 A의 입력값
		String s2[] = br.readLine().split(" "); // 정수 배열 B의 입력값
		Integer A[] = new Integer[N]; // 정수 배열 A
		Integer B[] = new Integer[N]; // 정수 배열 B
		for (int i = 0; i < N; i++) { // input
			A[i] = Integer.parseInt(s1[i]);
			B[i] = Integer.parseInt(s2[i]);
		}
		Arrays.sort(A); // 오름차순으로 정렬
		Arrays.sort(B, Collections.reverseOrder()); // 내림차순으로 정렬
		int result = 0; // 답
		for (int i = 0; i < N; i++) {
			result += A[i] * B[i]; // 가장 작은 값과 가장 큰 값을 곱하여 더하기
		}
		System.out.println(result); // 결과 출력
		br.close();
	}
}
