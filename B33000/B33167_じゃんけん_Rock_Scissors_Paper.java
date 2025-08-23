import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/33167
// Aoi 승 조건: (S, P) → 가위가 보를 이김
// Bitaro 승 조건: (R, P) → 보가 바위를 이김, (S, R) → 바위가 가위를 이김
public class B33167_じゃんけん_Rock_Scissors_Paper {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine(); // Aoi의 손동작
		String T = br.readLine(); // Bitaro의 손동작
		int aWin = 0; // Aoi 승 수
		int bWin = 0; // Bitaro 승 수
		for (int i = 0; i < N; i++) {
			char a = S.charAt(i);
			char b = T.charAt(i);
			if (a == 'S' && b == 'P') { // Aoi 승: (S, P)
				aWin++;
			}
			// Bitaro 승: (R, P) 또는 (S, R)
			else if ((a == 'R' && b == 'P') || (a == 'S' && b == 'R')) {
				bWin++;
			}
		}
		System.out.println(aWin + " " + bWin); // 출력
		br.close();
	}
}
