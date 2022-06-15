import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 진짜 약수 중 최소값와 최대값을 곱하면 N을 구할 수 있다.
public class B1037_약수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine()); // 진짜 약수의 개수
		int min = Integer.MAX_VALUE; // 진짜 약수 중 최솟값
		int max = Integer.MIN_VALUE; // 진짜 약수 중 최댓값
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) { // 진짜 약수 개수만큼 반복
			int temp = Integer.parseInt(st.nextToken()); // 진짜 약수 하나
			min = Math.min(min, temp); // 최솟값 세팅
			max = Math.max(max, temp); // 최댓값 세팅
		}
		System.out.println(min * max); // min * max = Ns
		br.close();
	}
}
