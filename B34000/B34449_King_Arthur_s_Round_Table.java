import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34449
// (기사 수) * (한 사람당 필요한 공간) <= (원주)면 가능
public class B34449_King_Arthur_s_Round_Table {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double d = Double.parseDouble(br.readLine()); // 테이블의 지름
		double w = Double.parseDouble(br.readLine()); // 한 사람당 필요한 공간
		int n = Integer.parseInt(br.readLine()); // 기사 수
		System.out.println((w * n <= d * 3.14159) ? "YES" : "NO");
		br.close();
	}
}
