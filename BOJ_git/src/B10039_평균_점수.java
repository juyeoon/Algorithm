import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 40 미만인 점수만 40 더해서 평균 구하기
public class B10039_평균_점수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int score = Integer.parseInt(br.readLine());
			sum += score < 40 ? 40 : score;
		}
		System.out.println((int) (sum / 5));
		br.close();
	}
}
