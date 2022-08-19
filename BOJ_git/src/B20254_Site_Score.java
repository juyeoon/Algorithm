import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 주어진 수식을 그대로 구현
public class B20254_Site_Score {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int UR = Integer.parseInt(s[0]);
		int TR = Integer.parseInt(s[1]);
		int UO = Integer.parseInt(s[2]);
		int TO = Integer.parseInt(s[3]);
		System.out.println(56 * UR + 24 * TR + 14 * UO + 6 * TO); // 출력
	}
}
