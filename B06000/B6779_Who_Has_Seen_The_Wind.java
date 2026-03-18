import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 6779 - Who Has Seen The Wind
// https://www.acmicpc.net/problem/6779
public class B6779_Who_Has_Seen_The_Wind {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int h = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int result = -1;
		for (int t = 1; t <= m; t++) {
			int altitude = -6 * t * t * t * t + h * t * t * t + 2 * t * t + t;
			if (altitude <= 0) {
				result = t;
				break;
			}
		}
		if (result != -1) {
			System.out.println("The balloon first touches ground at hour: " + result);
		} else {
			System.out.println("The balloon does not touch ground in the given time.");
		}
		br.close();
	}
}
