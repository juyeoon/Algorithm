import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// (원의 지름 >= 직사각형의 대각선의 길이)면 피자가 식탁 위에 놓여질 수 있음
public class B6502_동혁_피자 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		int tc = 1; // 출력 형식에 필요 (피자 num)
		while (!(s = br.readLine()).equals("0")) { // EOI
			sb.append("Pizza ").append(tc++).append(" ");
			st = new StringTokenizer(s);
			int r = Integer.parseInt(st.nextToken()); // 식탁 반지름
			int w = Integer.parseInt(st.nextToken()); // 피자 가로 길이
			int l = Integer.parseInt(st.nextToken()); // 피자 세로 길이
			if (r * 2 >= Math.sqrt(w * w + l * l)) { // 피자가 식탁에 놓일 수 있음
				sb.append("fits on the table.\n");
			} else { // 피자가 식탁에 놓일 수 없음
				sb.append("does not fit on the table.\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
