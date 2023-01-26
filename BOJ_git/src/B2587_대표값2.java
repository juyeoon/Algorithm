import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 평균 => 입력값의 합 / 5
// 중앙값 => 입력값을 오름차순으로 정렬했을 때 세 번째 값
public class B2587_대표값2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num[] = new int[5]; // 입력 받은 값
		int sum = 0; // 입력값의 합
		for (int i = 0; i < 5; i++) {
			num[i] = Integer.parseInt(br.readLine()); // 입력 받은 값 저장
			sum += num[i]; // 합 갱신
		}
		System.out.println(sum / 5); // 평균
		Arrays.sort(num); // 오름차순으로 입력값 정렬
		System.out.println(num[2]); // 중앙값
		br.close();
	}
}