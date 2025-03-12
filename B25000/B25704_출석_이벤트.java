import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 사용할 수 있는 최대 쿠폰 수에서 5장씩 줄여가면서 최대 할인값 구하기
public class B25704_출석_이벤트 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 쿠폰 개수
		int P = Integer.parseInt(br.readLine()); // 원가격
		int max = 0; // 최대 할인 값
		int tmp = N / 5 * 5; // 사용할 수 있는 최대 쿠폰 수
		for (; tmp > 0; tmp -= 5) { // 쿠폰 5장씩 줄이기
			// 쿠폰 혜택에 따라 최대 할인값 갱신
			if (tmp == 5) { 
				max = Math.max(max, 500);
			} else if (tmp == 10) {
				max = Math.max(max, P * 10 / 100);
			} else if (tmp == 15) {
				max = Math.max(max, 2000);
			} else if (tmp == 20) {
				max = Math.max(max, P * 25 / 100);
			}
		}
		System.out.println((P - max < 0) ? 0 : P - max); // 지불 최솟값 출력
		br.close();
	}
}
