import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/5356
// 반복문으로 구현 
public class B5356_Triangles {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 삼각형 개수
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 삼각형 크기
			char C = st.nextToken().charAt(0); // 시작할 문자
			for (int i = 1; i <= N; i++) {
				if (C > 'Z') { // 'Z' 다음에 'A'가 오게
					C = 'A';
				}
				for (int j = 0; j < i; j++) { // 삼각형 그리기
					sb.append(C);
				}
				C++;
				sb.append("\n");
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
