import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/30403
public class B30403_무지개_만들기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		boolean[][] rainbow = new boolean[2][26];
		for (int i = 0; i < N; i++) {
			char c = s.charAt(i);
			if (c < 97) {
				rainbow[0][c - 65] = true;
			} else {
				rainbow[1][c - 97] = true;
			}
		}
		boolean upper = false;
		boolean lower = false;
		if (rainbow[0]['R' - 65] 
				&& rainbow[0]['O' - 65] 
				&& rainbow[0]['Y' - 65]
				&& rainbow[0]['G' - 65] 
				&& rainbow[0]['B' - 65] 
				&& rainbow[0]['I' - 65]
				&& rainbow[0]['V' - 65]) {
			upper = true;
		}
		if (rainbow[1]['r' - 97] 
				&& rainbow[1]['o' - 97] 
				&& rainbow[1]['y' - 97]
				&& rainbow[1]['g' - 97] 
				&& rainbow[1]['b' - 97] 
				&& rainbow[1]['i' - 97]
				&& rainbow[1]['v' - 97]) {
			lower = true;
		}
		if (upper && lower) {
			System.out.println("YeS");
		} else if (upper) {
			System.out.println("YES");
		} else if (lower) {
			System.out.println("yes");
		} else {
			System.out.println("NO!");
		}
		br.close();
	}
}
