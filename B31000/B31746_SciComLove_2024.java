import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 뒤집는 횟수(N)가 짝수면 원문 그대로 출력, 홀수면 뒤집어서 출력
// StringBuilder.reverse()를 사용하여 문자열 뒤집기
public class B31746_SciComLove_2024 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 뒤집는 횟수
		sb.append("SciComLove");
		if (N % 2 == 1) { // 뒤집어야 하면 (뒤집는 횟수가 홀수)
			sb.reverse();
		}
		System.out.println(sb); // 출력
		br.close();
	}
}