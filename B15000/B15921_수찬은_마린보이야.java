import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 연습 기록 개수가 0이면 분모가 0이므로 "divide by zero" 출력
// 연습 기록 개수가 0이 아닌 값이면 어떤 값이든 (연습 기록들의 평균값)과 (연습 기록들 중 하나를 균일한 확률로 뽑을 때의 기댓값)은 같기 때문에 1.00
public class B15921_수찬은_마린보이야 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 연습 기록 개수
		System.out.println((N == 0) ? "divide by zero" : "1.00"); // 연습 기록 개수에 따른 출력
		br.close();
	}
}