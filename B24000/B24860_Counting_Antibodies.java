import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// (첫째줄 + 둘째줄) * 셋째줄
public class B24860_Counting_Antibodies {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		long chain[] = new long[3];
		for (int i = 0; i < 3; i++) { // 줄 수
			st = new StringTokenizer(br.readLine());
			long temp = 1;
			for (int j = st.countTokens(); j > 0; j--) {
				temp *= Integer.parseInt(st.nextToken()); // 한 줄에 있는 숫자 곱하기
			}
			chain[i] = temp;
		}
		System.out.println((chain[0] + chain[1]) * chain[2]); // 생산할 수 있는 면역글로불린 변이체의 수
		br.close();
	}
}
