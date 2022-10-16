import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 대각선 길이(피타고라스)보다 작으면 박스에 넣을 수 있음
public class B3034_앵그리_창영 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 성냥 개수
		int W = Integer.parseInt(s[1]); // 가로
		int H = Integer.parseInt(s[2]); // 세로
		double diagonal = Math.sqrt(W * W + H * H); // 대각선 길이
		for (int i = 0; i < N; i++) {
			// 대각선 보다 길거나 같으면 넣을 수 있음
			sb.append((diagonal >= Integer.parseInt(br.readLine())) ? "DA\n" : "NE\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}