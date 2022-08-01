import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 요리시간을 큰 시간부터 나누고 나머지를 다음 큰 시간으로 나눔
// 마지막에 나머지가 있으면 -1
public class B10162_전자레인지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine()); // 요리시간

		int A = T / 300; // 5분
		T %= 300; // 나머지
		int B = T / 60; // 1분
		T %= 60; // 나머지
		int C = T / 10; // 10초
		T %= 10; // 나머지

		if (T != 0) { // 나머지가 있으면 불가능
			System.out.println(-1); // -1출력
		} else {
			sb.append(A).append(" ").append(B).append(" ").append(C); // 각각의 횟수 출력
			System.out.println(sb);
		}
		br.close();
	}
}