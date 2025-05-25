import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/21105
// C = 100% * (P - O) / O를 정리하면 O = P / (1 + (C / 100))
public class B21105_New_Financial_Year {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 도넛 맛의 개수
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double P = Double.parseDouble(st.nextToken()); // 새로운 가격
			double C = Double.parseDouble(st.nextToken()); // 가격 변화
			double O = P / (1 + C / 100); // 원래 가격
			sb.append(String.format("%.9f\n", O)); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
