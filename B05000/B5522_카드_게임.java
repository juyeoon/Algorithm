import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 점수 5번 더하기
public class B5522_카드_게임 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0; // 점수 총점
		for (int i = 0; i < 5; i++) {
			sum += Integer.parseInt(br.readLine()); // 점수 더하기
		}
		System.out.println(sum); // 출력
		br.close();
	}
}
