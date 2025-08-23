import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/14209
// 조건 분기로 모든 패의 점수를 합산하여 출력
public class B14209_Bridž {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 카드 패를 받은 횟수
		long total = 0; // 전체 명예 점수 합계
		for (int i = 0; i < N; i++) {
			String s = br.readLine(); // 카드 패
			for (int j = 0; j < s.length(); j++) { // 점수 합산
				char c = s.charAt(j);
				switch (c) {
				case 'A':
					total += 4;
					break;
				case 'K':
					total += 3;
					break;
				case 'Q':
					total += 2;
					break;
				case 'J':
					total += 1;
					break;
				}
			}
		}
		System.out.println(total); // 출력
		br.close();
	}
}
