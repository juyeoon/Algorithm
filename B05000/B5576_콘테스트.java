import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B5576_콘테스트 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int W[] = new int[10]; // W 대학 점수
		int K[] = new int[10]; // K 대학 점수
		for (int i = 0; i < 10; i++) { // input W[]
			W[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < 10; i++) { // input K[]
			K[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(W); // W 오름차순 정렬
		Arrays.sort(K); // K 오름차순 정렬
		int sumW = W[9] + W[8] + W[7]; // W 대학 최고점 3개 합
		int sumK = K[9] + K[8] + K[7]; // K 대학 최고점 3개 합
		System.out.println(sumW + " " + sumK); // 출력
		br.close();
	}
}