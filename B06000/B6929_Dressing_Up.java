import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/6929
public class B6929_Dressing_Up {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int H = Integer.parseInt(br.readLine());
		int width = 2 * H; // 전체 열의 길이
		for (int i = 0; i < H; i++) {
			int star = (i <= H / 2) ? (2 * i + 1) : (2 * (H - i - 1) + 1); // 별의 개수
			int space = width - (2 * star); // 가운데 공백의 개수
			for (int j = 0; j < star; j++) { // 왼쪽 별
				sb.append('*');
			}
			for (int j = 0; j < space; j++) { // 가운데 공백
				sb.append(' ');
			}
			for (int j = 0; j < star; j++) { // 오른쪽 별
				sb.append('*');
			}
			sb.append("\n");
		}
		System.out.print(sb); // 출력
		br.close();
	}
}
