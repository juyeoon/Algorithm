import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/13222
// 성냥이 상자의 대각선 길이-(가로*가로+세로*세로)의 제곱근-보다 짧으면 상자에 넣을 수 있음
public class B13222_Matches {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 성냥 개수
		int W = Integer.parseInt(st.nextToken()); // 성냥 상자 가로 길이
		int H = Integer.parseInt(st.nextToken()); // 성냥 상자 세로 길이
		double diagonal = W * W + H * H; // 대각선 길이
		diagonal = Math.sqrt(diagonal);
		for (int i = 0; i < N; i++) {
			int leng = Integer.parseInt(br.readLine()); // 성냥 길이
			if (diagonal >= leng) { // 대각선보다 짧으면 가능
				sb.append("YES\n");
			} else {
				sb.append("NO\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
