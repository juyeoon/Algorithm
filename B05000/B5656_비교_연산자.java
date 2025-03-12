import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 입력받은 식의 연산자에 따라(if-else 조건 분기) 만들어진 식이 맞으면 true, 아니면 false 출력
public class B5656_비교_연산자 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = 1; // 테스트케이스 번호
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken()); // 피연산자 A
			String operator = st.nextToken(); // 연산자
			int B = Integer.parseInt(st.nextToken()); // 피연산자 B
			if (operator.equals("E")) { // 반복문 종료 조건
				break;
			}
			sb.append("Case ").append(tc++).append(": "); // 출력 양식
			// 연산자에 따라 만들어진 식이 맞으면 true, 아니면 false 출력
			if (operator.equals(">")) {
				sb.append(A > B ? "true" : "false");
			} else if (operator.equals(">=")) {
				sb.append(A >= B ? "true" : "false");
			} else if (operator.equals("<")) {
				sb.append(A < B ? "true" : "false");
			} else if (operator.equals("<=")) {
				sb.append(A <= B ? "true" : "false");
			} else if (operator.equals("==")) {
				sb.append(A == B ? "true" : "false");
			} else {
				sb.append(A != B ? "true" : "false");
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}