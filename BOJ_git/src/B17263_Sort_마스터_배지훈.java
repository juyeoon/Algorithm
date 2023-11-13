import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 정렬된  마지막 원소 구하기 => 입력 값 중 최댓값 찾기
public class B17263_Sort_마스터_배지훈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 원소 개수
		int max = Integer.MIN_VALUE; // 최댓값
		String s[] = br.readLine().split(" "); // 입력 값
		for (int i = 0; i < N; i++) { // 최댓값 찾기
			max = Math.max(max, Integer.parseInt(s[i]));
		}
		System.out.println(max); // 출력
		br.close();
	}
}