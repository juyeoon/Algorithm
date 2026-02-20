import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 32778 - 가희와 부역명
// https://www.acmicpc.net/problem/32778
public class B32778_가희와_부역명 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int open = s.indexOf('(');
		if (open == -1) {
			System.out.println(s);
			System.out.println("-");
			return;
		}
		String stationName = s.substring(0, open).trim();
		int close = s.lastIndexOf(')');
		String subStationName = s.substring(open + 1, close);
		System.out.println(stationName);
		System.out.println(subStationName);
		br.close();
	}
}
