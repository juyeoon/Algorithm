import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 6830 - It’s Cold Here!
// https://www.acmicpc.net/problem/6830
public class B6830_It_s_Cold_Here {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String coldestCity = "";
		int minTmp = Integer.MAX_VALUE;
		while (true) {
			String s = br.readLine();
			String[] parts = s.split(" ");
			String city = parts[0];
			int tmp = Integer.parseInt(parts[1]);
			if (tmp < minTmp) {
				minTmp = tmp;
				coldestCity = city;
			}
			if (city.equals("Waterloo")) {
				break;
			}
		}
		System.out.println(coldestCity);
		br.close();
	}
}
