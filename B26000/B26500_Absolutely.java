import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 수직선 위의 두 점이 있을 때 두 점 사이의 거리를 소숫점 첫째자리까지 반올림하여 나타내는 문제
// | 한 점 - 다른 한 점 |을 반올림하여 출력
public class B26500_Absolutely {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine()); // 데이터 세트 개수
		for (int tc = 0; tc < n; tc++) {
			st = new StringTokenizer(br.readLine());
			double a = Double.parseDouble(st.nextToken()); // 점 a
			double b = Double.parseDouble(st.nextToken()); // 점 b
			sb.append(String.format("%.1f\n", Math.abs(a - b))); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}