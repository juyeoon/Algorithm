import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이차방정식의 해를 구하는 문제 => 근의 공식으로 사용
// x^2  + 2Ax + B = 0일 때 x = -A+-√(A^2-B)
public class B17945_통학의_신 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		// x^2 + 2Ax + B = 0의 두 개수 입력
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int sqrt = (int) (Math.sqrt(A * A - B)); // 근의 공식에서의 제곱근의 값
		if (sqrt == 0) { // 제곱근이 0이면 중근
			sb.append(-A); // 한 값 출력
		} else { // 두 값 출력
			sb.append(-A - sqrt).append(" ").append(-A + sqrt);
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
