import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 30395 - 내 스트릭을 돌려내!
// https://www.acmicpc.net/problem/30395
public class B30395_내_스트릭을_돌려내 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int currentStreak = 0;
		int maxStreak = 0;
		int cooldown = 0;
		for (int i = 0; i < N; i++) {
			int p = Integer.parseInt(st.nextToken());
			if (p > 0) {
				currentStreak++;
				if (currentStreak > maxStreak) {
					maxStreak = currentStreak;
				}
				if (cooldown > 0) {
					cooldown--;
				}
			} else {
				if (cooldown == 0) {
					cooldown = 1;
				} else {
					currentStreak = 0;
					cooldown = 0;
				}
			}
		}
		System.out.println(maxStreak);
		br.close();
	}
}
