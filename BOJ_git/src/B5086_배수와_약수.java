import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 큰 수 % 작은 수 != 0이면 배수약수 둘 다 아님
// 그 외의 경우
// 첫 번째 수가 더 크면 배수
// 두 번째 수가 더 크면 약수
public class B5086_배수와_약수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		while (!(s = br.readLine()).equals("0 0")) { // 0 0 들어올 때까지 반복
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken()); // 첫 번째 수
			int b = Integer.parseInt(st.nextToken()); // 두 번째 수
			String rel = "neither"; // 기본은 둘 다 아님
			if (a > b && a % b == 0) { // 첫 번째 수가 더 크고 나머지가 0이면
				rel = "multiple"; // 배수
			} else if (b > a && b % a == 0) { // 두 번째 수가 더 크고 나머지가 0이면
				rel = "factor"; // 약수
			}
			sb.append(rel).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}