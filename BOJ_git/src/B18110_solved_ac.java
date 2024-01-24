import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 제외되는 의견 수 (상위 또는 하위) = 난이도 의견 개수 * 0.15
// 난이도 의견을 오름차순으로 정렬 후 가장 낮은 값과 가장 큰 값을 제외되는 의견 수만큼 제외하고 합을 구한 후 
// (난이도 의견 개수 - 2 * 난이도 의견 개수 * 0.15)로 나눈 값을 반올림하여 출력
public class B18110_solved_ac {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 난이도 의견 개수
		int del = (int) Math.round(N * 0.15); // 제외되는 의견 (상위 또는 하위)
		int num[] = new int[N]; // 난이도 의견
		for (int i = 0; i < N; i++) { // num[] 채우기
			num[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(num); // 난이도 의견 오름차순 정렬
		long sum = 0; // 제외되는 의견 외의 난이도 합
		for (int i = del; i < N - del; i++) { // sum 구하기
			sum += num[i];
		}
		System.out.println(Math.round(sum / (double) (N - del * 2))); // 난이도 평균(반올림) 출력
		br.close();
	}
}