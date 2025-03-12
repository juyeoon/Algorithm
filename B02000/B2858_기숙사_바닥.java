import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 빨간색 타일 개수  = L * 2 + (W - 2) * 2
// 갈색 타일 개수 = (L - 2) + (W - 2)
// L-2와 W-2 값을 변수로 둔 후 L-2의 최댓값과 W-2의 최솟값을 시작으로 반복문을 돌면서 L-2와 W-2를 곱한 값이 B와 같을 때 반복문 탈출
public class B2858_기숙사_바닥 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int R = Integer.parseInt(s[0]); // 빨간 타일 개수
		int B = Integer.parseInt(s[1]); // 갈색 타일 개수
		int addVal = (R - 4) / 2; // (L-2)+(W-2)값
		int mulVal = B; // (L-2)*(W-2)값
		int L_2 = addVal - 1; // L-2값, 초기값은 최댓값
		int W_2 = 1; // W-2값, 초기값은 최솟값
		while (W_2 < addVal) { // W-2가 최댓값을 넘어가지 않을 때만 반복
			if (L_2 * W_2 == mulVal) { // 곱한 값이 B와 같으면
				break; // 반복문 탈출
			}
			L_2--; // 다음 값으로
			W_2++; // 다음 값으로
		}
		System.out.println((L_2 + 2) + " " + (W_2 + 2)); // 출력
		br.close();
	}
}