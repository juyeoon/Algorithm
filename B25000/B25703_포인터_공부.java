import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 출력문의 규칙을 찾기
public class B25703_포인터_공부 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // N중 포인터
		sb.append("int a;\n"); // N과 상관없이 항상 있어야하는 문장 추가
		for (int i = 1; i <= N; i++) {
			sb.append("int ");
			for (int j = 0; j < i; j++) { // i개수만큼 *추가
				sb.append("*");
			}
			sb.append("ptr");
			if (i == 1) { // 두 번째 문장
				sb.append(" = &a;\n");
			} else if (i == 2) { // 세 번째 문장
				sb.append(i).append(" = &ptr;\n");
			} else { // 그 이후 문장
				sb.append(i).append(" = &ptr").append(i - 1).append(";\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}