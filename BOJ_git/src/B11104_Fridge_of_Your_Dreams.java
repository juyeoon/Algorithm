import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2진수를 10진수로 변환하여 출력하는 문제
// Integer.parseInt(String, 2)로 변환
public class B11104_Fridge_of_Your_Dreams {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 입력 라인 수
		for (int i = 0; i < N; i++) {
			sb.append(Integer.parseInt(br.readLine(), 2)).append("\n"); // 2진수 -> 10진수
		}
		System.out.println(sb); // 출력
		br.close();
	}
}