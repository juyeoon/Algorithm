import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/22279
// QALY = (삶의 질 + 연도 수)의 합
public class B22279_Quality_Adjusted_Life_Year {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // QALY를 계산할 기간
		double sum = 0; // QALY
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double a = Double.parseDouble(st.nextToken()); // 삶의 질
			double b = Double.parseDouble(st.nextToken()); // 연도 수
			sum += a * b; // QALY 갱신
		}
		System.out.println(sum); // 출력
		br.close();
	}
}
