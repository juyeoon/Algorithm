import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 판별할 수를 문자열로 입력 받은 후 문자마다 홀짝을 판별하고 각각의 변수에 저장, 변수 값 비교 후 출력
public class B31867_홀짝홀짝 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String K = br.readLine(); // 판별할 수
		int odd = 0; // 홀수 개수
		int even = 0; // 짝수 개수
		for (int i = 0; i < N; i++) { // 홀짝 개수 구하기
			char c = K.charAt(i);
			if (c == '0' || c == '2' || c == '4' || c == '6' || c == '8') {
				even++;
			} else {
				odd++;
			}
		}
		if (even > odd) { // 짝짝수
			System.out.println(0);
		} else if (even < odd) { // 홀홀수
			System.out.println(1);
		} else {
			System.out.println(-1);
		}
		br.close();
	}
}