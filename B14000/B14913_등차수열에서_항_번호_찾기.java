import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//등차수열의 n번째 항의 값을 이용하여 n을 계산
// n = (k - a) / d + 1
// n이 0이하거나 실수면 k는 존재할 수 없음
public class B14913_등차수열에서_항_번호_찾기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()); // 첫 항
		double d = Double.parseDouble(st.nextToken()); // 공차
		int k = Integer.parseInt(st.nextToken()); // 찾는 수
		double n = (k - a) / d + 1; // k가 n번째 항 가능한 n의 값
		if (n <= 0 || n % 1 != 0.0) { // k가 존재할 수 없는 조건
			System.out.println("X");
		} else { // n이 유효한 정수일 경우
			System.out.println((int) n);
		}
		br.close();
	}
}
