import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2^0(value)부터 입력값(N)과 value가 동일한지 확인하면서
// N이 value보다 클 때까지 value에 2를 곱해가며 동일한지 확인 
public class B11966_2의_제곱인가 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 입력값
		int value = 1; // 2의 제곱수
		boolean power2 = false; // 입력값이 2의 제곱수인지 확인(true: 2의 제곱수가 맞음)
		while (N >= value) { // N이 더 크면 2의 제곱수일 수 없음
			if (N == value) {// 2의 제곱수이면
				power2 = true;
				break; // 반복문 탈출
			}
			value *= 2; // 다음 2의 제곱수로
		}
		System.out.println(power2 ? 1 : 0); // 출력
		br.close();
	}
}