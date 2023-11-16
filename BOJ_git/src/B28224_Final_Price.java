import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N개의 정수 더하기
public class B28224_Final_Price {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 입력값 개수
		int sum = 0; // 입력값 합
		for (int i = 0; i < N; i++) { // 합 구하기
			sum += Integer.parseInt(br.readLine());
		}
		System.out.println(sum); // 출력
		br.close();
	}
}