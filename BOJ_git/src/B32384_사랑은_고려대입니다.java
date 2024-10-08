import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열을 변수에 저장하여 입력받은 정수만큼 반복하여 출력
public class B32384_사랑은_고려대입니다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 반복 횟수
		String s = "LoveisKoreaUniversity "; // 반복할 문자열
		for (int i = 0; i < N; i++) { // N번 반복
			sb.append(s); // 문자열을 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}