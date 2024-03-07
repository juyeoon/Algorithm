import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이중 for문으로 X 찍기
public class B10188_Quadrilateral {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 데이터 세트 개수
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int w = Integer.parseInt(st.nextToken()); // 가로 X개수
			int h = Integer.parseInt(st.nextToken()); // 세로 X 개수
			for (int i = 0; i < h; i++) { // X 찍기(행 바꿈)
				for (int j = 0; j < w; j++) { // (열 바꿈)
					sb.append('X');
				}
				sb.append("\n");
			}
			sb.append("\n");

		}
		System.out.println(sb); // 출력
		br.close();
	}
}