import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/24768
// 달콤한 꿀 개수와 신 꿀 개수가 주어졌을 때 조건에 맞게 문자열을 출력하는 문제
public class B24768_Left_Beehind {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0 0")) { // EOI
			StringTokenizer st = new StringTokenizer(s);
			int x = Integer.parseInt(st.nextToken()); // 달콤한 꿀 개수
			int y = Integer.parseInt(st.nextToken()); // 신 꿀 개수
			if (x + y == 13) {
				sb.append("Never speak again.\n");
			} else if (x == y) {
				sb.append("Undecided.\n");
			} else if (x > y) {
				sb.append("To the convention.\n");
			} else {
				sb.append("Left beehind.\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
