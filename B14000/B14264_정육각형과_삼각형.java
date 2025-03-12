import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 삼각비를 이용한 문제
// 4개의 삼각형 중에 면적이 제일 작은 삼각형의 면적의 최댓값은
// (3의 제곱근*L) * (L/2) * (1/2) = 3의 제곱근*L^2/4
public class B14264_정육각형과_삼각형 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine()); // 육각형 한 변의 길이
		System.out.println(Math.sqrt(3) * L * L / 4); // 최댓값 출력
		br.close();
	}
}