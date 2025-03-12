import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 자리 수에 해당하는 값을 곱함
public class B2745_진법_변환 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String N = st.nextToken(); // 수
		int B = Integer.parseInt(st.nextToken()); // 진법
		long num = 0; // 10진수
		long j = 1; // 자리 수 값
		for (int i = N.length() - 1; i >= 0; i--) {
			char c = N.charAt(i);
			if (c <= 57) { // 0~9
				num += ((int) c - 48) * j;
			} else { // A~Z
				num += ((int) c - 55) * j;
			}
			j *= B; // 자리 수 갱신
		}
		System.out.println(num);
		br.close();
	}
}
