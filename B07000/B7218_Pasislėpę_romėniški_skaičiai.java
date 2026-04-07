import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/7218
public class B7218_Pasislėpę_romėniški_skaičiai {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		String[] roman = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII" };
		for (int i = 1; i <= 12; i++) {
			if (s.contains(roman[i])) {
				sb.append(i).append(" ");
			}
		}
		System.out.println(sb.toString());
		br.close();
	}
}
