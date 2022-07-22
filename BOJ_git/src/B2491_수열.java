import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2491_수열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 수열의 길이
		int n[] = new int[N]; // 숫자
		String s[] = br.readLine().split(" ");
		for (int i = 0; i < N; i++) { // input n[]
			n[i] = Integer.parseInt(s[i]);
		}
		int maxIn = 1; // 최대로 증가한 길이
		int maxDe = 1; // 최대로 감소한 길이
		int cntIn = 1; // 연속으로 증가한 길이
		int cntDe = 1; // 연속으로 감소한 길이
		for (int i = 0; i < N - 1; i++) { // 수열의 길이 -1만큼 반복
			if (n[i] <= n[i + 1]) { // 증가
				cntIn++; // 카운트 증가
				maxIn = Math.max(maxIn, cntIn); // 최대 증가 길이 갱신

			} else {
				cntIn = 1; // 카운트 리셋
			}
			if (n[i] >= n[i + 1]) { // 감소
				cntDe++; // 카운트 증가
				maxDe = Math.max(maxDe, cntDe); // 최대 감소 길이 갱신

			} else {
				cntDe = 1; // 카운트 리셋
			}
		}
		System.out.println(Math.max(maxIn, maxDe)); // 최대 증가 길이, 최대 감소 길이 중 큰 것 출력
		br.close();
	}
}
