import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 5343 - Parity Bit
// https://www.acmicpc.net/problem/5343
public class B5343_Parity_Bit {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			int errorCnt = 0;
			for (int i = 0; i < s.length(); i += 8) {
				int oneCnt = 0;
				for (int j = 0; j < 7; j++) {
					if (s.charAt(i + j) == '1') {
						oneCnt++;
					}
				}
				char parityBit = s.charAt(i + 7);
				char expectedParity = oneCnt % 2 == 1 ? '1' : '0';
				if (parityBit != expectedParity) {
					errorCnt++;
				}
			}
			sb.append(errorCnt).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
