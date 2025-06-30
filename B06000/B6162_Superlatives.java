import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/6162
// 예상 강수량(E)과 실제 강수량(A)에 대해서 
// E ≤ A이면 "no drought", 그렇지 않으면 5배마다 "mega"를 하나씩 붙임
// 반복문을 통해 E > m*A 인 동안 "mega"를 추가하며 m *= 5로 확장
public class B6162_Superlatives {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine()); // 데이터 세트 개수
		for (int ds = 1; ds <= K; ds++) {
			sb.append("Data Set ").append(ds).append(":\n"); // 출력 양식
			StringTokenizer st = new StringTokenizer(br.readLine());
			int E = Integer.parseInt(st.nextToken()); // 예상 강수량
			int A = Integer.parseInt(st.nextToken()); // 실제 강수량
			if (E <= A) { // 예상 강수량보다 실제 강수량이 많음
				sb.append("no ");
			} else {
				int m = 5; // 배수가 5배씩 증가함
				while (true) {
					if (E <= m * A) { // 실제 강수량의 다음 범위 이하면 반복문 끝
						break;
					}
					sb.append("mega "); // 해당 범위를 넘어가면 mega 추가
					m *= 5; // 범위 넘기기
				}
			}
			sb.append("drought\n\n"); // 공통된 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
