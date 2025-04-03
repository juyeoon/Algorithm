import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/25285
// 주어진 조건에 맞춰 if-else문으로 조건 분기
public class B25285_심준의_병역판정검사 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double height = Double.parseDouble(st.nextToken()); // 키
			double weight = Double.parseDouble(st.nextToken()); // 몸무게
			double BMI = weight / Math.pow(height * 0.01, 2); // BMI
			// 주어진대로 조건 분기
			if (height < 140.1) {
				sb.append(6);
			} else if (height < 146) {
				sb.append(5);
			} else if (height < 159) {
				sb.append(4);
			} else if (height < 161) {
				if (BMI > 16.0 && BMI < 35.0) {
					sb.append(3);
				} else {
					sb.append(4);
				}
			} else if (height < 204) {
				if (BMI >= 20.0 && BMI < 25.0) {
					sb.append(1);
				} else if ((BMI >= 18.5 && BMI < 20.0) || (BMI >= 25.0 && BMI < 30.0)) {
					sb.append(2);
				} else if ((BMI >= 16.0 && BMI < 18.5) || (BMI >= 30.0 && BMI < 35.0)) {
					sb.append(3);
				} else {
					sb.append(4);
				}

			} else {
				sb.append(4);
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
