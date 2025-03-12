import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 2차원 배열 정렬
public class B11651_좌표_정렬하기2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[][] xy = new int[N][2]; // [][0]: x, [][1]: y
		for (int i = 0; i < N; i++) {
			String[] s = br.readLine().split(" ");
			xy[i][0] = Integer.parseInt(s[0]);
			xy[i][1] = Integer.parseInt(s[1]);
		} // input
			// 2차원 배열 정렬하기 (y 증가순으로, 같으면 x 증가순으로)
		Arrays.sort(xy, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				} else {
					return o1[1] - o2[1];
				}
			}
		});
		// 출력
		for (int i = 0; i < N; i++) {
			sb.append(xy[i][0]).append(" ").append(xy[i][1]).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
